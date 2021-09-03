package com.answer;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class Q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = input.nextInt();
        System.out.println("Enter second number :");
        int num2 = input.nextInt();
        System.out.println("Largest number is "+Math.max(num1,num2));
    }
}
