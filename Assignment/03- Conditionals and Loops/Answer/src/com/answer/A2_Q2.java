package com.answer;

import java.util.Scanner;

// Calculate Electricity Bill
public class A2_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units consumed : ");
        double units = input.nextDouble();
        System.out.print("Enter Price per unit : ");
        int price = input.nextInt();
        System.out.println("Electricity Bill : ₹ "+price*units);
    }
}
