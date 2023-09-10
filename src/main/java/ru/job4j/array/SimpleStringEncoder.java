package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                counter++;
                i++;
            }
            result += input.charAt(i);
            if (counter > 1) {
                result += counter;
                counter = 1;
            }
        }
        return result;
    }
}
