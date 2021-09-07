package com.answer;

import java.util.Scanner;

// Calculate Commission Percentage
public class A2_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sells amount : ₹ ");
        double sell = input.nextDouble();
        System.out.print("Enter your commission amount : ₹ ");
        double comi = input.nextDouble();
        System.out.println("Commission Percentage : "+(comi/sell)*100+" %");
    }
}
