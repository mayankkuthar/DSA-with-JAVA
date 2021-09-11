package com.answer;

import java.util.Scanner;

//Prime or Not
public class Q_7 {
    static boolean check_prime(int n){
        if(n<=1) return false;
        boolean ans =true;
        int i = 2;
        while(i*i<=n){
            if(n%i==0){
                ans = false;
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        if(check_prime(num))
            System.out.println("The number is prime.");
        else
            System.out.println("The number is not prime.");
    }
}
