package com.answer;

import java.util.Scanner;

// Calculate Discount of product
public class A2_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Cost Price of Product : ₹ ");
        int cost = input.nextInt();
        System.out.print("Enter Selling Price of Product : ₹ ");
        int sell = input.nextInt();
        System.out.println("Discount on Product : ₹ "+(cost-sell));
    }
}
