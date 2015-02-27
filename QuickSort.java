package igeek.algorithm.sorting;

/**
 * @author Dylan  2015-2-27
 */
public class QuickSort {

    public final static int[] array = new int[]{111,43,2,454545,11, 5, 20, 1, 53};

    public static void main(String[] args) {
        quickSort(0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    static void quickSort(int left, int right) {
        if (left > right) return;
        int leftIncIndex, rightDecIndex, current;
        leftIncIndex = left;
        rightDecIndex = right;
        current = array[left];

        while (leftIncIndex != rightDecIndex) {
            while (array[rightDecIndex] >= current && leftIncIndex < rightDecIndex) {
                rightDecIndex--;
            }
            while (array[leftIncIndex] <= current && leftIncIndex < rightDecIndex) {
                leftIncIndex++;
            }
            if (leftIncIndex < rightDecIndex) {
                int tmp = array[leftIncIndex];
                array[leftIncIndex] = array[rightDecIndex];
                array[rightDecIndex] = tmp;
            }
        }
        array[left] = array[leftIncIndex];
        array[leftIncIndex] = current;
        quickSort(left, leftIncIndex - 1);
        quickSort(leftIncIndex + 1, right);
    }
}
