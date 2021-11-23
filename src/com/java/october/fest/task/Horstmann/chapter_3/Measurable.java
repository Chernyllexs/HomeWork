package com.java.october.fest.task.Horstmann.chapter_3;

public interface Measurable {

    static double average(Measurable[] objects) {
        double averageVal = 0;
        for (Measurable obj : objects)
            averageVal += obj.getMeasure();

        return averageVal / objects.length;
    }

    static Measurable largest(Measurable[] objects) {
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure())
                largest = obj;
        }
        return largest;
    }

    double getMeasure();
}
