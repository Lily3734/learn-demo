package com.itheima.d5_Test5;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> linked = new MyLinkedList<>();
        Node hear = linked.addNode();
        System.out.println(linked.size());
        linked.traverse(hear);
        linked.reverse(hear,2,4);
        linked.traverse(hear);

    }
}
