package sort.matrixCellsinDistanceOrder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * sort.matrixCellsinDistanceOrder.MatrixCellsinDistanceOrderTest
 *
 * @author Cloneable
 * @date 2019/8/31 10:37:31
 * @description
 */
public class MatrixCellsinDistanceOrderTest {

    private MatrixCellsinDistanceOrder matrixCellsinDistanceOrder;

    @Before
    public void setUp() throws Exception {
        matrixCellsinDistanceOrder = new MatrixCellsinDistanceOrder();
    }

    @Test
    public void should_get_distance_when_give_two_points() {
        assertThat(matrixCellsinDistanceOrder.getDistance(new int[]{0, 0}, new int[]{1, 0}), is(1));
    }

    @Test
    public void should_get_sorted_every_points_by_distance_when_give_matrix_row_and_col_nums_and_base_point() {
        assertThat(
                matrixCellsinDistanceOrder.getAllDistance(2, 2, new int[]{1, 1}),
                is(new int[][]{{1, 1}, {0, 1}, {1, 0}, {0, 0}})
        );
    }

}
