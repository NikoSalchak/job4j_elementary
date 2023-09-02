package ru.job4j.array;

import java.io.FilterOutputStream;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
                if (word[i] != pref[i]) {
                    result = false;
                }
        }
        return result;
    }
}

