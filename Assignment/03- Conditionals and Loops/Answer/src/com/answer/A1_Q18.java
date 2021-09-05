package com.answer;

import java.util.Scanner;

// Volume of Pyramid
public class A1_Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,w,h;
        System.out.print("Enter Base length of Pyramid : ");
        l = input.nextDouble();
        System.out.print("Enter Base width of Pyramid : ");
        w = input.nextDouble();
        System.out.print("Enter Height of Pyramid : ");
        h = input.nextDouble();
        double vol = (l*w*h)/3;
        System.out.println("Volume of Pyramid : "+vol+" cm³");
    }
}
