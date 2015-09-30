package _159_LongestSubstringWithAtMostTwoDistinctCharacters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _159_LongestSubstringWithAtMostTwoDistinctCharacters.Practice } */
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
        String s = "eceba";
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "aaaa";
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "bbaabb";
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "bbaabbc";
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "bbacabbc";
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
