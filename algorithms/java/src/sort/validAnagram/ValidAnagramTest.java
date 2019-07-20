package sort.validAnagram;

import org.junit.Assert;
import org.junit.Test;

/**
 * sort.validAnagram.ValidAnagramTest
 *
 * @author Cloneable
 * @date 2019/7/20 08:37:20
 * @description
 */
public class ValidAnagramTest {
    @Test
    public void isAnagramTest() {
        String s = "anagram", t = "nagaram";
        boolean result = ValidAnagram.isAnagram(s, t);

        Assert.assertTrue(result);
    }

    @Test
    public void isAnagramBySortTest() {
        String s = "anagram", t = "nagaram";
        boolean result = ValidAnagram.isAnagramBySort(s, t);

        Assert.assertTrue(result);
    }
}
