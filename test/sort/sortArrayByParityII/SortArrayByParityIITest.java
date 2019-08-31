package sort.sortArrayByParityII;

import org.junit.Assert;
import org.junit.Test;

/**
 * sort.SortArrayByParityIITest
 *
 * @author Cloneable
 * @date 2019/8/1 08:41:01
 * @description
 */
public class SortArrayByParityIITest {
    @Test
    public void sortArrayByParityIITest() {
        int[] A = new int[]{3,1,4,2};
        int[] result = sort.sortArrayByParityII.SortArrayByParityII.sortArrayByParityII(A);

        Assert.assertTrue(isParityArray(result));
    }

    @Test
    public void sortArrayInPlaceByParityIITest() {
        int[] A = new int[]{3,1,4,2};
        int[] result = SortArrayByParityII.sortArrayInPlaceByParityII(A);

        Assert.assertTrue(isParityArray(result));
    }

    private boolean isParityArray(int[] result) {
        boolean expectedResult = true;
        for(int i = 0; i < result.length; i++) {
            if(i % 2 != result[i] % 2) {
                expectedResult = false;
                break;
            }
        }
        return expectedResult;
    }
}
