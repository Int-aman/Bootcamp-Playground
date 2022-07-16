package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class PrintLargest1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();

        if(a>b) System.out.println(a);
        else System.out.println(b);
    }
}
