package _166_FractionToRecurringDecimal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _166_FractionToRecurringDecimal.Solution } */
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
        int numerator = 1;
        int denominator = 2;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.5";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int numerator = 2;
        int denominator = 1;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int numerator = 2;
        int denominator = 3;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.(6)";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int numerator = 1;
        int denominator = 3;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.(3)";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int numerator = 1;
        int denominator = 4;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.25";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int numerator = 0;
        int denominator = 4;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int numerator = 1;
        int denominator = 99;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.(01)";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int numerator = 1;
        int denominator = 999;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.(001)";
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int numerator = 199;
        int denominator = 99;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "2.(01)";
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int numerator = 4000;
        int denominator = 4;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "1000";
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int numerator = 240;
        int denominator = 4;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "60";
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int numerator = 1001;
        int denominator = 10;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "100.1";
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        int numerator = -1;
        int denominator = 10;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "-0.1";
        assertEquals(expected, actual);
    }

    @Test
    public void Test14() {
        int numerator = -1;
        int denominator = -2147483648;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "0.0000000004656612873077392578125";
        assertEquals(expected, actual);
    }

    @Test
    public void Test15() {
        int numerator = -2147483648;
        int denominator = -1;
        String actual = solution.fractionToDecimal(numerator, denominator);
        String expected = "2147483648";
        assertEquals(expected, actual);
    }

}