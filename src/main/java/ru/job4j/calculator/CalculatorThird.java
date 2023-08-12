package ru.job4j.calculator;

public class CalculatorThird {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);

    }

    public static void main(String[] args) {
        CalculatorThird.plus(100, 500);
        CalculatorThird.plus(4, 2);
        CalculatorThird.plus(3, 5);
    }
}
