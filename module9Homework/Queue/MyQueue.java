package org.module9Homework.Queue;

class MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T peek() {
        if (first == null) {
            return null;
        }
        return first.value;
    }

    public T poll() {
        if (first == null) {
            return null;
        }
        T value = first.value;

        first = first.next;
        if (first == null) {
            last = null;
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
}
