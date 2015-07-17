package _149_MaxPointsOnALine;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Point;

public class SolutionTest {

    /** Test method for {@link _149_MaxPointsOnALine.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(500);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        Point[] points = new Point[4];
        points[0] = new Point(1, 1);
        points[1] = new Point(2, 2);
        points[2] = new Point(3, 3);
        points[3] = new Point(5, 10);
        int actual = solution.maxPoints(points);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        Point[] points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 1);
        points[2] = new Point(0, 0);
        int actual = solution.maxPoints(points);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        Point[] points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(0, 3);
        int actual = solution.maxPoints(points);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        Point[] points = new Point[3];
        points[0] = new Point(1, 1);
        points[1] = new Point(1, 1);
        points[2] = new Point(2, 3);
        int actual = solution.maxPoints(points);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        Point[] points = new Point[3];
        points[0] = new Point(1, 1);
        points[1] = new Point(1, 1);
        points[2] = new Point(1, 1);
        int actual = solution.maxPoints(points);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        Point[] points = new Point[8];
        points[0] = new Point(1, 1);
        points[1] = new Point(1, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 5);
        points[4] = new Point(2, 5);
        points[5] = new Point(2, 5);
        points[6] = new Point(2, 5);
        points[7] = new Point(2, 5);
        int actual = solution.maxPoints(points);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        Point[] points = new Point[21];
        points[0] = new Point(0, 9);
        points[1] = new Point(138, 429);
        points[2] = new Point(115, 359);
        points[3] = new Point(115, 359);
        points[4] = new Point(-30, -102);
        points[5] = new Point(230, 709);
        points[6] = new Point(-150, 686);
        points[7] = new Point(-135, -613);
        points[8] = new Point(-60, -248);
        points[9] = new Point(-161, -481);
        points[10] = new Point(207, 639);
        points[11] = new Point(23, 79);
        points[12] = new Point(-230, -691);
        points[13] = new Point(-115, -341);
        points[14] = new Point(92, 289);
        points[15] = new Point(60, 336);
        points[16] = new Point(-105, -467);
        points[17] = new Point(135, 701);
        points[18] = new Point(-90, -394);
        points[19] = new Point(-184, -551);
        points[20] = new Point(150, 774);
        int actual = solution.maxPoints(points);
        int expected = 12;
        assertEquals(expected, actual);
    }

    // (-42,-230), (0, -70), (0, -70), (21, -10), (42, 90), (84, 250)
    @Test
    public void Test8() {
        Point[] points = new Point[9];
        points[0] = new Point(84, 250);
        points[1] = new Point(0, 0);
        points[2] = new Point(1, 0);
        points[3] = new Point(0, -70);
        points[4] = new Point(0, -70);
        points[5] = new Point(1, -1);
        points[6] = new Point(21, -10);
        points[7] = new Point(42, 90);
        points[8] = new Point(-42, -230);
        int actual = solution.maxPoints(points);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        String pathname = "test/_149_MaxPointsOnALine/Test9Input";
        List<Point> pointList = new ArrayList<>();
        try {
            File file = new File(pathname);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                line = line.substring(1, line.length() - 1);
                int fromIndex = 0;
                int toIndex = -1;
                while (true) {
                    fromIndex = line.indexOf("[", toIndex);
                    if (fromIndex == -1) {
                        break;
                    }
                    toIndex = line.indexOf("]", fromIndex);
                    String[] nums = line.substring(fromIndex + 1, toIndex).split(",");
                    int x = Integer.parseInt(nums[0]);
                    int y = Integer.parseInt(nums[1]);
                    pointList.add(new Point(x, y));
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        Point[] points = new Point[pointList.size()];
        for (int i = 0; i < pointList.size(); i++) {
            points[i] = pointList.get(i);
        }
        int actual = solution.maxPoints(points);
        int expected = 25;
        assertEquals(expected, actual);
    }

}
