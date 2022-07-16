package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class ArraySumAndProduct {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int arraySize = ss.nextInt();
        int[] array = new int[arraySize];

        int sum = 0;
        double product = 1;

        for(int i=0;i<arraySize;i++){
            array[i] = ss.nextInt();
            sum += array[i];
            product *= array[i];
        }

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }
}
