package org.example;

import java.util.Arrays;
import java.util.*;

public class ClassWork {
    public static int findDuplo(int [] nums){
        Arrays.sort(nums);
        for (int i = 1; i<=nums.length; i++){
            if (nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] Array = {1, 3, 3, -2, 4, 5};
        int result = findDuplo(Array);
        System.out.println(Arrays.toString(Array));
        System.out.println(result);

    }
}

class DigitFinder {
    public static int[] finder(int nums) {
        if (nums != 0) {
            String fey = Integer.toString(nums);
            String[] str = fey.split("");
            int[] digits = new int[str.length];

            // Parse each string element to an integer and store in the digits array
            for (int i = 0; i < str.length; i++) {
                digits[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(digits);
            for (int i = 0; i<digits.length/2 ; i++){
                int temp = digits[i];
                digits[i] = digits[digits.length-1-i];
                digits[digits.length-1-i] = temp;
            }
            return digits;
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finder(78235)));
    }
}