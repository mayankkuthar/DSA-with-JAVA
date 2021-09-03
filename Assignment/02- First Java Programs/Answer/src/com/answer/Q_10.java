package com.answer;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the largest number from all.
public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num;
        System.out.println("Enter numbers: ");
        num = input.nextInt();
        int temp = 1;
        while(temp !=0){
            temp = input.nextInt();
            if(temp>num) num=temp;
        }
        System.out.println("Largest Number is "+num);
    }
}
