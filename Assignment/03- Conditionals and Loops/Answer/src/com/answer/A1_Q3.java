package com.answer;

import java.util.Scanner;
//Area of Rectangle
public class A1_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,b;
        System.out.print("Enter Length of Rectangle : ");
        l=input.nextDouble();
        System.out.print("Enter Breath of Rectangle : ");
        b=input.nextDouble();
        double area = (b*l);
        System.out.println("Area of Rectangle : "+area+" unit²");
    }
}
