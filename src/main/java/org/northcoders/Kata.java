package org.northcoders;
import java.util.*;
import java.util.List;

public class Kata {
    public int sumNumsBetweenLowHigh(int[] nums){
        //check if nums is/contain null
        if( (nums.length < 3) ) return 0 ;
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
