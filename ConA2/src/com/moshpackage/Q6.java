package com.moshpackage;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
                                                        //perform the following conditional actions

            System.out.println("Please enter the number");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if(x % 2 != 0){
                System.out.println("New");
            }
            if((x % 2 == 0) && (x>=2 && x<=5) ){
            System.out.println("Old");
        }
            if((x % 2 == 0) && (x>=6 && x<=30) ){
            System.out.println("New");
        }
            if((x % 2 == 0) && (x>30) ){
            System.out.println("Old");
        }
    }
}
