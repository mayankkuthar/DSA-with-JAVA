package com.answer;

import java.util.Scanner;

//Product through method
public class Q_5 {
    static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Product : "+product(a,b));
    }
}
