package _009_PalindromeNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _009_PalindromeNumber.Practice } */
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
        int x = -2;
        assertTrue(!solution.isPalindrome(x));
    }

    @Test
    public void Test2() {
        int x = -101;
        assertTrue(!solution.isPalindrome(x));
    }

    @Test
    public void Test3() {
        int x = 2;
        assertTrue(solution.isPalindrome(x));
    }

    @Test
    public void Test4() {
        int x = 202;
        assertTrue(solution.isPalindrome(x));
    }

    @Test
    public void Test5() {
        int x = 2021;
        assertTrue(!solution.isPalindrome(x));
    }

    @Test
    public void Test6() {
        int x = 2147483647;
        assertTrue(!solution.isPalindrome(x));
    }

    @Test
    public void Test7() {
        int x = 21477412;
        assertTrue(solution.isPalindrome(x));
    }

    @Test
    public void Test8() {
        int x = 0;
        assertTrue(solution.isPalindrome(x));
    }

}
