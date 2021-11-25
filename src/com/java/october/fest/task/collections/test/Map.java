package com.java.october.fest.task.collections.test;

import com.java.october.fest.task.collections.testUtil.Point;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import static com.java.october.fest.task.collections.testUtil.Point.generatePoint;

public class Map {
    static final int SIZE_OF_MAP = 100000;
    public static void main(String[] args) {
        Performance<java.util.Map> performance = new Performance<>();
        Point point = new Point(20.21, 20.21);

        HashMap<Integer,Point> hashMap = new HashMap<>();
        LinkedHashMap<Integer,Point> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,Point> treeMap = new TreeMap<>();

        System.out.println("Время вставки " + SIZE_OF_MAP + " объектов в hashSet " + performance.addToMap(hashMap));
        System.out.println("Время вставки " + SIZE_OF_MAP + " объектов в linkedHashSet " + performance.addToMap(linkedHashMap));
        System.out.println("Время вставки " + SIZE_OF_MAP + " объектов в treeSet " + performance.addToMap(treeMap));

        System.out.println("\nВремя добавления объекта в array hashSet " + performance.insertToMap(hashMap, point));
        System.out.println("Время добавления объекта в linkedHashSet " + performance.insertToMap(linkedHashMap, point));
        System.out.println("Время добавления объекта в linked treeSet " + performance.insertToMap(treeMap, point));

        System.out.println("\nВремя удаления объекта в hashSet " + performance.removeFromMap(hashMap, point));
        System.out.println("Время удаления объекта в linkedHashSet " + performance.removeFromMap(linkedHashMap, point));
        System.out.println("Время удаления объекта в treeSet " + performance.removeFromMap(treeMap, point));
    }

    private static class Performance<T extends java.util.Map> {
        long start, stop;

        public long addToMap(T map) {
            start = System.nanoTime();
            for (int i = 0; i < SIZE_OF_MAP; i++) {
                map.put(i, generatePoint());
            }
            stop = System.nanoTime();
            return (long) stop - start;
        }

        public long insertToMap(T map, Point point) {
            start = System.nanoTime();
            map.put(SIZE_OF_MAP/2, point);
            stop = System.nanoTime();
            return (long) stop - start;
        }

        public long removeFromMap(T map, Point point) {
            start = System.nanoTime();
            map.remove(SIZE_OF_MAP/2);
            stop = System.nanoTime();
            return (long) stop - start;
        }
    }
}
