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
    void whenRightLargerLeftThenMaxRight() {
        int left = 4;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeftMiddleRightLargerRight() {
        int left = 2;
        int middle = 5;
        int right = 8;
        int result = Max.max(left, middle, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeftMiddleThirdRightLargerThird() {
        int left = 2;
        int middle = 5;
        int third = 11;
        int right = 10;
        int result = Max.max(left, middle, third, right);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}