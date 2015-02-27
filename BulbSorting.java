package igeek.algorithm.sorting;

/**
 * @author Dylan  2015-1-31
 */
public class BulbSorting {
    private static final int[] ARRAY = {1011, 40, 50, 1238, 1, 2, 12314, 1233, 7, 6, 5};

    public static void main(String[] args) {
        for (int currentIndex = 1; currentIndex < ARRAY.length - 1; currentIndex++) {
            for (int nextIndex = 0; nextIndex < ARRAY.length - currentIndex; nextIndex++) {
                if (ARRAY[nextIndex] < ARRAY[nextIndex + 1]) {
                    int tmp = ARRAY[nextIndex];
                    ARRAY[nextIndex] = ARRAY[nextIndex + 1];
                    ARRAY[nextIndex + 1] = tmp;
                }
            }
        }
        for (int a : ARRAY) {
            System.out.println(a);
        }
    }
}
