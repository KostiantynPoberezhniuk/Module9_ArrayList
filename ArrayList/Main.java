package org.module9Homework.ArrayList;

class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list.size());
        list.clear();
    }
}
