package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class CalculateBonus1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int salary = ss.nextInt();
        int yearsOfService = ss.nextInt();

        if(yearsOfService > 5)
            System.out.println("Bonus: "+salary*0.05);
        else
            System.out.println("Bonus: 0");
    }
}
