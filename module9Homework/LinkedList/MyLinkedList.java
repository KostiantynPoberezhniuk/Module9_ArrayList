package org.module9Homework.LinkedList;

class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node<T> current = getNode(index);
        Node<T> prevNode = current.previous;
        Node<T> nextNode = current.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            first = nextNode;
        }
        if (nextNode != null) {
            nextNode.previous = prevNode;
        } else {
            last = prevNode;
        }
        size--;
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index);
        }

        Node<T> current;

        if (index < size / 2) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current;
    }
}
