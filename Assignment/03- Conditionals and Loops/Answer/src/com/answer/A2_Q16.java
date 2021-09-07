package com.answer;

import java.util.Scanner;

// Find nCr and nPr
public class A2_Q16 {
    static long fact(int n){
        long f = 1;
        while(n>0){
            f*=n;
            n-=1;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n and r : ");
        int n = input.nextInt();
        int r = input.nextInt();
        long ncr,npr;
        ncr = (fact(n)/fact(r))/fact(n-r);
        npr = fact(n)/fact(n-r);
        System.out.println("nCr : "+ncr+"\nnPr : "+npr);
    }
}
