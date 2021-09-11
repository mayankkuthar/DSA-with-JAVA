package com.answer;

import java.util.Scanner;

//Pythagorean Triplet
public class Q_12 {
    static  boolean check_py(int a,int b,int c){
        int max = a;
        if(max<b) max=b;
        if(max<c) max=c;
        if(max==a) return (a*a)==(b*b)+(c*c);
        else if(max==b) return (b*b)==(a*a)+(c*c);
        else return (c*c)==(a*a)+(b*b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(check_py(a,b,c))
            System.out.println("Its a Pythagorean Triplet.");
        else
            System.out.println("Its not a Pythagorean Triplet.");
    }
}
