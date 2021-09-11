package com.answer;

import java.util.Scanner;

// Palindrome or Not
public class Q_10 {
    static boolean check_pal(int n){
        int num1 = n;
        int rev_num = 0;
        while (num1>0){
            rev_num+=num1%10;
            rev_num*=10;
            num1=num1/10;
        }
        rev_num=rev_num/10;
        return n==rev_num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        if(check_pal(num))
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome");
    }
}
