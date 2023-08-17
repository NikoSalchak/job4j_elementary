package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 168;
        double man = manWeight(height);
        height = 171;
        double woman = womanWeight(height);
        System.out.println("Man is 168 is " + man);
        System.out.println("Woman is 171 is " + woman);
    }
}
