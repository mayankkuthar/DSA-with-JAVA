package com.answer;

import java.util.Scanner;

// Compound Interest
public class A2_Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double r = input.nextDouble();
        System.out.print("Enter number of times interest applied per time period : ");
        double n = input.nextDouble();
        double CI = (p*(Math.pow((1+(r/100)),n)))-p; //Final Amount
        System.out.print("Compound Interest : "+CI);
    }
}
