package com.answer;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Q_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        long sum=0;
        System.out.println("Enter numbers: ");
        while(num !=0){
            num= input.nextInt();
            sum+=num;
        }
        System.out.println("Sum : "+sum);
    }
}
