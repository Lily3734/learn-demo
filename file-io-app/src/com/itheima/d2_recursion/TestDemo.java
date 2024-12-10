package com.itheima.d2_recursion;

import java.io.File;

public class TestDemo {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        System.out.println(file.toString());
        deleteFile(new File("D:\\aaa"));
    }

    public static void deleteFile(File file){
        if(file == null || !file.exists()) return;

        if(file.isFile()){
            file.delete();
            return;
        }
        File[] files = file.listFiles();

        if(files.length == 0) {
            file.delete();
            return;
        }
        if(files != null ){
            for(File f : files){
                deleteFile(f);
            }
        }
        file.delete();

    }
}
