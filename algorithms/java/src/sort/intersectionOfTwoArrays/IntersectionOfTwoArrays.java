package sort.intersectionOfTwoArrays;

import java.util.*;

/**
 * sort.intersectionOfTwoArrays.IntersectionOfTwoArrays
 *
 * @author Cloneable
 * @date 2019/7/21 13:00:21
 * @description
 */
public class IntersectionOfTwoArrays {
    public static int[] intersectionByLoop(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1) {
            return new int[]{};
        }

        int[] shortArray = nums1;
        int[] longArray = nums2;
        if(nums1.length > nums2.length) {
            shortArray = nums2;
            longArray = nums1;
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for(int i = 0; i < shortArray.length; i++) {
            for(int j = 0; j < longArray.length; j++) {
                if(shortArray[i] == longArray[j]) {
                    intersectionSet.add(shortArray[i]);
                }
            }
        }

        return convertSetToArray(intersectionSet);
    }

    private static int[] convertSetToArray(Set<Integer> intersectionSet) {
        Integer[] intersection = new Integer[intersectionSet.size()];
        intersectionSet.toArray(intersection);
        int[] result = new int[intersection.length];
        for (int i = 0; i < intersection.length; i++) {
            result[i] = intersection[i];
        }
        return result;
    }

    public static int[] intersectionBySort(int[] nums1, int[] nums2) {
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

        LinkedList<Integer> linkedList = new LinkedList();
        for(int i = 0; i < shortArray.length; i++) {
            linkedList.add(shortArray[i]);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for(int i = 0; i < longArray.length; i++) {
            if(linkedList.isEmpty()) {
                break;
            }

            if(linkedList.peek().equals(longArray[i])) {
                intersectionSet.add(linkedList.poll());
            } else if(longArray[i] > linkedList.peek()) {
                linkedList.poll();
                i--;
            }
        }

        return convertSetToArray(intersectionSet);
    }

    public static int[] intersectionByMap(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1) {
            return new int[]{};
        }

        int[] shortArray = nums1;
        int[] longArray = nums2;
        if(nums1.length > nums2.length) {
            shortArray = nums2;
            longArray = nums1;
        }

        Map<Integer, Integer> intersectionMap = new HashMap<>();
        for(int i = 0; i < shortArray.length; i++) {
            if(!intersectionMap.containsKey(shortArray[i])) {
                intersectionMap.put(shortArray[i], 1);
            }
        }

        for(int i = 0; i < longArray.length; i++) {
            if(intersectionMap.containsKey(longArray[i])) {
                intersectionMap.put(longArray[i], 2);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(Integer key : intersectionMap.keySet()) {
            if(intersectionMap.get(key) == 2) {
                set.add(key);
            }
        }

        return convertSetToArray(set);
    }
}
