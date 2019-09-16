package sort.relativeSortArray;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * sort.relativeSortArray.RelativeSortArrayTest
 *
 * @author Cloneable
 * @date 2019/9/13 14:51:13
 * @description unit test for RelativeSortArrayTest
 */
public class RelativeSortArrayTest {
    private int[] array;
    private int[] relative;
    private Map<Integer, Integer> relativeMap;

    @Before
    public void setUp() {
        array = new int[]{2, 3, 1, 3, 2, 4, 6, 19, 9, 2, 7};
        relative = new int[]{2, 1, 4, 3, 9, 6};
        //array = new int[]{28,6,22,8,44,17};
        //relative = new int[]{22,28,8,6};
        relativeMap = RelativeSortArray.generateRelativeMap(relative);
    }

    @Test
    public void should_get_relative_sort_array_when_give_chaos_array_and_relative_array() {
        int[] result = RelativeSortArray.relativeSort(array, relative);
        assertThat(result, is(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}));
    }

    @Test
    public void should_get_relative_map_when_give_relative_array() {
        assertThat(relativeMap.size(), is(6));
        assertThat(relativeMap.get(2), is(0));
        assertThat(relativeMap.get(6), is(0));
    }

    @Test
    public void should_know_weather_array_item_exists_in_relative_when_give_array_and_relative_map() {
        assertThat(RelativeSortArray.existRelative(array[0], relativeMap), is(Boolean.TRUE));
        assertThat(RelativeSortArray.existRelative(array[7], relativeMap), is(Boolean.FALSE));
    }

    @Test
    public void should_get_relative_area_of_array_when_give_array_and_relative_map() {
        int relativeInx = RelativeSortArray.filterRelativeArea(array, relativeMap);
        assertThat(relativeInx, is(9));
        assertThat(relativeMap.get(2), is(3));
        for (int i = 0; i < relativeInx; i++) {
            assertThat(RelativeSortArray.existRelative(array[i], relativeMap), is(Boolean.TRUE));
        }

        for (int i = relativeInx; i < array.length; i++) {
            assertThat(RelativeSortArray.existRelative(array[i], relativeMap), is(Boolean.FALSE));
        }
    }

    @Test
    public void should_get_sort_not_relative_area_of_array_when_give_array_and_relative_index() {
        int relativeIdx = RelativeSortArray.filterRelativeArea(array, relativeMap);
        RelativeSortArray.notRelativeSort(array, relativeIdx);

        for (int i = relativeIdx; i < array.length - 1; i++) {
            assertThat(array[i] <= array[i + 1], is(Boolean.TRUE));
        }
    }

    @Test
    public void should_fill_relative_area_of_array_by_relative_num_when_give_array_and_relative_map() {
        int relativeIdx = RelativeSortArray.filterRelativeArea(array, relativeMap);
        RelativeSortArray.notRelativeSort(array, relativeIdx);
        RelativeSortArray.fillRelativeArray(array, relative, relativeMap);
        assertThat(array, is(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}));
    }
}
