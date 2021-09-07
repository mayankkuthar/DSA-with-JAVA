package com.answer;

import java.util.Scanner;

//Calculate Depreciation of Value
public class A2_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Booking Amount : ₹ ");
        long amount = input.nextLong();
        System.out.print("Enter Useful Life in years : ");
        long y = input.nextLong();
        System.out.print("Enter Depreciation Percentage : ");
        long dep = input.nextLong();
        while(y!=0){
            y-=1;
            amount = ((100-dep)*amount)/100;
        }
        System.out.println("Value After Depreciation : ₹ "+amount);
    }
}
