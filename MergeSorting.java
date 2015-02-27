package igeek.algorithm.sorting;

/**
 * @author Dylan  2015-1-31
 */
public class MergeSorting {
    private static int[] ARRAY_A = {9, 20,22222,666666};
    private static int[] ARRAY_B = {5, 11, 1555};

    public static void main(String[] args) {
        int totalLength = ARRAY_A.length + ARRAY_B.length;
        int[] array = new int[totalLength];
        int currentIndex = 0;
        int currentIndexA = 0;
        int currentIndexB = 0;
        while (currentIndexA < ARRAY_A.length && currentIndexB < ARRAY_B.length) {
            //1：取出A,B中最小的数，并且序列加1，向后传递，
            // 结果是肯定有一组数组完全进入到array里面
            if (ARRAY_A[currentIndexA] < ARRAY_B[currentIndexB]) {
                array[currentIndex++] = ARRAY_A[currentIndexA++];
            } else {
                array[currentIndex++] = ARRAY_B[currentIndexB++];
            }
        }
        //2：这里只是把数组里面剩余的元素补充完整
        while (currentIndexA < ARRAY_A.length) {
            array[currentIndex++] = ARRAY_A[currentIndexA++];
        }
        while (currentIndexB < ARRAY_B.length) {
            array[currentIndex++] = ARRAY_B[currentIndexB++];
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
}
