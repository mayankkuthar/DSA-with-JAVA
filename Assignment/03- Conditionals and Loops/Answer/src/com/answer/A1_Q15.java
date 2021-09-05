package com.answer;

import java.util.Scanner;

// Volume of Prism-Rectangular
public class A1_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b,l,h;
        System.out.print("Enter length of Prism : ");
        l = input.nextDouble();
        System.out.print("Enter breath of Prism : ");
        b = input.nextDouble();
        System.out.print("Enter Height of Prism : ");
        h = input.nextDouble();
        double vol = l*b*h;
        System.out.println("Volume of Prism : "+vol+" cm³");
    }
}
