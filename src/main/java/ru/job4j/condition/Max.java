package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int middle, int right) {
        int result = max(max(left, middle), right);
        return result;
    }

    public static int max(int left, int middle, int third, int right) {
        int result = max(max(left, middle, third), right);
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(2, 2);
        System.out.println(result);
        result = Max.max(4, 2);
        System.out.println(result);
        result = Max.max(4, 8);
        System.out.println(result);
        System.out.println("Max number between three numbers " + max(2, 5, 8));
        System.out.println("Max number between fourth numbers " + max(2, 5, 11, 10));
    }
}
