package _096_UniqueBinarySearchTrees;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _096_UniqueBinarySearchTrees.Practice } */
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
        int n = 3;
        int actual = solution.numTrees(n);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 1;
        int actual = solution.numTrees(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 2;
        int actual = solution.numTrees(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test(timeout=100)
    public void Test4() {
        int n = 19;
        int actual = solution.numTrees(n);
        int expected = 1767263190;
        assertEquals(expected, actual);
    }

    @Test(timeout=100)
    public void Test5() {
        int n = 19;
        int actual = solution.numTrees(n);
        int expected = 1767263190;
        assertEquals(expected, actual);
    }

    @Test(timeout=100)
    public void Test6() {
        int n = 18;
        int actual = solution.numTrees(n);
        int expected = 477638700;
        assertEquals(expected, actual);
    }

}
