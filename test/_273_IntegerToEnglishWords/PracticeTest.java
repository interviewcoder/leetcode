package _273_IntegerToEnglishWords;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _273_IntegerToEnglishWords.Practice } */
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
    public void Test0() {
        int num = 0;
        String actual = solution.numberToWords(num);
        String expected = "Zero";
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        int num = 123;
        String actual = solution.numberToWords(num);
        String expected = "One Hundred Twenty Three";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int num = 12345;
        String actual = solution.numberToWords(num);
        String expected = "Twelve Thousand Three Hundred Forty Five";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int num = 1234567;
        String actual = solution.numberToWords(num);
        String expected = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int num = 200;
        String actual = solution.numberToWords(num);
        String expected = "Two Hundred";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int num = 1234567891;
        String actual = solution.numberToWords(num);
        String expected = "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int num = 19;
        String actual = solution.numberToWords(num);
        String expected = "Nineteen";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int num = 20;
        String actual = solution.numberToWords(num);
        String expected = "Twenty";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int num = 110;
        String actual = solution.numberToWords(num);
        String expected = "One Hundred Ten";
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int num = 1000;
        String actual = solution.numberToWords(num);
        String expected = "One Thousand";
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int num = 100;
        String actual = solution.numberToWords(num);
        String expected = "One Hundred";
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int num = 1001;
        String actual = solution.numberToWords(num);
        String expected = "One Thousand One";
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int num = 1000000;
        String actual = solution.numberToWords(num);
        String expected = "One Million";
        assertEquals(expected, actual);
    }

}