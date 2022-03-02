package com.moshpackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                                                            //If a num is divisible by 5 print Java Training
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int x = sc.nextInt();

        if(x % 5 == 0){
            System.out.println("Num is Divisible by 5");
        }
        else{
            System.out.println("Num is not Divisible by 5");
        }


        if(x % 3 == 0){
            System.out.println("Num is Divisible by 3");
        }
        else{
            System.out.println("Num is not Divisible by 3");
        }
        if(x % 3 == 0 && x % 5 == 0){
            System.out.println("Num is Divisible by 3 and 5");
        }
        else{
            System.out.println("Num is not Divisible by 3 and 5");
        }
    }
}
