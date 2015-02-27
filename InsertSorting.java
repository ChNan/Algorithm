package igeek.algorithm.sorting;

/**
 * @author Dylan  2015-1-31
 */
public class InsertSorting {
    private static final int[] ARRAY = {1011, 40, 50, 1238, 1, 2, 12314, 1233, 7, 6, 5};

    public static void main(String[] args) {
        for (int currentIndex = 1; currentIndex < ARRAY.length; currentIndex++) {
            int currentValue = ARRAY[currentIndex];
            for (int prevIndex = currentIndex - 1; prevIndex >= 0; prevIndex--) {
                int prevValue = ARRAY[prevIndex];
                if (currentValue < prevValue) {
                    ARRAY[prevIndex] = currentValue;
                    ARRAY[prevIndex + 1] = prevValue;
                }
            }
        }
        for (int a : ARRAY) {
            System.out.println(a);
        }
    }
}
