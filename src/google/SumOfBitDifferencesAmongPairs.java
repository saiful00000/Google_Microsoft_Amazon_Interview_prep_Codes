package google;

public class SumOfBitDifferencesAmongPairs {

    public static int sumOfBitDiff(int array[]) {
        int n = array.length;
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((array[j] & (1 << i)) == 0) {
                    count++;
                }
            }
            sum += count * (n-count) * 2;
        }

        return sum;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3};
        int sum = sumOfBitDiff(array);
        System.out.println("Sum of bit difference are : "+ sum);
    }

}
