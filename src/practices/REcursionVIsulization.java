package practices;

import java.util.Arrays;
import java.util.Scanner;

public class REcursionVIsulization {

    public static void main(String[] args) {

        //rec(3);
        System.out.println(fac(5));

    }

    private static int fac(int n) {
        if (n <= 0) {
            return 1;
        }
        System.out.println(n);
        return n*fac(n-1);
    }

    public static void rec(int n) {
        if (n > 1) {
            System.out.println(n);
            rec(n-1);
        }

        System.out.println(n);

    }

}
