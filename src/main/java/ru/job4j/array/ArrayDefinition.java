package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[10500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: ");
        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + names.length);
        System.out.println("Размер массива равен " + prices.length);
    }
}
