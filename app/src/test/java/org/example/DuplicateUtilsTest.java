package example.org;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateUtilsTest {

    @Test
    void testEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, DuplicateUtils.removeDuplicates(input));
    }

    @Test
    void testSingleElement() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A"));
        assertEquals(expected, DuplicateUtils.removeDuplicates(input));
    }

    @Test
    void testNoDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, DuplicateUtils.removeDuplicates(input));
    }

    @Test
    void testWithDuplicatesStrings() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A", "A", "B"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A", "B"));
        assertEquals(expected, DuplicateUtils.removeDuplicates(input));
    }

    @Test
    void testWithDuplicatesIntegers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        assertEquals(expected, DuplicateUtils.removeDuplicates(input));
    }
}
