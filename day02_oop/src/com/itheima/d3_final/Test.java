package com.itheima.d3_final;

public class Test {
    public static void main(String[] args) {
        //1.final的作用：final修饰类，类就不能被继承了


    }
    final class A{

    }
    class B{

    }
    //2.final修饰方法，方法就不能被重写了
    class C{
        public final void test(){

        }
    }

    class D extends C{
//        public void test(){
//
//        }
    }
}
