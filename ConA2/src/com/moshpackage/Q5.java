package com.moshpackage;

public class Q5 {
    public static void main(String[] args) {
                                                         //Print all numbers from 0 to 6 except 3 and 6;

        for (int i=0; i <=6; i++){
            if(i==3 || i==6){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
