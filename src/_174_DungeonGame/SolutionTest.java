package _174_DungeonGame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _174_DungeonGame.Solution } */
    Solution solution;

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
        int[][] dungeon = { 
                { -2, -3, 3 }, 
                { -5, -10, 1 }, 
                { 10, 30, -5 } 
        };
        int actual = solution.calculateMinimumHP(dungeon);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] dungeon = { 
                { -5 }
        };
        int actual = solution.calculateMinimumHP(dungeon);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] dungeon = { 
                { 1 }
        };
        int actual = solution.calculateMinimumHP(dungeon);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
