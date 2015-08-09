/**
 * Time : O(); Space : O()
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.leetcode.Point;

/** see test {@link _149_MaxPointsOnALine.SolutionTest } */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length == 0) {
            return 0;
        }
        Map<String, Set<String>> lineMap = new HashMap<>();

        List<String> unique = new ArrayList<>();
        Map<String, Integer> pointMap = new HashMap<>();
        // count the points
        for (Point point : points) {
            int count = 1;
            String pStr = pointToString(point);
            if (pointMap.containsKey(pStr)) {
                count = 1 + pointMap.get(pStr);
            } else {
                unique.add(pStr);
            }
            pointMap.put(pStr, count);
        }
//        System.out.println(pointMap);
        if (pointMap.size() == 1) {
            return pointMap.get(pointToString(points[0]));
        }

        for (int i = 0; i < unique.size(); i++) {
            Point p1 = strToPoint(unique.get(i));
            for (int j = i + 1; j < unique.size(); j++) {
                Point p2 = strToPoint(unique.get(j));
                // calculate the <k, b> for each two points 
                double k = 0;
                double b = 0;
                if (p1.x == p2.x) {
                    k = Integer.MAX_VALUE;
                    b = p1.x;
                } else {
                    k = (p2.y - p1.y) / (p2.x - p1.x);
                    b = (p2.x * p1.y - p1.x * p2.y) / (p2.x - p1.x);
                }
                String line = pointToString(k, b);
                Set<String> pSet = new HashSet<>();
                if (lineMap.containsKey(line)) {
                    pSet = lineMap.get(line);
                } 
                pSet.add(pointToString(p1));
                pSet.add(pointToString(p2));
                lineMap.put(line, pSet);
            }
        }
        //        System.out.println(lineMap);

        // find the result
        int result = 0;
        for (String line : lineMap.keySet()) {
//            System.out.println("-------------" + line + "-------------");
            int count = 0;
            Set<String> pointSet = lineMap.get(line);
            for (String p : pointSet) {
//                System.out.println(p + ", " + pointMap.get(p));
                count += pointMap.get(p);
            }
            result = Math.max(result, count);
        }
        return result;
    }

    private String pointToString(double k, double b) {
        return "[" + k + "," + b + "]";
    }

    private String pointToString(Point p) {
        return "[" + p.x + "," + p.y + "]";
    }
    
    private Point strToPoint(String str) {
        int commaIndex = str.indexOf(",");
        int x = Integer.parseInt(str.substring(1, commaIndex));
        int y = Integer.parseInt(str.substring(commaIndex + 1, str.length() - 1));
        Point point = new Point(x, y);
        return point;
    }

}
