package algorithms.sorting;

import java.util.Arrays;

/**
 * Start of the project
 *
 * @author Anderson Spaniol
 */
public class Starter {

    public static void main(String[] args) {
        Integer[] array = {5, 3, 9, 1, 7, 4, 2, 3, 6, 10, 8};
        Sort<Integer> bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
