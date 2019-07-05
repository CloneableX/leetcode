package stack.removeAllAdjacentDuplicatesInString;

import org.junit.Assert;
import org.junit.Test;

/**
 * stack.removeAllAdjacentDuplicatesInString.RemoveAllAdjacentDuplicatesInStringTest
 *
 * @author Cloneable
 * @date 2019/7/2 08:41:02
 * @description
 */
public class RemoveAllAdjacentDuplicatesInStringTest {
    @Test
    public void removeDuplicatesTest() {
        String result = RemoveAllAdjacentDuplicatesInString.removeDuplicates("abbaca");
        Assert.assertEquals("ca", result);
    }

    @Test
    public void removeDuplicatesInPlaceTest() {
        String result = RemoveAllAdjacentDuplicatesInString.removeDuplicatesInPlace("abbaca");
        Assert.assertEquals("ca", result);
    }
}
