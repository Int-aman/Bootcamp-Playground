package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String input = ss.nextLine();
        String input_string = ss.nextLine();

        int first = 0;
        int last = 0;
        int flag = 0;

        for(int i=0;i<input_string.length();++i){
            if(flag ==0 && input_string.charAt(i) == input.charAt(0)){
                first = i;
                flag = 1;
            }
            if(flag == 1 && input_string.charAt(i) == input.charAt(0)){
                last = i;
            }
        }

        System.out.println("First Occurrence :"+first);
        System.out.println("Last Occurrence :"+last);
    }
}
