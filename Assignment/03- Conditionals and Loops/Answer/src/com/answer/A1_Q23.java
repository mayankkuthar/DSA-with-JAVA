package com.answer;

import java.util.Scanner;

// Print all the factors of a number
public class A1_Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        System.out.println("Factors of "+num+" are : ");
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i == i){
                    System.out.print(i+" ");
                }
                else
                    System.out.print(i+" "+num/i+" ");
            }
        }
    }
}
