package com.answer;

import java.util.Scanner;

//Area of Circle
public class A1_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("Area of Circle : "+area+" unit²");
    }
}
