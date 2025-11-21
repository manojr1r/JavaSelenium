package JavaSelenium;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbs = {3,2,4};
        System.out.println(Arrays.toString(twoSum(numbs, 6)));
    }
    public static int[] twoSum(int[] numbs, int target) {

        for (int i = 0; i < numbs.length - 1; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }

    public int[] twoSum2(int[] numbs, int target) {
        int n = numbs.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
