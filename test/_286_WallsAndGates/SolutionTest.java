package _286_WallsAndGates;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _286_WallsAndGates.Solution } */
    Solution solution;
    
    private static final int INF = Integer.MAX_VALUE;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        int[][] rooms = {
                { INF,  -1,   0, INF },
                { INF, INF, INF, -1  },
                { INF,  -1, INF, -1  },
                {   0,  -1, INF, INF },
        };
        solution.wallsAndGates(rooms);
        int[][] exps = {
                { 3, -1, 0,  1 },
                { 2,  2, 1, -1 },
                { 1, -1, 2, -1 },
                { 0, -1, 3,  4 }
        };
        assertArrayEquals(exps, rooms);
    }

    @Test
    public void Test2() {
        int[][] rooms = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        solution.wallsAndGates(rooms);
        int[][] exps = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        assertArrayEquals(exps, rooms);
    }

    @Test
    public void Test3() {
        int[][] rooms = {
                { INF, INF, INF },
                { INF, INF, INF },
                { INF, INF, INF }
        };
        solution.wallsAndGates(rooms);
        int[][] exps = {
                { INF, INF, INF },
                { INF, INF, INF },
                { INF, INF, INF }
        };
        assertArrayEquals(exps, rooms);
    }

    @Test
    public void Test4() {
        int[][] rooms = {
                { -1, -1, -1 },
                { -1, -1, -1 },
                { -1, -1, -1 }
        };
        solution.wallsAndGates(rooms);
        int[][] exps = {
                { -1, -1, -1 },
                { -1, -1, -1 },
                { -1, -1, -1 }
        };
        assertArrayEquals(exps, rooms);
    }

    @Test
    public void Test5() {
        int[][] rooms = {
                { 0,   0,  0 },
                { 0, INF,  0 },
                { 0,   0,  0 }
        };
        solution.wallsAndGates(rooms);
        int[][] exps = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        assertArrayEquals(exps, rooms);
    }

}
