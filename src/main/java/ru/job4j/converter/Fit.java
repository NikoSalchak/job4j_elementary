package ru.job4j.converter;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {

        double man = manWeight(168);
        double woman = womanWeight(171);
        System.out.println("Man is 168 is " + man);
        System.out.println("Woman is 171 is " + woman);
    }
    }
