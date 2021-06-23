package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates the test cases for all Sort algorithms
 *
 * @author Anderson Spaniol
 */
public class TestCasesGenerator {

    public static List<TestCase> generate() {
        List<TestCase> testCases = new ArrayList();
        Integer[] original;
        Integer[] sorted;
        TestCase testCase;
        //
        original = new Integer[]{5, 3, 9, 1, 7, 4, 2, 3, 6, 10, 8};
        sorted = new Integer[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10};
        testCase = new TestCase(original, sorted);
        testCases.add(testCase);
        //
        original = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sorted = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        testCase = new TestCase(original, sorted);
        testCases.add(testCase);
        //
        original = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sorted = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        testCase = new TestCase(original, sorted);
        testCases.add(testCase);
        return testCases;
    }

    public static class TestCase {

        private final Integer[] original;
        private final Integer[] sorted;

        public TestCase(Integer[] original, Integer[] sorted) {
            this.original = original;
            this.sorted = sorted;
        }

        public Integer[] getOriginal() {
            return original;
        }

        public Integer[] getSorted() {
            return sorted;
        }

    }

}
