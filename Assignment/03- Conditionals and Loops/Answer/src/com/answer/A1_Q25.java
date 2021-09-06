package com.answer;

import java.util.Scanner;

// Find the largest number until the user enters 0
public class A1_Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large = -2147483648;
        System.out.println("Enter numbers : ");
        int temp = input.nextInt();
        while(temp != 0){
            if(temp>large) large=temp;
            temp = input.nextInt();
        }
        System.out.println("Largest : "+large);
    }
}
