package com.answer;

import java.util.Scanner;

//Write a program to print factorial of a number, also take input.
public class Q_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        long result = 1;
        for(int i=2;i<=num;i++){
            result *=i;
        }
        System.out.println("Result: "+ result);
    }
}
