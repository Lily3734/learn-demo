package com.itheima.d2_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(sum(5));
    }
    public static int f(int n){
        if(n == 1) return 1;
        else return f(n - 1) * n;
    }
    public static int sum(int n){
        if(n == 1) return 1;
        else return sum(n - 1) + n;
    }
}