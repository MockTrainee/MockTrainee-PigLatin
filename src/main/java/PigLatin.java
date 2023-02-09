import java.util.Arrays;
import java.util.ArrayList;

public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        String result = "";

        String firstCharacter = "";

        String[] inArr = in.split("");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < inArr.length; i++) {
            list.add(inArr[i]);
        }
        // remove first character
        firstCharacter = list.remove(0);

        // add first character to end plus ay
        String end = firstCharacter + "ay";
        String[] endSplit = end.split("");

        for (int i = 0; i < endSplit.length; i++) {
            list.add(endSplit[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }
}
