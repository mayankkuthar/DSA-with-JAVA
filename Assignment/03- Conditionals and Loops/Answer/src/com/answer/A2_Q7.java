package com.answer;

import java.util.Scanner;

//Power
public class A2_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = input.nextInt();
        System.out.print("Enter Exponent : ");
        int exp = input.nextInt();
        long power = 1;
        for(int i=1;i<=exp;i++){
            power*=base;
        }
        System.out.println("Power : "+power);
    }
}
