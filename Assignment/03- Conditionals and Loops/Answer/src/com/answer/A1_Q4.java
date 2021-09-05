package com.answer;

import java.util.Scanner;

// Area of Isosceles Triangle
public class A1_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h,b;
        System.out.print("Enter Height of Triangle : ");
        h=input.nextDouble();
        System.out.print("Enter Base of Triangle : ");
        b=input.nextDouble();
        double area = (b*h)/2;
        System.out.println("Area of Triangle : "+area+" unit²");
    }
}
