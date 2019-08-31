package stack.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * stack.nextGreaterElementI.NextGreaterElementI
 *
 * problems link https://leetcode.com/problems/next-greater-element-i/
 *
 * @author Cloneable
 * @date 2019/6/22 20:47:22
 * @description
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1) {return nums1;}
        Map<Integer, Integer> resultMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2) {
            while(!stack.empty() && num > stack.peek()) {
                resultMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = resultMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
