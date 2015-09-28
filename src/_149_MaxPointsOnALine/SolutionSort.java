/**
 * Time : O(N^2); Space : O(N)
 * @tag : Hash Table; Math
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 *************************************************************************
 * Description: 
 * 
 * Given n points on a 2D plane, find the maximum number of points that 
 * lie on the same straight line.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/max-points-on-a-line/ }
 */
package _149_MaxPointsOnALine;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.leetcode.Point;

/** see test {@link _149_MaxPointsOnALine.SolutionSortTest } */
public class SolutionSort {

    // version2: sort points first, so that we can use loop for (int j = i + 1,
    // instead of for (int j = 0, ...
    public int maxPoints(Point[] points) {
        int res = 0;

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x != p2.x ? p1.x - p2.x : p1.y - p2.y;
            }
        });

        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> slopeMap = new HashMap<>();
            int samePoint = 1;
            int sameX = 0;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    samePoint++;
                } else if (points[i].x == points[j].x) {
                    sameX++;
                } else {
                    double k = (double) (points[j].y - points[i].y)
                            / (points[j].x - points[i].x);
                    int counts = 1;
                    if (slopeMap.containsKey(k)) {
                        counts += slopeMap.get(k);
                    }
                    slopeMap.put(k, counts);
                    res = Math.max(res, counts + samePoint);
                }
            }
            res = Math.max(res, samePoint + sameX);
        }
        return res;
    }

}
