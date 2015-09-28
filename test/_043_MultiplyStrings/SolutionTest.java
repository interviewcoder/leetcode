package _043_MultiplyStrings;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    
    /** Test method for {@link _043_MultiplyStrings.Solution } */
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
        String num1 = "1";
        String num2 = "0";
        String actual = solution.multiply(num1, num2);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String num1 = "2";
        String num2 = "1";
        String actual = solution.multiply(num1, num2);
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String num1 = "100000";
        String num2 = "200000";
        String actual = solution.multiply(num1, num2);
        String expected = "20000000000";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String num1 = "15";
        String num2 = "15";
        String actual = solution.multiply(num1, num2);
        String expected = "225";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String num1 = "30000";
        String num2 = "40000";
        String actual = solution.multiply(num1, num2);
        String expected = "1200000000";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String num1 = "93553535314";
        String num2 = "25247452591474";
        String actual = solution.multiply(num1, num2);
        String expected = "2361988447605003674312836";
        assertEquals(expected, actual);
    }

}
