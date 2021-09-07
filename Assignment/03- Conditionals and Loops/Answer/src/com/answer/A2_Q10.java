package com.answer;

import java.util.Scanner;

// Calculate CGPA
public class A2_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total marks out of 500 : ");
        double marks = input.nextInt();
        double CGPA = ((marks/500)*100)/9.5;
        System.out.printf("CGPA : "+ "%.2f",CGPA);
    }
}
