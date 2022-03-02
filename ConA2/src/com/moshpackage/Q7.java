package com.moshpackage;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
                                                            //Java program that reads a floating-point number....
            System.out.println("Please enter the number");
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();

            if(x==0){
                System.out.println("Zero");
            }

            if(x<0){
                if (Math.abs(x) < 1)
                {
                    System.out.println("Negative small number");
                }
                else if (Math.abs(x) > 1000000)
                {
                    System.out.println("Negative large number");
                }
                else
                {
                    System.out.println("Negative number");
                }
            }

            if(x>0){
                if (x < 1)
                {
                    System.out.println("Positive small number");
                }
                else if (x > 1000000)
                {
                    System.out.println("Positive large number");
                }
                else
                {
                    System.out.println("Positive number");
                }
            }
    }
}
