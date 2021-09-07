package com.answer;

import java.util.Scanner;

// Sum Of N number
public class A2_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter : ");
        int n = input.nextInt();
        long sum=0;
        System.out.println("Enter n numbers : ");
        for(int i=0;i<n;i++){
            int temp = input.nextInt();
            sum+=temp;
        }
        System.out.println("Sum : "+sum);
    }
}
