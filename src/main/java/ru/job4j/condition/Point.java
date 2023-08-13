package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
}

    public static double distance2(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;

    }

    public static void main(String[] args) {
        double result = distance(0, 0, 25, 0);
        double result2 = distance2(0, 0, 2, 0);
        System.out.println("Расстояние между точками кординат d2 " + result);
        System.out.println("Расстояние между точками кординат d1 " + result2);
        }
    }


