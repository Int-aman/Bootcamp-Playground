package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class DetectCharInString {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String input = ss.nextLine();
        String input_string = ss.nextLine();
        int flag = 0;

        for(int i=0;i<input_string.length();i++){
            if(input.charAt(0) == input_string.charAt(i)){
                System.out.println(input_string+" contains '"+input.charAt(0)+"'");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(input_string+" does not contain '"+input.charAt(0)+"'");
        }

    }
}
