package com.company;

import java.util.Comparator;

public class ComparatorForPityHuman implements Comparator<People> {

    @Override
    public int compare(final People human1, final People human2) {

        if (human2.getAge() > human1.getRetiredAge()) {
            return 1;
        }
        if (human2.getAge() < human1.getRetiredAge()) {
            return -1;
        }

        return 0;
    }
}
