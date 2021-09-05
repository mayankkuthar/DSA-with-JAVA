package com.answer;

import java.util.Scanner;
// Area of Triangle
public class A1_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter 3 sides of Triangle : ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        //Heron's Formula
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle : "+area+" unit²");
    }
}
