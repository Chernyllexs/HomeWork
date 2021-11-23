package com.java.october.fest.task.collections.solurion;

import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    @Override
    public void add(E element) {
        final Node<E> lastNode = last;
        final Node<E> newNode = new Node<>(lastNode, element, null);
        last = newNode;
        if (lastNode == null)
            first = newNode;
        else
            lastNode.next = newNode;
        size++;
    }

    @Override
    public void add(int index, E element) {

        

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        Node<E> currentNode = first;
        if (index >= size || index < 0)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next();
        }
        return currentNode.item;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
