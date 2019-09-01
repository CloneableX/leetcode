package sort.largestPerimeterTriangle;

import java.util.Arrays;

/**
 * sort.sort.largestPerimeterTriangle.LargestPerimeterTriangle
 *
 * @author Cloneable
 * @date 2019/8/10 20:25:10
 * @description
 */
public class LargestPerimeterTriangle {
    private static int TRIANGLE_ARRAY_LEN = 3;

    // by quick sort
    public static int largestPerimeterQsort(int[] A) {
        Arrays.sort(A);

        for (int i = A.length - 1; i > 1 ; i--) {
            if(A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }

        return 0;
    }

    // by choose sort
    public static int largestPerimeterChooseSort(int[] A) {
        int[] T = new int[TRIANGLE_ARRAY_LEN];
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(A[i] < A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }

            T[k++] = A[i];
            k %= TRIANGLE_ARRAY_LEN;
            if(i > 1 && T[(k + 1) % TRIANGLE_ARRAY_LEN] + T[(k + 2) % TRIANGLE_ARRAY_LEN] > T[k]) {
                return T[(k + 1) % TRIANGLE_ARRAY_LEN] + T[(k + 2) % TRIANGLE_ARRAY_LEN] + T[k];
            }
        }

        return 0;
    }
}
