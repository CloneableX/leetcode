package hashtable.countPrimes;

import java.util.ArrayList;
import java.util.List;

/**
 * hashtable.countPrimes.CountPrimes
 *
 * @author Cloneable
 * @date 2019/9/21 18:14:21
 * @description
 */
public class CountPrimes {
    private static final int[] PRIMES_LESS_TEN = new int[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 0};

    public static int countPrimes(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (checkPrimes(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static int getMaxTenTimes(int num) {
        return num % 10 == 0 ? num / 10 : num / 10 + 1;
    }

    public static boolean checkPrimes(int num) {
        if (num < 2) {
            return false;
        }
        if (num < 10) {
            return PRIMES_LESS_TEN[num] == 1;
        }
        if (num % 2 == 0 || num % 5 == 0) {
            return false;
        }
        return !(num % 3 == 0 || num % 7 == 0);
    }
}
