package com.answer;

import java.util.Scanner;

// Calculate Distance between two points
public class A2_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter co-ordinates (x1,y1) of 1st point : ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Enter co-ordinates (x2,y2) of 2nd point : ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.println("Distance : "+Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
    }
}
