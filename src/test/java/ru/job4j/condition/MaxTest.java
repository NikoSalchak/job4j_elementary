package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenLeftEqualRightThenEqually() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeftLargerRightThenMaxLeft() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenRightLargerLeftThenMaxright() {
        int left = 4;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}