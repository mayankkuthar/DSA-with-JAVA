package com.answer;

import java.util.Scanner;

// Volume of Cone
public class A1_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,h;
        System.out.print("Enter Radius of Cone : ");
        r = input.nextDouble();
        System.out.print("Enter Height of Cone : ");
        h = input.nextDouble();
        double vol = Math.PI*(r*r)*(h/3);
        System.out.println("Volume of Cone : "+vol+" cm³");
    }
}
