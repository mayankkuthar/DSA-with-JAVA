package com.answer;

import java.util.Scanner;

// Perimeter of Rectangle
public class A1_Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter both adjacent sides of Rectangle : ");
        double l,b;
        l = input.nextDouble();
        b = input.nextDouble();
        double perimeter = 2*(l+b);
        System.out.println("Perimeter of Rectangle : "+perimeter+" cm");
    }
}
