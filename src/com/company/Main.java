package com.company;

import java.util.PriorityQueue;

public class Main {

        public static void main(String[] args) {

            final int MUSK_AGE = 50;
            final int TUSK_AGE = 99;
            final int DAENERYS_AGE = 17;
            final int SERCEI_AGE = 66;

            PriorityQueue<People> people = new
                    PriorityQueue<>(new ComparatorForPityHuman());

            people.add(new People("Elon Musk", 'm', MUSK_AGE));
            people.add(new People("Elon Tusk", 'm', TUSK_AGE));
            people.add(new People("Daenerys", 'f', DAENERYS_AGE));
            people.add(new People("Sercei", 'f', SERCEI_AGE));


            while (!people.isEmpty()) {
                People cur = people.poll();
                System.out.println(cur.getName() + " " + cur.getAge());
            }
        }
    }