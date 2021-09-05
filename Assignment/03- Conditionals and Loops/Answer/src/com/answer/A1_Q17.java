package com.answer;

import java.util.Scanner;

// Volume of Sphere
public class A1_Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        System.out.print("Enter Radius of Sphere : ");
        r = input.nextDouble();
        double vol = ((4)*Math.PI*(r*r*r))/3;
        System.out.println("Volume of Sphere : "+vol+" cm³");
    }
}
