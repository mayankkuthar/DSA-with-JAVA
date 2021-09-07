package com.answer;

import java.util.Scanner;

// Calculate Average Marks
public class A2_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int n = input.nextInt();
        long sum=0;
        System.out.println("Enter marks of n Subject : ");
        for(int i=0;i<n;i++){
            int temp = input.nextInt();
            sum+=temp;
        }
        System.out.println("Average Marks : "+(sum/n));
    }
}
