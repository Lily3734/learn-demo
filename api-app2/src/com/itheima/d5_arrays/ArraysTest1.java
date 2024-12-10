package com.itheima.d5_arrays;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
    }
}
