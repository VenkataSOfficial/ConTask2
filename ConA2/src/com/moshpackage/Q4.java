package com.moshpackage;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //If user input negative break, if user input positive continue
        int x=0;

        while(true) {
            System.out.println("Please enter the number");
            Scanner sc = new Scanner(System.in);
             x = sc.nextInt();

            if(x>0){
                System.out.println("Good Morning");
                continue;
            }
            else if (x<0){
                System.out.println("Its over");
                break;
            }
        }
    }
}
