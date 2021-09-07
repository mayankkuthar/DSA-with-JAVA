package com.answer;

import java.util.Scanner;

// Check Leap Year or Not
public class A2_Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        if((year%400==0) || (year%4==0 && year%100 !=0))
            System.out.println(year+" is a Leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
