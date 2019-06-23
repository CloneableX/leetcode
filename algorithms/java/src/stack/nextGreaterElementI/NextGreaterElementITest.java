package stack.nextGreaterElementI;

import org.junit.Assert;
import org.junit.Test;

/**
 * stack.nextGreaterElementI.NextGreaterElementITest
 *
 * @author Cloneable
 * @date 2019/6/22 20:55:22
 * @description
 */
public class NextGreaterElementITest {
    @Test
    public void test1() {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] result = new NextGreaterElementI().nextGreaterElement(nums1, nums2);

        int[] expected = new int[]{-1,3,-1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        int[] result = new NextGreaterElementI().nextGreaterElement(nums1, nums2);

        int[] expected = new int[]{3,-1};
        Assert.assertArrayEquals(expected, result);
    }
}
