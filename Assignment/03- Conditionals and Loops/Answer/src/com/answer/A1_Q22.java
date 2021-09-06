package com.answer;

import java.util.Scanner;

// Subtract the Product and Sum of Digits of an integer
public class A1_Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int num = input.nextInt();
        int sum =0;
        int product =1;
        while(num>0){
            sum+=num%10;
            product*=num%10;
            num=num/10;
        }
        System.out.println("Result : "+Math.abs(sum-product));
    }
}
