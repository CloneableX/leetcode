package sort.sortArrayByParityII;

/**
 * sort.sortArrayByParityII.SortArrayByParityII
 *
 * @author Cloneable
 * @date 2019/7/30 08:50:30
 * @description
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        for(int i = 0, oddIndex = 1, evenIndex = 0; i < A.length; i++) {
            if(isOdd(i)) {
                if(!isOdd(A[i])) {
                    swapArray(A, i, evenIndex);
                    evenIndex += 2;
                    i--;
                } else if(i == oddIndex) {
                    oddIndex += 2;
                }
            } else if(!isOdd(i)) {
                if(isOdd(A[i])) {
                    swapArray(A, i, oddIndex);
                    oddIndex += 2;
                    i--;
                } else if(i == evenIndex) {
                    evenIndex += 2;
                }
            }
        }

        return A;
    }

    private static void swapArray(int[] A, int i, int swapIndex) {
        int temp = A[i];
        A[i] = A[swapIndex];
        A[swapIndex] = temp;
    }

    private static boolean isOdd(int val) {
        return val % 2 == 1;
    }
}
