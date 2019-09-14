package sort.relativeSortArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * sort.relativeSortArray.RelativeSortArray
 *
 * @author Cloneable
 * @date 2019/9/13 14:54:13
 * @description
 */
public class RelativeSortArray {
    public static int[] relativeSort(int[] array, int[] relative) {
        Map<Integer, Integer> relativeMap = generateRelativeMap(relative);
        RelativeSortArray.filterRelativeArea(array, relativeMap);
        RelativeSortArray.fillRelativeArray(array, relative, relativeMap);
        return array;
    }

    public static Map<Integer, Integer> generateRelativeMap(int[] relative) {
        Map<Integer, Integer> relativeMap = new HashMap<>();
        for (int i = 0; i < relative.length; i++) {
            relativeMap.put(relative[i], 0);
        }
        return relativeMap;
    }

    public static boolean existRelative(int num, Map<Integer, Integer> relativeMap) {
        return relativeMap.containsKey(num);
    }

    public static int filterRelativeArea(int[] array, Map<Integer, Integer> relativeMap) {
        int relativeIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (existRelative(array[i], relativeMap)) {
                Integer count = relativeMap.get(array[i]);
                relativeMap.put(array[i], ++count);
                int temp = array[relativeIdx];
                array[relativeIdx] = array[i];
                array[i] = temp;
                relativeIdx++;
            }
        }
        return relativeIdx;
    }

    public static void notRelativeSort(int[] array, int relativeIdx) {
        Arrays.sort(array, relativeIdx, array.length - 1);
    }

    public static void fillRelativeArray(int[] array, int[] relative, Map<Integer, Integer> relativeMap) {
        int fillStartIdx = 0;
        for (int i = 0; i < relative.length; i++) {
            Integer toIndex = relativeMap.get(relative[i]) + fillStartIdx;
            Arrays.fill(array, fillStartIdx, toIndex, relative[i]);
            fillStartIdx = toIndex;
        }
    }
}
