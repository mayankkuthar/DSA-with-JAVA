package com.answer;

import java.util.Scanner;

// Perimeter of Rhombus
public class A1_Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side of Rhombus : ");
        double side = input.nextDouble();
        double perimeter = 4*side;
        System.out.println("Perimeter of Rhombus : "+perimeter+" cm");
    }
}
