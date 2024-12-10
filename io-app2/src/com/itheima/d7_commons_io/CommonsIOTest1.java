package com.itheima.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIOTest1 {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("io-app3\\src\\fate"),new File("io-app3\\src\\a.txt"));
    }
}
