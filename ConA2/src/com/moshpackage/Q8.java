package com.moshpackage;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
                                                                 //Java program that reads a floating-point number....
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'r' || ch == 'a' || ch == 'n' || ch == 'd' || ch == 'o' || ch == 'm'){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
