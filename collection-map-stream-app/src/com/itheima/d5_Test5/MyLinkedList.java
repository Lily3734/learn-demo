package com.itheima.d5_Test5;

import java.util.Scanner;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size;
    private Node pointer;


    public MyLinkedList() {
        this.head = new Node<E>();
        this.size = 0;
        pointer = this.head;
    }

    public MyLinkedList(Node head, int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public Node addNode() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1、addNode");
            System.out.println("2、exit");
            if ("addNode".equals(sc.next())) {
                Node<E> node = new Node<E>();
                pointer.setNext(node);
                System.out.println("添加成功");
                pointer = pointer.getNext();
                size++;
                System.out.println("是否在该节点存储数据？");
                if (sc.next().equals("1")) {
                    pointer.setDate(sc.nextInt());
                    System.out.println("添加成功");
                }
            } else break;
        }
        return this.head;
    }

    public void traverse(Node head) {
        int num = 1;
        Node node = head.getNext();
        while (node.getNext() != null){
            System.out.println("节点" + (num++) + "------->" + node.getDate());
            node = node.getNext();
        }
    }
    public void reverse(Node head,int left,int right){
        if(left > right) {
            System.out.println("输入的left与right不符合要求");
            return;
        }
        Node nodeLeft = this.head.getNext();
        for (int i = 1; i < left; i++) {
            nodeLeft = nodeLeft.getNext();
            System.out.println(nodeLeft.getDate());
        }
        Node nodeRight = this.head.getNext();
        for (int i = 1; i < right; i++) {
            nodeRight = nodeLeft.getNext();
            System.out.println(nodeRight.getDate());
        }
        for (int i = left; i < right--; i++) {
            E data = (E) nodeLeft.getDate();
            nodeLeft.setDate(nodeRight.getDate());
            nodeRight.setDate(data);
            nodeLeft = nodeLeft.getNext();
            nodeRight = nodeRight.getNext();

        }
    }


}
