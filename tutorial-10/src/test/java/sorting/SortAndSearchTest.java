package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortAndSearchTest {
    private static int[] unsortedArray = {0, 5, 1, 3, 2, 4};
    private static int[] sortedArray = {0, 1, 2, 3, 4, 5};

    @Test
    public void slowSortTest() {
        int[] test = unsortedArray;
        Sorter.slowSort(test);
        for (int i = 0; i < unsortedArray.length; i++) {
            assertEquals(test[i], sortedArray[i]);
        }
    }

    @Test
    public void fastSortTest() {
        int[] test = unsortedArray;
        Sorter.fastSort(test);
        for (int i = 0; i < unsortedArray.length; i++) {
            assertEquals(test[i], sortedArray[i]);
        }
    }

    @Test
    public void slowSearchTest() {
        int search = 4;
        assertEquals(search, Finder.slowSearch(unsortedArray, search));
        assertEquals(-1, Finder.slowSearch(unsortedArray, 10));
    }

    @Test
    public void binarySearchTest() {
        int search = 4;
        assertEquals(search, Finder.binarySearch(unsortedArray, search));
        assertEquals(-1, Finder.slowSearch(unsortedArray, 10));
    }
}
