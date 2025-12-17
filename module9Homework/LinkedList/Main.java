package org.module9Homework.LinkedList;

class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(1)); // B
        list.remove(1);
        System.out.println(list.get(1)); // C
        System.out.println(list.size()); // 2
    }
}
