package com.ultralesson.javaPlayground;

import java.util.Arrays;

public class FindSubArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,3,8)));

        //Arrays.toString => creates a string copy of the given array including commas and brackets
        //Arrays.copyOfRange => creates a subarray in the given range of the original array.

    }
}
