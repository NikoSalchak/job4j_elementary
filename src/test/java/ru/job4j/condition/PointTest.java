package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to250Then25dot0() {
        Point point = new Point(0, 0);
        Point secondPoint = new Point(25, 0);
        point.distance(secondPoint);
        double expected = 25.0;
        assertThat(point.distance(secondPoint)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55to78Then3dot6() {
        Point point = new Point(5, 5);
        Point secondPoint = new Point(7, 8);
        point.distance(secondPoint);
        double expected = 3.6;
        assertThat(point.distance(secondPoint)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when255to55Then20dot0() {
        Point point = new Point(25, 5);
        Point secondPoint = new Point(5, 5);
        point.distance(secondPoint);
        double expected = 20.0;
        assertThat(point.distance(secondPoint)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when555to780Then6dot16() {
        Point point = new Point(5, 5, 5);
        Point secondPoint = new Point(7, 8, 0);
        point.distance3d(secondPoint);
        double expected = 6.16;
        assertThat(point.distance3d(secondPoint)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when555to780Then3dot() {
        Point point = new Point(5, -3, 7);
        Point secondPoint = new Point(4, 8, 0);
        point.distance3d(secondPoint);
        double expected = 13.07;
        assertThat(point.distance3d(secondPoint)).isEqualTo(expected, withPrecision(0.01));
    }
}