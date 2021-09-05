package com.answer;

import java.util.Scanner;

// Total Surface Area Of Cube
public class A1_Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of Cube : ");
        double side = input.nextDouble();
        double c_area = 6*(side*side);
        System.out.println("Total Surface area of Cube : "+c_area+" cm²");
    }
}
