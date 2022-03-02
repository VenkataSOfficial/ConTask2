package com.moshpackage;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
                                                                        //Calculator App
        int a = 0;
        int b = 0;
        int first1 = 0;
        int second2 = 0;

        double result;
        System.out.println("Enter 1 for Add " +
                "Enter 2 for Sub " +
                "Enter 3 for Div " +
                "Enter 4 for Mul " +
                "Enter 5 for Avg ");
        Scanner sc = new Scanner(System.in);
        char opt = sc.next().charAt(0);;

        if(opt =='1' || opt == '2' || opt=='3' || opt =='4'){
            System.out.println("Enter first number");
            a = sc.nextInt();
            System.out.println("Enter second number");
            b = sc.nextInt();
        }
        else if (opt =='5'){
            System.out.println("Enter first1 number");
            first1 = sc.nextInt();
            System.out.println("Enter second2 number");
            second2 = sc.nextInt();
        }

        switch(opt)
        {
            case '1':
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case '2':
                result =a - b;
                System.out.println("Result = " + result);

                break;

            case '3':
                result = a / b;
                System.out.println("Result = " + result);

                break;

            case '4':
                result = a * b;
                System.out.println("Result = " + result);

                break;

            case '5':
               result = ((first1 + second2)/2);
                System.out.println("Result = " + result);
                break;

            default:
                System.out.print("You have entered wrong opt");
                return;
        }

        if(result < 0) {
            System.out.println("Result is Negative");
        }
    }
}
