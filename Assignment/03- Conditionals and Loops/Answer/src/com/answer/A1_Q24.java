package com.answer;

import java.util.Scanner;

// Print Sum of Numbers until user enters 0
public class A1_Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        System.out.println("Enter numbers : ");
        int temp = input.nextInt();
        while(temp != 0){
            sum+=temp;
            temp = input.nextInt();
        }
        System.out.println("Sum : "+sum);
    }
}
