package _186_ReverseWordsInAStringII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _186_ReverseWordsInAStringII.Solution } */
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
        char[] s = "the sky is blue".toCharArray();
        solution.reverseWords(s);
        char[] expecteds = "blue is sky the".toCharArray();
        assertArrayEquals(expecteds, s);
    }

    @Test
    public void Test2() {
        char[] s = "sky".toCharArray();
        solution.reverseWords(s);
        char[] expecteds = "sky".toCharArray();
        assertArrayEquals(expecteds, s);
    }

    @Test
    public void Test3() {
        char[] s = "the sky".toCharArray();
        solution.reverseWords(s);
        char[] expecteds = "sky the".toCharArray();
        assertArrayEquals(expecteds, s);
    }

}
