package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2  == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);

    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("Число четное. " + isEven(6));
        System.out.println("Число положительное. " + isPositive(6));
        System.out.println("Число нечетное. " + notEven(5));
        System.out.println("Число отрицательное. " + notPositive(-6));
        System.out.println("Число нечетное и положительное. " + notEvenAndPositive(5));
        System.out.println("Число четное или отрицательное. " + evenOrNotPositive(-5));
    }
}
