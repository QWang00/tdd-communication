package org.northcoders;

public class Kata02 {
    public double calculateMean(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // create sum that is set to 0.00 initially
        int sum = 0;
        // iterate over numbers array
        for (int num : nums) {
            // increment sum with each item value
            sum += num;
        }

        // divide it by the length of the numbers array
        double mean = (double) sum / nums.length;

        return mean;
    }
}
