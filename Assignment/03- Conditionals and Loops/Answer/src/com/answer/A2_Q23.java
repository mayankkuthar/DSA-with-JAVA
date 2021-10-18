package com.answer;

import java.util.Scanner;

// Perfect number
public class A2_Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number : ");
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        for (int i = 1; i < n ; i ++){
            if (n%i == 0){
                sum = sum + i;
            }
        }
        if (sum == temp){
            System.out.println("It is a perfect number! ");
        }else {
            System.out.println("It is not a perfect number!");
        }
    }
}
