package _157_ReadNCharactersGivenRead4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _157_ReadNCharactersGivenRead4.Solution } */
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
        int n = 1;
        char[] buf = new char[n];
        int actual = solution.read(buf, n);
        int expected = 1;
        assertEquals(expected, actual);
        char[] exps = { 'a' };
        assertArrayEquals(exps, buf);
    }

}
