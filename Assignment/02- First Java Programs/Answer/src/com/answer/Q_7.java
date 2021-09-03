package com.answer;

import java.util.Scanner;
//Input a number and print all the factors of that number (use loops).
// If it's about factors num only need to check till sqrt(num)
public class Q_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Factors are : ");
        for(int i = 1;i<(Math.sqrt(num))+1;i++){
            if(num%i==0){
                if(i==num/i)System.out.print(i+" ");
                else System.out.print(i+" "+(num/i)+" ");

            }
        }
    }
}
