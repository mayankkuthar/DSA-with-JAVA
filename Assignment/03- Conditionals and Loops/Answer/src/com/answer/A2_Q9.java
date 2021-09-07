package com.answer;

import java.util.Scanner;

// Calculate Batting Average
public class A2_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_runs,innings,not_out;
        System.out.print("Enter Total Runs scored : ");
        total_runs = input.nextInt();
        System.out.print("Enter number of innings : ");
        innings = input.nextInt();
        System.out.print("Enter Numbers of not-out : ");
        not_out = input.nextInt();
        System.out.println("Batting average : "+total_runs/(innings-not_out));
    }
}
