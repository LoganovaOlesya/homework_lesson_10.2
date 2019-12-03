package com.company;

public class People {

    public static final int RETIRED_MALE_AGE = 65;
    public static final int RETIRED_FEMALE_AGE = 60;

    private String name;
    private char sex;
    private int age;

    public void setName(final String n) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(final char s) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setAge(final int a) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public People(final String name, final char sex, final int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getRetiredAge() {
        if (sex == 'm') {
            return RETIRED_MALE_AGE;
        } else if (sex == 'f') {
            return RETIRED_FEMALE_AGE;
        }
        throw new IllegalArgumentException("What are you?");
    }
}
