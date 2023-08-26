package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @Test
    void whenNumberDividesBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3andEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number doesn't divides by 3, but it's the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "The number doesn't divides by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}