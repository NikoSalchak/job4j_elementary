package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int i = 1234;
        int thousands = i / 1000;
        int hundreds = i % 1000 / 100;
        int tens = i % 100 / 10;
        int ones = i % 10;
        System.out.println(thousands + " " + hundreds + " " + tens + " " + ones);
        System.out.println();
        int first = 2;
        int second = 10;
        first += second;
        System.out.println("sum " + first);
        first = 2;
        second -= first;
        System.out.println("subtract " + second);
        second = 10;
        first *= second;
        System.out.println("multiply " + first);
        first = 2;
        second /= first;
        System.out.println("divide " + second);
    }
}
