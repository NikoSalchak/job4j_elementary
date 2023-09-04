package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortSecondArrayBy3el() {
    int[] data = new int[] {5, 2, 3};
    int[] result = SortSelected.sort(data);
    int[] expected = new int[] {2, 3, 5};
    assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortThirdArrayBy5el() {
        int[] data = new int[] {9, 2, 5, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 5, 9};
        assertThat(result).containsExactly(expected);
    }
}