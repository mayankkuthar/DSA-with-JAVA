package com.answer;

import java.util.Scanner;

// Vowel Or Consonant
public class A2_Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Alphabet : ");
        char a = input.next().trim().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
            System.out.println("Its a Vowel");
        else
            System.out.println("Its a Consonant");
    }
}
