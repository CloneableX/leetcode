package sort.intersectionOfTwoArraysII;

import org.junit.Assert;
import org.junit.Test;

/**
 * sort.sort.intersectionOfTwoArraysII.IntersectionOfTwoArraysIITest
 *
 * @author Cloneable
 * @date 2019/7/27 21:10:27
 * @description
 */
public class IntersectionOfTwoArraysIITest {
    @Test
    public void intersectionTest() {
        int[] result = sort.intersectionOfTwoArraysII.IntersectionOfTwoArraysII.intersection(new int[]{1,2,2,1}, new int[]{2,2});

        Assert.assertArrayEquals(new int[]{2,2}, result);
    }

    @Test
    public void intersectionTestII() {
        int[] result = IntersectionOfTwoArraysII.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});

        Assert.assertArrayEquals(new int[]{4,9}, result);
    }
}
