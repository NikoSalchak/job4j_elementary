package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void manWeight168Then78() {
        short in = 168;
        double expected = 78.19;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void womanWeight() {
        short in = 171;
        double expected = 70.14;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}