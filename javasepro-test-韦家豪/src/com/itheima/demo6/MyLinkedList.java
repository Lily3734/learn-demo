package com.itheima.demo6;

import java.util.List;

public class MyLinkedList<E extends Comparable> {
    // 封装一个链表
    Node<E> head = null;
    /**
     * 定义了一个私有的内部类，作为链表的结点。
     */
    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node<E> add(E e) {
        if (head == null) {
            head = new Node(e, null);
        } else {
            // 往后面插入结点。（尾插法）
            Node<E> temp = head;
            // 让temp走到尾部结点
            while (temp.next != null) {
                temp = temp.next;
            }
            // 把当前结点创建出来，加入到尾部结点
            temp.next = new Node(e, null);
        }
        return head;
    }
    public void sort(){

        if(head == null || head.next == null) return;
        boolean flag = true;
        while (flag) {
            flag = false;
            Node<E> node1 = head;
            while (node1.next != null) {
                if(node1.data.compareTo(node1.next.data) > 0){
                    E e = node1.next.data;
                    node1.next.data = node1.data;
                    node1.data = e;
                    flag = true;
                }
                node1 = node1.next;
            }
        }

        Node<E> node = head;
        while (node != null){
            System.out.print(node.data + ((node.next != null) ? "--->" : ""));
            node = node.next;
        }
        System.out.println();
    }
    public MyLinkedList<E> mergeSort(MyLinkedList<E> list1 ,MyLinkedList<E> list2) {
        if (list1 == null || list2 == null) return null;
        MyLinkedList<E> list = new MyLinkedList<>();
        list = list1;
        Node<E> node = list.head;
        while (node.next != null) node = node.next;
        node.next = list2.head;
        boolean flag;
        do {
            Node<E> temp = list.head;
            flag = false;
            while (temp.next != null) {
                if (temp.data.compareTo(temp.next.data) > 0) {
                    E e = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = e;
                    flag = true;
                }
                temp = temp.next;
            }
        } while (flag);
        Node<E> temp1 = list.head;
        do {
            System.out.print(temp1.data + ((temp1.next != null) ? "--->" : ""));
            temp1 = temp1.next;
        }while (temp1.next != null);
        return list;
    }

}