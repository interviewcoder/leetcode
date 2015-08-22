package _223_RectangleArea;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _223_RectangleArea.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int A = -3;
        int B = 0;
        int C = 3;
        int D = 4;
        int E = 0;
        int F = -1;
        int G = 9;
        int H = 2;
        int actual = solution.computeArea(A, B, C, D, E, F, G, H);
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = -1;
        int F = -1;
        int G = 1;
        int H = 1;
        int actual = solution.computeArea(A, B, C, D, E, F, G, H);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
