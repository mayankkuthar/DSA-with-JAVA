package com.questions;

import java.util.Scanner;

public class PracticeQuestion5 {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      char choice;
      System.out.print("Operatiions:-\n+, -, *, /\nEnter your choice : ");
      choice = input.next().charAt(0);
      System.out.print("Enter First Number :");
      int num1 = input.nextInt();
      System.out.print("Enter Second number :");
      int num2 = input.nextInt();
      int result = 0;
      if (choice == '+') result = num1+num2;
      if (choice == '-') result = num1-num2;
      if (choice == '*') result = num1*num2;
      if (choice == '/') result = num1/num2;
      System.out.println("Result: " + num1 + " " + choice + " " + num2 + " = " + result);

  }
  }
