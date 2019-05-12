package google;

public class FindLargestWordInDictionaryByDeletingSomeCHars {

    static boolean isSubSequence(String string, String subSec) {
        int stringLen = string.length();
        int subSecLen = subSec.length();

        int j = 0;
        for (int i = 0; i < stringLen && j < subSecLen; i++) {
            if (subSec.charAt(j) == string.charAt(i)) {
                j++;
            }
        }

        return j == subSecLen;
    }

    static String largestWord(String[] dictionary, String string) {
        String result = "";
        int size = 0;
        for (String str : dictionary) {
            if (size < str.length() && isSubSequence(string, str)) {
                result = str;
                size = result.length();
            }
        }
        return result;
    }

    public static void main(String[] aegs) {
        String[] dictionary = {"pintu", "geeksfor", "geeksgeeks"," forgeek"};
        String string = "geeksforgeeks";
        System.out.println(largestWord(dictionary, string));
    }
}
