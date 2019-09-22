package hashtable.happyNum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * hashtable.happyNum.HappyNum
 *
 * @author Cloneable
 * @date 2019/9/21 17:04:21
 * @description
 */
public class HappyNum {

    private static final int DIGIT_NUM = 10;
    private static final int[] DIGIT_SQUARE_NUMS = new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

    public static boolean isHappyNum(int num) {
        Map<Integer, Integer> computeNums = new HashMap<>();
        while (num != 1) {
            num = sumSquareDigits(num);
            if (computeNums.containsKey(num)) {
                return false;
            }

            computeNums.put(num, 1);
        }
        return true;
    }

    public static int sumSquareDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += DIGIT_SQUARE_NUMS[num % DIGIT_NUM];
            num /= DIGIT_NUM;
        }

        return sum;
    }
}
