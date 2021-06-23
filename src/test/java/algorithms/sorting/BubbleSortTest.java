package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for class BubbleSort
 *
 * @author Anderson Spaniol
 */
public class BubbleSortTest {

    public BubbleSortTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sort method, of class BubbleSort.
     */
    @org.junit.jupiter.api.Test
    public void testSort() {
        System.out.println("sort");
        BubbleSort instance = new BubbleSort();
        List<TestCasesGenerator.TestCase> testCases = TestCasesGenerator.generate();
        for (TestCasesGenerator.TestCase testCase : testCases) {
            Integer[] original = testCase.getOriginal();
            Integer[] sorted = testCase.getSorted();
            System.out.println(Arrays.toString(original));
            instance.sort(original);
            assertArrayEquals(sorted, original);
        }
    }

}
