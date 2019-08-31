package sort.intersectionOfTwoArrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * sort.sort.intersectionOfTwoArrays.IntersectionOfTwoArraysTest
 *
 * @author Cloneable
 * @date 2019/7/21 13:09:21
 * @description
 */
public class IntersectionOfTwoArraysTest {
    @Test
    public void intersectionByLoopTest() {
        int[] num1 = new int[]{1, 2, 2, 1}, num2 = new int[]{2, 2};

        int[] result = sort.intersectionOfTwoArrays.IntersectionOfTwoArrays.intersectionByLoop(num1, num2);

        Assert.assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void intersectionBySortTest() {
        int[] num1 = new int[]{1, 2, 2, 1}, num2 = new int[]{2, 2};

        int[] result = sort.intersectionOfTwoArrays.IntersectionOfTwoArrays.intersectionBySort(num1, num2);

        Assert.assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void intersectionByMapTest() {
        int[] num1 = new int[]{1, 2, 2, 1}, num2 = new int[]{2, 2};

        int[] result = IntersectionOfTwoArrays.intersectionByMap(num1, num2);

        Assert.assertArrayEquals(new int[]{2}, result);
    }
}
