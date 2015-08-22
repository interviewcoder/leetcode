package _151_ReverseWordsInAString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _151_ReverseWordsInAString.Solution } */
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
        String A = "the sky is blue";
        String actual = solution.reverseWords(A);
        String expected = "blue is sky the";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "fwbpudnbrozzifml osdt  ulc jsx kxorifrhubk ouhsuhf  sswz qfho dqmy  sn myq igjgip iwfcqq";
        String actual = solution.reverseWords(A);
        String expected = "iwfcqq igjgip myq sn dqmy qfho sswz ouhsuhf kxorifrhubk jsx ulc osdt fwbpudnbrozzifml";
        assertEquals(expected, actual);
    }

}
