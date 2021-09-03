package com.answer;

import java.util.Scanner;
//Take name as input and print a greeting message for that name.
public class Q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hey! "+name+" Greetings!! ");
    }
}
