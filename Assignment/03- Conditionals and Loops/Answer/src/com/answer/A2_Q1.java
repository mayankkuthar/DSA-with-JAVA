package com.answer;

import java.util.Scanner;

// Factorial of a number, only works till 20
public class A2_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        long fact =1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" : "+fact);
    }
}
