package _242_ValidAnagram;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _242_ValidAnagram.Solution } */
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
    public void Test0() {
        String s = "";
        String t = "";
        boolean actual = solution.isAnagram(s, t);
        assertTrue(actual);
    }

    @Test
    public void Test1() {
        String s = "anagram";
        String t = "nagaram";
        boolean actual = solution.isAnagram(s, t);
        assertTrue(actual);
    }

    @Test
    public void Test2() {
        String s = "rat";
        String t = "car";
        boolean actual = solution.isAnagram(s, t);
        assertTrue(!actual);
    }

    @Test
    public void Test4() {
        String s = "aanagram";
        String t = "nagaram";
        boolean actual = solution.isAnagram(s, t);
        assertTrue(!actual);
    }

}
