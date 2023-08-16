package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceDivide(double first, double second) {
        return difference(first, second)
                + divides(first, second);
    }

    public static double allTheCalculations(double first, double second, double third, double fourth) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + divides(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы операций из класса Math function: разности двух чисел и деления двух чисел равен: " + sumDifferenceDivide(50, 10));
        System.out.println("Результат вычисления сумм всех операций из класса Math Function равен " + allTheCalculations(10, 20, 50, 10));
    }
}
