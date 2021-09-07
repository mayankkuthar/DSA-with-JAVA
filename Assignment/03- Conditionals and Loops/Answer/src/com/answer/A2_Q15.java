package com.answer;

import java.util.Scanner;

//Armstrong Number
public class A2_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        int num1 = n;
        int check = 0;
        while(n>0){
            int temp = n%10;
            check+=(temp*temp*temp);
            n=n/10;
        }
        if (check == num1)
            System.out.println(num1+" is a Armstrong Number");
        else
            System.out.println(num1+" is not a Armstrong number");
    }
}
