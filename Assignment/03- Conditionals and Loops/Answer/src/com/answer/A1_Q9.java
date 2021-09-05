package com.answer;

import java.util.Scanner;

// Perimeter of Equilateral Triangle
public class A1_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Side of Equilateral Triangle : ");
        double side = input.nextDouble();
        double perimeter = 3*side;
        System.out.println("Perimeter of Equilateral Triangle : "+perimeter+" cm");
    }
}
