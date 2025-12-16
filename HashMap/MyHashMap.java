package org.module9Homework.HashMap;

class MyHashMap<K, V> {
    private Node<K, V> firstElement;
    private int size;

    public void put(K key, V value) {

        Node<K, V> current = firstElement;

        while (current != null) {
            if ((current.key == null && key == null) || (current.key != null && current.key.equals(key))) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);

        newNode.next = firstElement;
        firstElement = newNode;
        size++;
    }

    public void remove(K key) {
        if (firstElement == null) {
            return;
        }

        if ((firstElement.key == null && key == null) || (firstElement.key != null && firstElement.key.equals(key))) {
            firstElement = firstElement.next;
            size--;
            return;
        }

        Node<K, V> current = firstElement;

        while (current.next != null) {
            if ((current.next.key == null && key == null) || (current.next.key != null && current.next.key.equals(key))) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void clear() {
        firstElement = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        Node<K, V> current = firstElement;
        while (current != null) {
            if ((current.key == null && key == null) || (current.key != null && current.key.equals(key))) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}