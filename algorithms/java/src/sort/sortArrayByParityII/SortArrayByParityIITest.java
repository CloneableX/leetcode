package sort.sortArrayByParityII;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * sort.sortArrayByParityII.SortArrayByParityIITest
 *
 * @author Cloneable
 * @date 2019/8/1 08:41:01
 * @description
 */
public class SortArrayByParityIITest {
    @Test
    public void sortArrayByParityIITest() {
        int[] A = new int[]{4,2,5,7};
        int[] result = SortArrayByParityII.sortArrayByParityII(A);

        int[][] expected = new int[][]{
                {4,5,2,7},
                {4,7,2,5},
                {2,5,4,7},
                {2,7,4,5}
        };

        boolean expectedResult = false;
        for(int i = 0; i < expected.length; i++) {
            if(Arrays.equals(expected[i], result)) {
                expectedResult = true;
                break;
            }
        }

        Assert.assertTrue(expectedResult);
    }
}
