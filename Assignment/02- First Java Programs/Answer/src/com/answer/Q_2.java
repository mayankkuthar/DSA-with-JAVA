package com.answer;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input.
public class Q_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num + " is an even number.");
        }
        else{
            System.out.println(num + " is an odd number.");
        }
    }
}
