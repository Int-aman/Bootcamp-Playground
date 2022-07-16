package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num1 = ss.nextInt();
        int num2 = ss.nextInt();

        System.out.println("Product: "+ num1*num2);
    }
}
