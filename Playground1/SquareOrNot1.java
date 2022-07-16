package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class SquareOrNot1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int width = ss.nextInt();
        int breadth = ss.nextInt();

        if(width == breadth)
            System.out.println("It is a Square");
        else
            System.out.println("It is not a Square");
    }
}
