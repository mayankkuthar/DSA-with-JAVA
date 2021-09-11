package com.answer;

import java.util.Scanner;

//Factorial
public class Q_9 {
    static void Factorial(int n){
        if(n==0 || n==1) System.out.println(n+"! = 1");
        else {
            System.out.print(n + "! = ");
            int ans = 1;
            while (n>1){
                System.out.print(n+" * ");
                ans*=n;
                n--;
            }
            System.out.print("1 = "+ans);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        Factorial(num);
    }
}
