package com.answer;

import java.util.Scanner;

// Addition of two number
public class A2_Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum : "+(a+b));
    }
}
