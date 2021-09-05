package com.answer;

import java.util.Scanner;

// Perimeter of Square
public class A1_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side of Square : ");
        double side = input.nextDouble();
        double perimeter = 4*side;
        System.out.println("Perimeter of Square : "+perimeter+" cm");
    }
}
