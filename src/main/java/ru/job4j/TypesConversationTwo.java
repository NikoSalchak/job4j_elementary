package ru.job4j;

public class TypesConversationTwo {
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.print("Преобразования с потерей данных: 1 выражение " + b + "; ");
        //2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.print(" 2 выражение " + rsl + "; ");
        //4 выражение
        double d = 121.19;
        byte b2 = (byte) d;
        System.out.println(" 4 выражение " + b2 + "; ");
        //3 Выражение
        char c = 45000;
        float i2 = c;
        System.out.print("Преобразования без потери данных: 3 выражение " + i2 + "; ");
        // 5 выражение
        short s = 1500;
        char c2 = (char) s;
        double d2 = c2;
        System.out.println("5 выражение " + d2 + "; ");
    }
}
