package com.Day2;

public class Hw5 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        if(num > 0){
            System.out.println(num + " Is Positive ");
        }
        else if(num < 0){
            System.out.println(num + " Is Negative ");
        }
        else{
            System.out.println(num + " Is Zero ");
        }
    }
}
