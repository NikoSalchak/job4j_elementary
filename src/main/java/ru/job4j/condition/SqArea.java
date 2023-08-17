package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return s;

    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        double result2 = square(4, 1);
        double result3 = square(10, 4);
        System.out.println("Если P = 6; k = 2; то S = " + result1);
        System.out.println("Если P = 4; k = 1; то S = " + result2);
        System.out.println("Если P = 10; k = 4; то S = " + result3);
    }
}
