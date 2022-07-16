package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        char input = ss.next().charAt(0);   // takes the first character of the input string

        if(input >= 'a' && input <= 'z'){
            System.out.println("Lowercase");
        }
        if(input >= 'A' && input <= 'Z'){
            System.out.println("UpperCase");
        }

    }
}
