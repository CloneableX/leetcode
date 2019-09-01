package sort.matrixCellsinDistanceOrder;

import java.util.LinkedList;

/**
 * sort.matrixCellsinDistanceOrder.MatrixCellsinDistanceOrder
 *
 * @author Cloneable
 * @date 2019/8/31 10:41:31
 * @description
 */
public class MatrixCellsinDistanceOrder {
    public int getDistance(int[] pointA, int[] pointB) {
        return getPointAbs(0, pointA, pointB) + getPointAbs(1, pointA, pointB);
    }

    private int getPointAbs(int i, int[] pointA, int[] pointB) {
        return Math.abs(pointA[i] - pointB[i]);
    }

    public int[][] orderMatrixByDistance(int row, int col, int x, int y) {
        int[] basePoint = new int[]{x, y};
        LinkedList<Point>[] distances = new LinkedList[row * col];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = new LinkedList();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int distance = getDistance(new int[]{i, j}, basePoint);
                distances[distance].add(new Point(i, j));
            }
        }

        Point[] sortedPoint = transLinkedToArray(row * col, distances);
        int[][] sortedIntPoint = new int[row * col][2];
        for (int i = 0; i < sortedPoint.length; i++) {
            sortedIntPoint[i] = sortedPoint[i].transInt();
        }

        return sortedIntPoint;
    }

    private Point[] transLinkedToArray(int size, LinkedList<Point>[] distances) {
        Point[] sortedDistance = new Point[size];
        int count = 0;
        for (int i = 0; i < distances.length; i++) {
            LinkedList<Point> distanceLinked = distances[i];
            if (distanceLinked.isEmpty()) {
                continue;
            }
            Point[] distanceArray = new Point[distanceLinked.size()];
            distanceLinked.toArray(distanceArray);
            System.arraycopy(distanceArray, 0, sortedDistance, count, distanceLinked.size());
            count += distanceLinked.size();
        }
        return sortedDistance;
    }

    private class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int[] transInt() {
            return new int[]{x, y};
        }
    }
}
