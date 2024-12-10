package com.itheima.d1_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {7,5,3,1,3};
        for (int i = 0; i < arr.length-1; i++) {
            int temp;
            for (int j = 0; j+1 < arr.length-i; j++) {
                if(arr[j+1] < arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       System.out.println(Arrays.toString(arr));
        //选择排序
        for (int i = 0; i < arr.length-1; i++) {
            int temp;
            for (int j = i; j+1 < arr.length; j++) {
                if(arr[i] > arr[j+1]){
                    temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        chack();
    }
    public static void chack(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String time = sc.next();
            if(time.matches("(([0-1][0-9])|(2[0-3])):[0-5][0-9]|60")) System.out.println("1");
            else System.out.println("0");
        }
    }
}
