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
        int[] result = new int[A.length];
        for(int i = 0, oddIndex = 1, evenIndex = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                result[evenIndex] = A[i];
                evenIndex += 2;
            } else {
                result[oddIndex] = A[i];
                oddIndex += 2;
            }
        }

        return result;
    }

    public static int[] sortArrayInPlaceByParityII(int[] A) {
        for(int oddIndex = 1, evenIndex = 0; evenIndex < A.length - 1; evenIndex += 2) {
            if(A[evenIndex] % 2 == 1) {
                while(A[oddIndex] % 2 == 1) {
                    oddIndex += 2;
                }

                swapArray(A, oddIndex, evenIndex);
            }
        }

        return A;
    }

    private static void swapArray(int[] A, int i, int swapIndex) {
        int temp = A[i];
        A[i] = A[swapIndex];
        A[swapIndex] = temp;
    }
}
