package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[i + 3] != post[i]) {
                result = false;
            }
        }
        return result;
    }
}
