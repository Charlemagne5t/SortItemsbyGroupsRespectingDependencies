import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void sortItemsTest1() {
        int n = 8;
        int m = 2;
        int[] group = {-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems = new ArrayList<>(List.of(
                new ArrayList<>(),
                new ArrayList<>(List.of(6)),
                new ArrayList<>(List.of(5)),
                new ArrayList<>(List.of(6)),
                new ArrayList<>(List.of(3, 6)),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        ));
        int[] expected = {6, 3, 4, 1, 5, 2, 0, 7};
        int[] actual = new Solution().sortItems(n, m, group, beforeItems);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortItemsTest2() {
        int n = 8;
        int m = 2;
        int[] group = {-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems = new ArrayList<>(List.of(
                new ArrayList<>(),
                new ArrayList<>(List.of(6)),
                new ArrayList<>(List.of(5)),
                new ArrayList<>(List.of(6)),
                new ArrayList<>(List.of(3)),
                new ArrayList<>(),
                new ArrayList<>(List.of(4)),
                new ArrayList<>()
        ));
        int[] expected = {};
        int[] actual = new Solution().sortItems(n, m, group, beforeItems);

        Assert.assertArrayEquals(expected, actual);
    }
}
