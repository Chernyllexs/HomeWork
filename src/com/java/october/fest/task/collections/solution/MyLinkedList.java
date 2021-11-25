package com.java.october.fest.task.collections.solution;

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
        final Node<E> currentNode = findByIndex(index);
        final Node<E> prevNode = currentNode.prev;
        final Node<E> newNode = new Node<>(prevNode, element, currentNode);
        prevNode.next = newNode;
        currentNode.prev = newNode;
        size++;
    }

    @Override
    public void clear() {
        Node<E> currentNode = first;
        while (currentNode != null) {
            Node<E> nextNode = currentNode.next;
            nullification(currentNode);
            currentNode = nextNode;
        }
        size = 0;
        first = last = null;
    }

    @Override
    public E get(int index) {
        return findByIndex(index).item;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        Node<E> currentNode = first;
        if (element == null) {
            while (currentNode != null) {
                if (currentNode.item == null)
                    return index;
                currentNode = currentNode.next;
                index++;
            }
        } else {
            while (currentNode != null) {
                if (element.equals(currentNode.item))
                    return index;
                currentNode = currentNode.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        final Node<E> currentNode = findByIndex(index);
        E oldElement = currentNode.item;
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        nullification(currentNode);
        size--;
        return oldElement;
    }

    @Override
    public E set(int index, E element) {
        final Node<E> currentNode = findByIndex(index);
        E oldElement = currentNode.item;
        currentNode.item = element;
        return oldElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        Node<E> currentNode = first;
        while (currentNode != null) {
            result[i++] = currentNode.item;
            currentNode = currentNode.next;
        }
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public String toString() {
        Node<E> currentNode = first;
        StringBuilder result = new StringBuilder();
        while (currentNode != null) {
            result.append(currentNode.item.toString());
            result.append("; ");
            currentNode = currentNode.next;
        }
        return result.toString();
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            Node currentNode = first;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E item = (E) currentNode.item;
                    currentNode = currentNode.next;
                    return item;
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not implemented.");
            }

        };
    }

    private Node<E> findByIndex(int index) {
        if (index >= size || index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    private void nullification(Node<E> currentNode) {
        currentNode.prev = null;
        currentNode.next = null;
        currentNode.item = null;
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


