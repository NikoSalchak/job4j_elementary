package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas55Then5() {
        int[] data = new int[] {5, 15, 25, 35, 45, 55};
        int el = 55;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas6ThenMinus1() {
        int[] data = new int[] {2, 5, 3, 4, 7};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}