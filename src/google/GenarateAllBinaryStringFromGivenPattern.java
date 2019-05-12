package google;

public class GenarateAllBinaryStringFromGivenPattern {

    public static void main(String[] args) {
        String s = "?????";
        printPattern(s.toCharArray(), 0);
    }

    private static void printPattern(char[] chars, int index) {
        if (index == chars.length) {
            System.out.println(chars);
            return;
        }

        if (chars[index] == '?') {
            chars[index] = '0';
            printPattern(chars, index + 1);

            chars[index] = '1';
            printPattern(chars, index + 1);

            chars[index] = '?';
        } else {
            printPattern(chars, index+1);
        }
    }

}
