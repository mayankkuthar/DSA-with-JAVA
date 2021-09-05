package com.answer;

import java.util.Scanner;

// Area of Equilateral Triangle
public class A1_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side;
        System.out.print("Enter Side of Equilateral Triangle : ");
        side = input.nextDouble();
        double height = (Math.sqrt(3)/2)*side;
        double area = (height*side)/2;
        System.out.println("Area of Equilateral Triangle : "+area+" unit²");
    }
}
