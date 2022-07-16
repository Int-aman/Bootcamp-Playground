package com.ultralesson.javaPlayground;

import java.util.Scanner;

public class LcmAndGcd1 {
    public int calGcd(int a, int b){
        if(a == 0 || b == 0) return a+b;
        return calGcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();

        LcmAndGcd1 ob = new LcmAndGcd1();
        int gcd = ob.calGcd(a,b);
        int lcm = (a*b)/gcd;

        System.out.println("LCM: "+lcm+" GCD: "+gcd);
    }
}
