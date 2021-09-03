package com.answer;

import java.util.Scanner;
//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
public class Q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,t;
        float r;
        System.out.println("Enter Principle Amount in ₹: ");
        p=input.nextInt();
        System.out.println("Enter Time in years: ");
        t=input.nextInt();
        System.out.println("Enter Rate of Interest in percentage:");
        r=input.nextFloat();
        float s_interest = (p*r*t)/100;
        System.out.println("Simple Interest is : ₹"+ s_interest);
    }
}
