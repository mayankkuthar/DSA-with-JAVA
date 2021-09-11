package com.answer;

import java.util.Scanner;

// Even or odd
public class Q_2 {
    static boolean check(int num){
        return (num%2==0);
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num  = input.nextInt();
        if(check(num))
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}
