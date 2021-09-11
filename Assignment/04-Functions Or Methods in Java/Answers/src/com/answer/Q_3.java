package com.answer;

import java.util.Scanner;

// Vote Eligibility
public class Q_3 {
    static boolean vote(int a){
        return (a>=18);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age of a person : ");
        int age = input.nextInt();
        if(vote(age))
            System.out.println("He/She is Eligible to vote.");
        else
            System.out.println("He/She is not Eligible to vote.");
    }
}
