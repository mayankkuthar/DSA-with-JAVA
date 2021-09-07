package com.answer;

import java.util.Scanner;

//Question-27
public class A2_Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum_n=0;
        long sum_e=0;
        long sum_o=0;
        System.out.println("Enter numbers:");
        int temp = input.nextInt();
        while(temp!=0){
            if(temp<0) sum_n+=temp;
            if(temp>0){
                if(temp%2==0) sum_e+=temp;
                else sum_o+=temp;
            }
            temp = input.nextInt();
        }
        System.out.println("Sum of Negative numbers : "+sum_n);
        System.out.println("Sum of Positive odd numbers : "+sum_o);
        System.out.println("Sum of Positive even number : "+sum_e);
    }
}
