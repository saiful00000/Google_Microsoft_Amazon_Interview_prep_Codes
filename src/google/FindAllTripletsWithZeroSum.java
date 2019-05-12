package google;

import java.util.Arrays;

public class FindAllTripletsWithZeroSum {


    public static void findAllTriplets(int[] array) {
        Arrays.sort(array);
        int len = array.length;
        boolean found = false;

        for (int i = 0; i < len - 1; i++) {
            int left = i + 1;
            int right = len - 1;
            int x = array[i];

            while (left < right) {
                if (x + array[left] + array[right] == 0) {
                    System.out.println(x + " " + array[left] + " " + array[right]);
                    left++;
                    right--;
                    found = true;
                } else if (x + array[left] + array[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        if (!found) {
            System.out.println("No tripltes found.");
        }
    }

    public static void main(String[] args) {
        int[] array = {0, -1, 2, -3, 1};
        findAllTriplets(array);
    }
}
