package com.answer;

import java.util.Scanner;

//Print Prime numbers
public class Q_13 {
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
    static void print_prime(int a,int b){
        System.out.println("Prime Numbers Between "+a+" and "+b+" : ");
        for(int i=a;i<=b;i++){
            if(check_prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first and last numbers between which Prime numbers are required : ");
        a = input.nextInt();
        b = input.nextInt();
        print_prime(a,b);
    }
}
