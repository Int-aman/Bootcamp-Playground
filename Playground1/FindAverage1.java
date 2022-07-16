package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class FindAverage1 {
    public static void main(String[] args) {
        double temp;
        double sum = 0;
        Scanner ss = new Scanner(System.in);
        for(int i=0;i<10;++i){
            temp = ss.nextInt();
            sum += temp;
        }
        double avg = sum/10;
        System.out.println(avg);
    }
}
