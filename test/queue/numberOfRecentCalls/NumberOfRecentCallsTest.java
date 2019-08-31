package queue.numberOfRecentCalls;

import org.junit.Assert;
import org.junit.Test;

/**
 * queue.NumberOfRecentCalls
 *
 * @author Cloneable
 * @date 2019/7/4 08:31:04
 * @description
 */
public class NumberOfRecentCallsTest {
    @Test
    public void pingTest() {
        int[] pings = new int[]{642, 1849, 4921, 5936, 5957};
        int[] result = new int[pings.length];
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        for(int i = 0; i < pings.length; i++) {
            result[i] = numberOfRecentCalls.ping(pings[i]);
        }

        Assert.assertArrayEquals(new int[]{1, 2, 1, 2, 3}, result);
    }

    @Test
    public void pingArrayTest() {
        int[] pings = new int[]{642, 1849, 4921, 5936, 5957};
        int[] result = new int[pings.length];
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        for(int i = 0; i < pings.length; i++) {
            result[i] = numberOfRecentCalls.pingByArray(pings[i]);
        }

        Assert.assertArrayEquals(new int[]{1, 2, 1, 2, 3}, result);
    }
}
