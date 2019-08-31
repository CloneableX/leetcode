package stack.backspaceStringCompare;

import org.junit.Assert;
import org.junit.Test;

/**
 * stack.backspaceStringCompare.BackspaceStringCompareTest
 *
 * @author Cloneable
 * @date 2019/6/29 14:19:29
 * @description
 */
public class BackspaceStringCompareTest {
    @Test
    public void backspaceCompareTest() {
        String S = "y#fo##f";
        String T = "y#f#o##f";
        boolean result = new BackspaceStringCompare().backspaceCompare(S, T);

        Assert.assertTrue(result);
    }

    @Test
    public void backspaceCompareInPlaceTest() {
        String S = "y#fo##f";
        String T = "y#f#o##f";
        boolean result = new BackspaceStringCompare().backspaceCompareInPlace(S, T);

        Assert.assertTrue(result);
    }
}
