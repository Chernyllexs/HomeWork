package com.java.october.fest.task.collections;

import com.java.october.fest.task.collections.solution.MyLinkedList;
import com.java.october.fest.task.collections.testUtil.Point;
import java.util.LinkedList;


public class MainClass {
    static final int SIZE_OF_LIST = 10000;
    public static void main(String[] args) {
        MyLinkedList<Point> myLinkedList = new MyLinkedList<>();
        LinkedList<Point> linkedList = new LinkedList<>();
        long start, stop;
        Point point = new Point(20.21,20.21);

        start = System.nanoTime();
        addToMyList(myLinkedList);
        stop = System.nanoTime();
        System.out.println("Время вставки " + SIZE_OF_LIST + " объектов в MyLinkedList " + (stop - start));

        start = System.nanoTime();
        addToList(linkedList);
        stop = System.nanoTime();
        System.out.println("Время вставки " + SIZE_OF_LIST + " объектов в LinkedList " + (stop - start));


        start = System.nanoTime();
        myLinkedList.add((int)(Math.random() * SIZE_OF_LIST), point);
        stop = System.nanoTime();
        System.out.println("Время вставки одного объекта в MyLinkedList " + (stop - start));

        start = System.nanoTime();
        linkedList.add((int)(Math.random() * SIZE_OF_LIST), point);
        stop = System.nanoTime();
        System.out.println("Время вставки одного объекта в LinkedList " + (stop - start));

        start = System.nanoTime();
        int indexFromMyList = myLinkedList.indexOf(point);
        stop = System.nanoTime();
        System.out.println("Время нахождения индекса объекта в MyLinkedList " + (stop - start));

        start = System.nanoTime();
        int indexFromList = linkedList.indexOf(point);
        stop = System.nanoTime();
        System.out.println("Время нахождения индекса объекта в LinkedList " + (stop - start));

        start = System.nanoTime();
        myLinkedList.remove(indexFromMyList);
        stop = System.nanoTime();
        System.out.println("Время удаления объекта в MyLinkedList " + (stop - start));

        start = System.nanoTime();
        linkedList.remove(indexFromList);
        stop = System.nanoTime();
        System.out.println("Время удаления объекта в LinkedList " + (stop - start));


    }

    private static Point generatePoint() {
        return new Point(Math.random() * 10, Math.random() * 10);
    }

    private static void addToMyList(MyLinkedList list) {
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.add(generatePoint());
        }
    }

    private static void addToList(LinkedList list) {
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.add(generatePoint());
        }
    }


}
