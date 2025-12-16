package org.module9Homework.Stack;

class MyStack<V> {
    private Node<V> top;
    private int size;

    public void push(V value) {
        Node<V> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public V peek() {
        return top == null ? null : top.value;
    }

    public V pop() {
        if (top == null) {
            return null;
        }
        V value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public int size() {
        return size;
    }


    public void clear() {
        top = null;
        size = 0;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        if (index == 0) {
            pop();
            return;
        }
        Node<V> current = top;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}
