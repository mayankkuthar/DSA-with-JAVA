package com.mayank;

import java.util.Scanner;

// byte code in out folder
public class Main {

    public static void main(String[] args) { //to get this line easily type 'psvm'
        System.out.println("Hello World!"); //to get this line easily type 'sout'
        System.out.print(6788); // don't add a new line after printing
        System.out.println(" Number");

        Scanner input = new Scanner(System.in); // create new object of Scanner class and assign to input, taking input
        int num = input.nextInt(); // Take input a number from user
        String s = input.next(); // Take input a string of 1 word from user
        String line = input.nextLine(); // Take input a string complete line from user
        System.out.println(num);
        System.out.println(s);
        System.out.println(line);

        //Primitive Data Types
        int number = 37;
        float decimal = 23.67f;
        char letter = 'a';
        double large_decimal = 3.456789457;
        long Large_num = 12345678978L;
        boolean check = true;
    }
}
