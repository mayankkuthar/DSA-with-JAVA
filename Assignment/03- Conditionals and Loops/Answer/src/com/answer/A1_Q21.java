package com.answer;

import java.util.Scanner;

// Fibonacci Series
public class A1_Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms you want : ");
        int n = input.nextInt();
        long[] arr = new long[n];//Array of long
        System.out.print("Fibonacci Series : ");
        if(n==1){
            System.out.print(0);
        }
        else if(n==2){
            System.out.print(0+" "+1);
        }
        else{
            arr[0]=0;
            arr[1]=1;
            for(int i =2;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
