package com.answer;

import java.util.Scanner;

// Area of Parallelogram
public class A1_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h,b;
        System.out.print("Enter Height of Parallelogram : ");
        h=input.nextDouble();
        System.out.print("Enter Base of Parallelogram : ");
        b=input.nextDouble();
        double area = (b*h);
        System.out.println("Area of parallelogram : "+area+" unit²");
    }
}
