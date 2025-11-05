package com.Day7;

interface Operation{
    int execute(int a, int b);
}
 class Child implements Operation{
    public int execute(int a, int b){
        return a+b;
     }
 }
public class LambdaExpression {
    public static void main(String[] args){
        Operation add = (a, b) -> a+b;
        System.out.println(add.execute(10,20));
        Operation sub = (a, b) -> a-b;
        System.out.println(sub.execute(10,20));
        Operation mul = (a, b) -> a*b;
        System.out.println(mul.execute(10,20));
    }
}
