package com.answer;

import java.util.Scanner;

// Perimeter of Circle
public class A1_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = input.nextDouble();
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of Circle : "+perimeter+" cm");
    }
}
