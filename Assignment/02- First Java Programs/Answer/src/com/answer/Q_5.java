package com.answer;

import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q_5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char choice;
        System.out.println("Operations:-\n+, -, *, /\nEnter your choice: ");
        choice = input.next().charAt(0);
        System.out.println("Enter First Number :");
        int num1 = input.nextInt();
        System.out.println("Enter second number :");
        int num2 = input.nextInt();
        int result =0;
        if(choice == '+') result = num1+num2;
        else if(choice == '-') result = num1-num2;
        else if(choice == '*') result = num1*num2;
        else if(choice == '/') result = num1/num2;
        System.out.println("Result: "+num1+" "+choice+" "+num2+" = "+result);
    }
}
