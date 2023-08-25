package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenTriangleExist() {
        double ab = 4.0;
        double ac = 4.0;
        double bc = 4.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();

    }

    @Test
    void whenTriangleDoNotExist() {
        double ab = 3.0;
        double ac = 9.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}