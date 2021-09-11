package com.answer;

import java.util.Scanner;

//Sum of N natural numbers
public class Q_14 {
    static int nsum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Sum of first "+num+" natural number : "+nsum(num));
    }
}
