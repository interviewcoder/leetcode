package _211_AddAndSearchWordDataStructureDesign;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _211_AddAndSearchWordDataStructureDesign.Solution } */
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
        solution.addWord("bad");
        solution.addWord("dad");
        solution.addWord("mad");
        assertTrue(!solution.search("pad"));
        assertTrue(solution.search("bad"));
        assertTrue(solution.search(".ad"));
        assertTrue(solution.search("b.."));
    }
}
