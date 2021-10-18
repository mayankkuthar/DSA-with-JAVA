package com.answer;

import java.util.Scanner;

//Armstrong Number
public class A2_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("enter your number : ");
        int num = input.nextInt();
        int t1 = num;
        int length = 0;
        while (t1 != 0) {
            length = length + 1;
            t1 = t1 / 10;
        }
        int t2 = num;
        int rem=0;
        int arm = 0;
        while (t2 != 0) {
            rem = t2 % 10;
            int mul = 1;
            for (int i = 1; i <= length; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2/10;
        } if (arm == num) {
            System.out.println("It is an armstrong number!");
        }else
            System.out.println("It is not an armstrong number!");
    }
}
