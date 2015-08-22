package _005_LongestPalindromicSubstring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _005_LongestPalindromicSubstring.Practice } */
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
        String s = "abb";
        String actual = solution.longestPalindrome(s);
        String expected = "bb";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "abdbbbbdba";
        String actual = solution.longestPalindrome(s);
        String expected = "abdbbbbdba";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "abdbabbdba";
        String actual = solution.longestPalindrome(s);
        String expected = "abdba";
        assertEquals(expected, actual);
    }

}
