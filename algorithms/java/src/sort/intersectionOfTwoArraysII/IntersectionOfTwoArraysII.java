package sort.intersectionOfTwoArraysII;

import java.util.Arrays;

/**
 * sort.intersectionOfTwoArraysII.IntersectionOfTwoArraysII
 *
 * @author Cloneable
 * @date 2019/7/24 08:51:24
 * @description
 */
public class IntersectionOfTwoArraysII {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1) {
            return new int[]{};
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] shortArray = nums1;
        int[] longArray = nums2;
        if(nums1.length > nums2.length) {
            shortArray = nums2;
            longArray = nums1;
        }

        int[] intersection = new int[shortArray.length];
        int k = 0;
        for(int i = 0, j = 0; i < shortArray.length && j < longArray.length; j++) {
            if(longArray[j] > shortArray[i]) {
                j--;
                i++;
            } else if(longArray[j] == shortArray[i]) {
                intersection[k++] = shortArray[i++];
            }
        }

        int[] result = new int[k];
        System.arraycopy(intersection, 0, result, 0, k);
        return result;
    }
}
