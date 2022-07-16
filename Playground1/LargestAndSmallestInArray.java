package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int arraySize = ss.nextInt();
        int[] array = new int[arraySize];

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arraySize;i++){
            array[i] = ss.nextInt();
            largest = Math.max(largest, array[i]);
            smallest = Math.min(smallest, array[i]);
        }
        System.out.println("Largest Number: "+largest);
        System.out.println("Smallest Number: "+smallest);
    }
}