package hashtable.countPrimes;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * hashtable.countPrimes.CountPrimesTest
 *
 * @author Cloneable
 * @date 2019/9/21 18:13:21
 * @description
 */
public class CountPrimesTest {
    @Test
    public void should_count_primes_letter_equal_than_num_when_give_num() {
        assertThat(CountPrimes.countPrimes(0), is(0));
        assertThat(CountPrimes.countPrimes(10), is(4));
        assertThat(CountPrimes.countPrimes(11), is(4));
        assertThat(CountPrimes.countPrimes(10000), is(1229));
    }

    @Test
    public void should_max_ten_times_when_give_num() {
        assertThat(CountPrimes.getMaxTenTimes(0), is(0));
        assertThat(CountPrimes.getMaxTenTimes(7), is(1));
        assertThat(CountPrimes.getMaxTenTimes(10), is(1));
        assertThat(CountPrimes.getMaxTenTimes(23), is(3));
        assertThat(CountPrimes.getMaxTenTimes(30), is(3));
    }

    @Test
    public void should_return_no_primes_when_give_num_letter_than_2() {
        checkPrimes(0, Boolean.FALSE);
        checkPrimes(1, Boolean.FALSE);
    }


    @Test
    public void should_check_primes_when_give_num_letter_than_10_is_2_3_5_7() {
        checkPrimes(4, Boolean.FALSE);
        checkPrimes(3, Boolean.TRUE);
        checkPrimes(7, Boolean.TRUE);
        checkPrimes(6, Boolean.FALSE);
    }

    @Test
    public void should_check_primes_when_give_num_greater_than_10_end_with_0_or_5_or_even() {
        checkPrimes(10, Boolean.FALSE);
        checkPrimes(25, Boolean.FALSE);
    }

    @Test
    public void should_check_primes_when_give_num_greater_than_10() {
        checkPrimes(11, Boolean.TRUE);
        checkPrimes(13, Boolean.TRUE);
        checkPrimes(22, Boolean.FALSE);
    }

    private void checkPrimes(int num, boolean isPrimes) {
        assertThat(CountPrimes.checkPrimes(num), is(isPrimes));
    }
}
