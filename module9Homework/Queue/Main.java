package org.module9Homework.Queue;

class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
