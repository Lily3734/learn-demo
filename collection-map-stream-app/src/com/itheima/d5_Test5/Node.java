package com.itheima.d5_Test5;

public class Node<E> {
    private E Date;
    private Node<E> next;

    public Node() {
    }

    public Node(E date, Node<E> next) {
        Date = date;
        this.next = next;
    }

    public E getDate() {
        return this.Date;
    }

    public void setDate(E date) {
        Date = date;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
