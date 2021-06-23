package algorithms.sorting;

/**
 * Class to represent the BubbleSort algorithm
 * https://en.wikipedia.org/wiki/Bubble_sort
 *
 * @author Anderson Spaniol
 * @param <T>
 */
public class BubbleSort<T extends Comparable> extends Sort {

    @Override
    public void sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            int changes = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    Comparable tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    changes++;
                }
            }
            if (changes == 0) {
                break;
            }
        }
    }

}
