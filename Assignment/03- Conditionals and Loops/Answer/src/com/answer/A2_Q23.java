package com.answer;

import java.util.Scanner;

// Perfect number
public class A2_Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        long sum = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i+" "+(n/i));
                if(n/i==i){
                    if(i==n) continue;
                    else sum+=i;
                }
                else{
                    if(i==n) continue;
                    else sum+=i;
                    if(n/i==n) continue;
                    else sum+=(n/i);
                }
            }
        }
        if(n==sum)
            System.out.println(n+" is a Perfect number");
        else
            System.out.println(n+" is not a Perfect number");
    }
}
