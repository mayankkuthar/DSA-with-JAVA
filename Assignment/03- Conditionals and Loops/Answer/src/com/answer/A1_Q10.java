package com.answer;

import java.util.Scanner;

// Perimeter of Parallelogram
public class A1_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter both non-parallel sides of Parallelogram : ");
        double l,b;
        l = input.nextDouble();
        b = input.nextDouble();
        double perimeter = 2*(l+b);
        System.out.println("Perimeter of Parallelogram : "+perimeter+" cm");
    }
}
