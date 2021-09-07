package com.answer;

import java.util.Scanner;

//Sum of Digits of a number
public class A2_Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        long sum =0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("Sum : "+sum);
    }
}
