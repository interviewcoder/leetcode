package _072_EditDistance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _072_EditDistance.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String word1 = "";
        String word2 = "";
        int actual = solution.minDistance(word1, word2);
        assertEquals("empty strings", 0, actual);
    }

    @Test
    public void Test1() {
        String word1 = "a";
        String word2 = "";
        int actual = solution.minDistance(word1, word2);
        int expected = 1;
        assertEquals("one-empty strings", expected, actual);
    }

    @Test
    public void Test2() {
        String word1 = "";
        String word2 = "b";
        int actual = solution.minDistance(word1, word2);
        int expected = 1;
        assertEquals("one-empty strings", expected, actual);
    }

    @Test
    public void Test3() {
        String word1 = "a";
        String word2 = "b";
        int actual = solution.minDistance(word1, word2);
        int expected = 1;
        assertEquals("one-empty strings", expected, actual);
    }

    @Test
    public void Test4() {
        String word1 = "aaa";
        String word2 = "aaa";
        int actual = solution.minDistance(word1, word2);
        int expected = 0;
        assertEquals("same strings", expected, actual);
    }

    @Test
    public void Test5() {
        String word1 = "bbb";
        String word2 = "aaa";
        int actual = solution.minDistance(word1, word2);
        int expected = 3;
        assertEquals("same strings", expected, actual);
    }

}
