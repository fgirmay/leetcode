package algorithms.easy;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] input = {2, 7, 11, 4, 15};
        int sum = 22;

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.getIndexes(input, sum);

        System.out.println(Arrays.toString(result));

    }

    public int[] getIndexes(int[] input, int sum) {

        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {

            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == sum) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
