package com.itheima.d2_recursion;

public class Test1 {
    public static int totalNumber;
    public static int lidNumber;
    public static int bottleNumber;
    public static int addNumber;
    public static void main(String[] args) {

    }
    public static void buy(int money){
        int buyNumber = money / 2;
        totalNumber += buyNumber;
        int LidNumber = buyNumber;
        int BottleNumber = buyNumber;
        if(LidNumber >= 4){
            addNumber += lidNumber / 4;
            lidNumber -= lidNumber % 4;
        }
        if(BottleNumber >= 2){
            addNumber += bottleNumber /2;
            bottleNumber = bottleNumber % 2;
        }
        totalNumber += addNumber;
    }
}
