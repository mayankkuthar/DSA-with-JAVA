package com.answer;

import java.util.Scanner;
//Find min and max of three number
public class Q_1 {
    static int max(int a,int b,int c){
        int res= a;
        if(res<b) res=b;
        if(res<c) res=c;
        return res;
    }
    static int min(int a,int b,int c){
        int res= a;
        if(res>b) res=b;
        if(res>c) res=c;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three numbers : ");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        int min_res = min(a,b,c);
        int max_res = max(a,b,c);
        System.out.println("Maximum of three numbers : "+max_res);
        System.out.println("Minimum of three numbers : "+min_res);
    }
}
