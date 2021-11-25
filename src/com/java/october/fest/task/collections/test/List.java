package com.java.october.fest.task.collections.test;

import com.java.october.fest.task.collections.testUtil.Point;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.java.october.fest.task.collections.testUtil.Point.generatePoint;

public class List {
    static final int SIZE_OF_LIST = 100000;

    public static void main(String[] args) {
        Performance<java.util.List> performance = new Performance<>();
        Point point = new Point(20.21, 20.21);

        ArrayList<Point> arrayList = new ArrayList<>();
        LinkedList<Point> linkedList = new LinkedList<>();

        System.out.println("Время вставки " + SIZE_OF_LIST + " объектов в arrayList " + performance.addToList(arrayList));
        System.out.println("Время вставки " + SIZE_OF_LIST + " объектов в linkedList " + performance.addToList(linkedList));

        System.out.println("\nВремя добавления объекта в array List " + performance.insertToList(arrayList, point));
        System.out.println("Время добавления объекта в linked List " + performance.insertToList(linkedList, point));

        System.out.println("\nВремя удаления объекта в arrayList " + performance.removeFromList(arrayList, point));
        System.out.println("Время удаления объекта в linkedList " + performance.removeFromList(linkedList, point));
    }


    private static class Performance<T extends java.util.List> {
        long start, stop;

        public long addToList(T list) {
            start = System.nanoTime();
            for (int i = 0; i < SIZE_OF_LIST; i++) {
                list.add(generatePoint());
            }
            stop = System.nanoTime();
            return stop - start;
        }

        public long insertToList(T list, Point point) {
            start = System.nanoTime();
            list.add(SIZE_OF_LIST / 2, point);
            stop = System.nanoTime();
            return stop - start;
        }

        public long removeFromList(T list, Point point) {
            start = System.nanoTime();
            list.remove(point);
            stop = System.nanoTime();
            return stop - start;
        }
    }
}
