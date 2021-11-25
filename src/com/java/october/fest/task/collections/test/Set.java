package com.java.october.fest.task.collections.test;

import com.java.october.fest.task.collections.testUtil.Point;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static com.java.october.fest.task.collections.testUtil.Point.generatePoint;

public class Set {
    static final int SIZE_OF_SET = 100000;

    public static void main(String[] args) {
        Performance<java.util.Set> performance = new Performance<>();
        Point point = new Point(20.21, 20.21);

        HashSet<Point> hashSet = new HashSet<>();
        LinkedHashSet<Point> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Point> treeSet = new TreeSet<>();

        System.out.println("Время вставки " + SIZE_OF_SET + " объектов в hashSet " + performance.addToSet(hashSet));
        System.out.println("Время вставки " + SIZE_OF_SET + " объектов в linkedHashSet " + performance.addToSet(linkedHashSet));
        System.out.println("Время вставки " + SIZE_OF_SET + " объектов в treeSet " + performance.addToSet(treeSet));

        System.out.println("\nВремя добавления объекта в array hashSet " + performance.insertToSet(hashSet, point));
        System.out.println("Время добавления объекта в linkedHashSet " + performance.insertToSet(linkedHashSet, point));
        System.out.println("Время добавления объекта в linked treeSet " + performance.insertToSet(treeSet, point));

        System.out.println("\nВремя удаления объекта в hashSet " + performance.removeFromSet(hashSet, point));
        System.out.println("Время удаления объекта в linkedHashSet " + performance.removeFromSet(linkedHashSet, point));
        System.out.println("Время удаления объекта в treeSet " + performance.removeFromSet(treeSet, point));
    }

    private static class Performance<T extends java.util.Set> {
        long start, stop;

        public long addToSet(T set) {
            start = System.nanoTime();
            for (int i = 0; i < SIZE_OF_SET; i++) {
                set.add(generatePoint());
            }
            stop = System.nanoTime();
            return stop - start;
        }

        public long insertToSet(T set, Point point) {
            start = System.nanoTime();
            set.add(point);
            stop = System.nanoTime();
            return stop - start;
        }

        public long removeFromSet(T set, Point point) {
            start = System.nanoTime();
            set.remove(point);
            stop = System.nanoTime();
            return stop - start;
        }
    }
}
