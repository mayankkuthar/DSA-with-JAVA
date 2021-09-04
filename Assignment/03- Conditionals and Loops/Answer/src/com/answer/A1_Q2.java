package com.answer;

import java.util.Scanner;
// Area of Triangle
public class A1_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Find Area of Triangle through:\n" +
                "\t1. 3 sides of triangle\n" +
                "\t2. height and base of triangle\n");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        if(choice==1){
            double a,b,c;
            System.out.print("Enter 3 sides of Triangle : ");
            a=input.nextDouble();
            b=input.nextDouble();
            c=input.nextDouble();
            //Heron's Formula
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle : "+area+" unit²");
        }
        else if(choice==2){
            double h,b;
            System.out.print("Enter Height of Triangle : ");
            h=input.nextDouble();
            System.out.print("Enter Base of Triangle : ");
            b=input.nextDouble();
            double area = (b*h)/2;
            System.out.println("Area of Triangle : "+area+" unit²");
        }
        else{
            System.out.println("Invalid Choice !!!");
        }
    }
}
