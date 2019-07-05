package queue.numberOfRecentCalls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * queue.numberOfRecentCalls.NumberOfRecentCalls
 *
 * @author Cloneable
 * @date 2019/7/4 08:31:04
 * @description
 */
public class NumberOfRecentCalls {
    private Queue<Integer> queue = new LinkedList<>();

    private List<Integer> array = new ArrayList<>();
    private int startIndex = 0;

    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public int pingByArray(int t) {
        array.add(t);
        int targetIndex = searchLastLetter(array, t - 3000);
        if(targetIndex >= 0) {
            startIndex = targetIndex + 1;
        }

        return  array.size() - startIndex;
    }

    private int searchLastLetter(List<Integer> array, int target) {
        if(array == null || array.size() < 1) {
            return -1;
        }

        int low = 0, high = array.size() - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(array.get(mid) >= target) {
                high = mid - 1;
            } else {
                if(mid == array.size() - 1 || array.get(mid + 1) >= target) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
