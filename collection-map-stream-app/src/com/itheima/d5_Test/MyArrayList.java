package com.itheima.d5_Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class MyArrayList<E> {
    private E arr[];
    private int size = 0;

    public MyArrayList() {
        this.arr = (E[]) new Object[0];
    }
    public MyArrayList(E[] arr) {
        this.arr = arr;
    }

    public int size(){
        return this.size;
    }

    public void add(E temp){
        if(this.arr.length == 0) {
            this.arr = (E[])new Object[10];
            this.arr[this.size++] = temp;
        }
        else if(this.size == this.arr.length){
            int len = (int)(this.arr.length * 1.5);
            E arr[] = (E[])new Object[len];
            for (int i = 0; i < size; i++) {
                arr[i] = this.arr[i];
            }
            arr[size++] = temp;
            this.arr = arr;
        }
        else this.arr[size++] = temp;

    }
    public void remove(int index){
        for (int i = index; i+1 < size; i++) {
            this.arr[i] = this.arr[i+1];
        }
        size--;
    }
    public E get(int i){
        return this.arr[i];
    }

    public void forEachForgery(Consumer<? super E> action){
        for (int i = 0; i < size; i++) {
            action.accept(arr[i]);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            if(i != size - 1) s += this.arr[i] + ",";
            else s += this.arr[i];
        }
        return "[" + s +']';
    }
}
