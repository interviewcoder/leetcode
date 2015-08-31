package _007_ReverseInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _007_ReverseInteger.Practice } */
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
        int A = 1000000003;
        int actual = solution.reverse(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 10000;
        int actual = solution.reverse(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = Integer.MAX_VALUE;
        int actual = solution.reverse(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int A = Integer.MIN_VALUE;
        int actual = solution.reverse(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int A = -1234567891;
        int actual = solution.reverse(A);
        int expected = -1987654321;
        assertEquals(expected, actual);
    }

}
