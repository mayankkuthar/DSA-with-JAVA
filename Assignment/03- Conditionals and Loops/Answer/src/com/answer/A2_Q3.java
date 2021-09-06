package com.answer;

import java.util.Scanner;

// Average of N Numbers
public class A2_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? : ");
        int n = input.nextInt();
        long sum = 0;
        System.out.println("Enter numbers : ");
        for(int i = 0;i<n;i++){
            int temp = input.nextInt();
            sum+=temp;
        }
        System.out.println("Average of "+n+" numbers : "+sum/n);
    }
}
