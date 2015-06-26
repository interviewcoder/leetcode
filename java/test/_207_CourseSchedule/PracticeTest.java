package _207_CourseSchedule;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 } };
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    public void Test2() {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        assertTrue(!solution.canFinish(numCourses, prerequisites));
    }

    @Test
    public void Test3() {
        int numCourses = 3;
        int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 0, 2 }, };
        assertTrue(!solution.canFinish(numCourses, prerequisites));
    }

    @Test
    public void Test4() {
        int numCourses = 3;
        int[][] prerequisites = { { 1, 0 }, { 2, 1 }, };
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    public void Test5() {
        int numCourses = 3;
        int[][] prerequisites = { { 1, 0 }, { 2, 0 }, { 2, 1 }, };
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    public void Test6() {
        int numCourses = 4;
        int[][] prerequisites = { { 0, 1 }, { 3, 1 }, { 1, 3 }, { 3, 2 } };
        assertTrue(!solution.canFinish(numCourses, prerequisites));
    }

    // check for TLE
    @Test
    public void Test7() {
        String[] strs = null;
        try {
            String filename = "test/_207_CourseSchedule/Test7Input.txt";
            File file = new File(filename);
            BufferedReader rd = new BufferedReader(new FileReader(file));
            while (true) {
                String strLine = rd.readLine();
                if (strLine == null) {
                    break;
                }
                strLine = strLine.substring(1, strLine.length() - 1);
                strs = strLine.split("],");
            }
            rd.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        int[][] prerequisites = new int[strs.length + 1][2];
        try {
            for (int i = 0 ; i < strs.length; i++) {
                String is = strs[i];
                String[] pres = is.substring(1).split(",");
                prerequisites[i][0] = Integer.parseInt(pres[0]);
                prerequisites[i][1] = Integer.parseInt(pres[1]);
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
        int numCourses = 2000;
        assertTrue(!solution.canFinish(numCourses, prerequisites));
    }

}
