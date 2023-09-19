package com.mylearning.core.generics.practice.limkedlist;


/**
 * Создайте параметризованный класс LinkedList<T>, который реализует связный список.
 * Он должен иметь методы add, remove и get, позволяющие добавлять, удалять и получать
 * элементы списка соответственно. Создайте объект LinkedList с параметром типа String,
 * добавьте в него несколько элементов, удалите из него несколько элементов и получите несколько элементов.
 */
public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public void add(E elem) {
        Node<E> lastNode = new Node<>(elem, null, head);
        if (isEmpty()) {
            tail = lastNode;
        } else {
            head.next = lastNode;
        }
        head = lastNode;
        size++;
    }

    public E remove(int index) {
        Node<E> node = getNode(index);
        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (node == tail) {
            tail = node.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        E removedData = node.elem;
        node.elem = null;
        node.next = null;
        node.prev = null;
        size--;
        return removedData;
    }

    public E get(int index) {
        if (index != size) {
            checkIndex(index);
        }
        return getNode(index).getElem();
    }

    private Node<E> getNode(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            if (index == 0) {
                return head;
            }
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            if (index == size - 1) {
                return tail;
            }
            node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index <= 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    private static class Node<E> {
        E elem;
        Node<E> next;
        Node<E> prev;

        public Node(E elem, Node<E> next, Node<E> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }

        public E getElem() {
            return elem;
        }

        public void setValue(E elem) {
            this.elem = elem;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
