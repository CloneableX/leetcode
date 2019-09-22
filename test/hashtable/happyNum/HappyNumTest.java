package hashtable.happyNum;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * hashtable.happyNum.HappyNumTest
 *
 * @author Cloneable
 * @date 2019/9/21 17:00:21
 * @description unit test for Happy Num
 */
public class HappyNumTest {
    @Test
    public void should_be_happy_num_when_give_digits_square_sum_is_one() {
        assertThat(HappyNum.isHappyNum(19), is(Boolean.TRUE));
        assertThat(HappyNum.isHappyNum(37), is(Boolean.FALSE));
    }

    @Test
    public void should_get_sum_digit_square_when_give_num() {
        assertThat(HappyNum.sumSquareDigits(9), is(81));
        assertThat(HappyNum.sumSquareDigits(19), is(82));
        assertThat(HappyNum.sumSquareDigits(297), is(134));
    }
}
