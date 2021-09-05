package com.answer;

import java.util.Scanner;

// Curved Surface Area Of Cylinder
public class A1_Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Cylinder : ");
        double r = input.nextDouble();
        System.out.print("Enter Height of Cylinder : ");
        double h = input.nextDouble();
        double c_area = 2*Math.PI*r*h;
        System.out.println("Curved Surface area of Cylinder : "+c_area+" cm²");
    }
}
