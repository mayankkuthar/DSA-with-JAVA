package com.answer;

import java.util.Scanner;

// Area of Rhombus
public class A1_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1,d2;
        System.out.print("Enter both the diagonals of Rhombus : ");
        d1 = input.nextDouble();
        d2 = input.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("Area of Rhombus : "+area+" unit²");
    }
}
