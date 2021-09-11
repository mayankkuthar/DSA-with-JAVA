package com.answer;

import java.util.Scanner;

//Circle's Area and Circumference
public class Q_6 {
    static void solve(double r){
        double area = Math.PI*r*r;
        double cir = Math.PI*2*r;
        System.out.println("Circumference of Circle : "+cir+" cm");
        System.out.println("Area of Circle : "+area+" cm²");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        double radius = input.nextDouble();
        solve(radius);
    }
}
