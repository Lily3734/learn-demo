package com.itheima.d2_recursion;

import java.io.File;

public class RecursionTest3 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        System.out.println(file.delete());

    }
    public static void searchFile(File dir,String filename){
        if(dir == null || !dir.exists() || dir.isFile())  {
            System.out.println();
            return;
        }
    }
}
