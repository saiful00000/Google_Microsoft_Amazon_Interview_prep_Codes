package google;

public class CountOfStringsThatCanBeFormadeByabc {

    public static int countNumOfString(int n, int bcount, int cCount) {
        if (bcount < 0 || cCount < 0)
            return 0;
        if (n == 0)
            return 1;
        if (bcount == 0 && cCount == 0)
            return 1;

        int result = countNumOfString(n-1, bcount, cCount);
        result += countNumOfString(n-1, bcount-1, cCount);
        result += countNumOfString(n-1, bcount, cCount-1);

        return result;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(countNumOfString(n,1,2));
    }
}
