package com.answer;

import java.util.Scanner;

//Sum through method
public class Q_4 {
    static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter two numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Sum : "+sum(a,b));
    }
}
