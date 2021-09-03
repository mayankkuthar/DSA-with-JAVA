package com.answer;

import java.util.Scanner;
//Input currency in rupee and output in dollar.
public class Q_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in ₹ :");
        int rupees = input.nextInt();
        System.out.println("Amount in $ : "+ rupees*0.013);
    }
}
