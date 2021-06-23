package algorithms.sorting;

/**
 * Abstract class to represent a Sort algorithm
 *
 * @author Anderson Spaniol
 * @param <T>
 */
public abstract class Sort<T extends Comparable> {

    public abstract void sort(T[] array);

}
