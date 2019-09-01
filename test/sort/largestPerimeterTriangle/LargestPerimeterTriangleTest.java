package sort.largestPerimeterTriangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * sort.sort.largestPerimeterTriangle.LargestPerimeterTriangleTest
 *
 * @author Cloneable
 * @date 2019/8/10 11:33:10
 * @description
 */
public class LargestPerimeterTriangleTest {

    private static Random random = new Random((int)Math.pow(10, 6));

    @Test
    public void noneTriangleByThreeNum() {
        int[] edges = new int[3];
        int minsSum = 0;
        for (int i = 0; i < edges.length - 1; i++) {
            int edge = random.nextInt();
            edges[i] = edge;
            minsSum += edge;
        }

        int lastEdge = 0;
        while(lastEdge < minsSum || lastEdge < 1) {
            lastEdge = random.nextInt();
        }

        edges[edges.length - 1] = lastEdge;

        System.out.println(Arrays.toString(edges));
    }

    @Test
    public void largestPerimeterQsortTest01() {
        int[] A = new int[]{2,1,2};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterQsort(A);

        Assert.assertEquals(5, maxPerimeter);
    }

    @Test
    public void largestPerimeterQsortTest02() {
        int[] A = new int[]{1,2,1};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterQsort(A);

        Assert.assertEquals(0, maxPerimeter);
    }

    @Test
    public void largestPerimeterQsortTest03() {
        int[] A = new int[]{3,2,3,4};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterQsort(A);

        Assert.assertEquals(10, maxPerimeter);
    }

    @Test
    public void largestPerimeterQsortTest04() {
        int[] A = new int[]{3,6,2,3};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterQsort(A);

        Assert.assertEquals(8, maxPerimeter);
    }

    @Test
    public void largestPerimeterIsortTest01() {
        int[] A = new int[]{2,1,2};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterChooseSort(A);

        Assert.assertEquals(5, maxPerimeter);
    }

    @Test
    public void largestPerimeterIsortTest02() {
        int[] A = new int[]{1,2,1};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterChooseSort(A);

        Assert.assertEquals(0, maxPerimeter);
    }

    @Test
    public void largestPerimeterIsortTest03() {
        int[] A = new int[]{3,2,3,4};
        int maxPerimeter = sort.largestPerimeterTriangle.LargestPerimeterTriangle.largestPerimeterChooseSort(A);

        Assert.assertEquals(10, maxPerimeter);
    }

    @Test
    public void largestPerimeterIsortTest04() {
        int[] A = new int[]{3,6,2,3};
        int maxPerimeter = LargestPerimeterTriangle.largestPerimeterChooseSort(A);

        Assert.assertEquals(8, maxPerimeter);
    }
}
