package _060_PermutationSequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _060_PermutationSequence.Solution } */
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
        int n = 3;
        int k = 1;
        String actual = solution.getPermutation(n, k);
        String expected = "123";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 3;
        int k = 2;
        String actual = solution.getPermutation(n, k);
        String expected = "132";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 3;
        int k = 3;
        String actual = solution.getPermutation(n, k);
        String expected = "213";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 3;
        int k = 4;
        String actual = solution.getPermutation(n, k);
        String expected = "231";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int n = 3;
        int k = 5;
        String actual = solution.getPermutation(n, k);
        String expected = "312";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int n = 3;
        int k = 6;
        String actual = solution.getPermutation(n, k);
        String expected = "321";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int n = 4;
        int k = 1;
        String actual = solution.getPermutation(n, k);
        String expected = "1234";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int n = 4;
        int k = 3;
        String actual = solution.getPermutation(n, k);
        String expected = "1324";
        assertEquals(expected, actual);
    }

}