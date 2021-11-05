package com.javaoctoberfest.task.Horstmann.chapter_1;

import java.util.ArrayList;
import java.util.Comparator;


public class Exercise13 {
    public static ArrayList lottery() {
        ArrayList<Integer> combination = new ArrayList();
        ArrayList<Integer> winCombination = new ArrayList();

        for (int i = 1; i < 50; i++) {
            combination.add(i);
        }

        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * combination.size());
            winCombination.add(i, combination.get(index));
        }

        winCombination.sort(Comparator.naturalOrder());
        return winCombination;
    }
}
