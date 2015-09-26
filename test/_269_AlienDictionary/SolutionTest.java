package _269_AlienDictionary;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _269_AlienDictionary.Solution } */
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
        String[] words = { "wrt", "wrf", "er", "ett", "rftt"};
        String actual = solution.alienOrder(words);
        Set<String> expecteds = new HashSet<>();
        expecteds.add("wertf");
        assertTrue(expecteds.contains(actual));
    }

    @Test
    public void Test2() {
        String[] words = { "ri", "xz", "qxf", "jhsguaw", "dztqrbwbm", "dhdqfb", "jdv", "fcgfsilnb", "ooby" };
        String actual = solution.alienOrder(words);
        Set<String> expecteds = new HashSet<>();
        expecteds.add("");
        assertTrue(expecteds.contains(actual));
    }

}
