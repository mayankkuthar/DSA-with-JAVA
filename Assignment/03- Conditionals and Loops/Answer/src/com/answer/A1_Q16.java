package com.answer;

import java.util.Scanner;

// Volume of Cylinder
public class A1_Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,h;
        System.out.print("Enter Radius of Cylinder : ");
        r = input.nextDouble();
        System.out.print("Enter Height of Cylinder : ");
        h = input.nextDouble();
        double vol = Math.PI*(r*r)*(h);
        System.out.println("Volume of Cylinder : "+vol+" cm³");
    }
}
