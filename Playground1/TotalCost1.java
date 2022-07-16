package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class TotalCost1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int perUnitCost = 100;
        int quantity = ss.nextInt();

        int totalCost = perUnitCost*quantity;
        if(totalCost > 1000)
            System.out.println(totalCost - totalCost*0.1);
        else
            System.out.println(totalCost);

    }
}
