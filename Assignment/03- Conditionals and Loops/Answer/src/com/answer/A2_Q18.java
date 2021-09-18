package com.answer;

import java.util.Scanner;

// Find if a number is a palindrome or not
public class A2_Q18 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while(temp>0){
            rev +=(temp%10);
            rev*=10;
            temp=temp/10;
        }
        rev=rev/10;
        if(rev==num){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
}
