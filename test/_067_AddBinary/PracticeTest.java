package _067_AddBinary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _067_AddBinary.Practice } */
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
        String a = "11";
        String b = "1";
        String actual = solution.addBinary(a, b);
        String expected = "100";
        assertEquals(a + " + " + b + " = ", expected, actual);
    }

    @Test
    public void Test2() {
        String a = "0";
        String b = "1";
        String actual = solution.addBinary(a, b);
        String expected = "1";
        assertEquals(a + " + " + b + " = ", expected, actual);
    }

    @Test
    public void Test3() {
        String a = "10";
        String b = "1";
        String actual = solution.addBinary(a, b);
        String expected = "11";
        assertEquals(a + " + " + b + " = ", expected, actual);
    }

    @Test
    public void Test4() {
        String a = "11";
        String b = "111";
        String actual = solution.addBinary(a, b);
        String expected = "1010";
        assertEquals(a + " + " + b + " = ", expected, actual);
    }

    @Test
    public void Test5() {
        String a = "101";
        String b = "11";
        String actual = solution.addBinary(a, b);
        String expected = "1000";
        assertEquals(a + " + " + b + " = ", expected, actual);
    }
    
    @Test
    public void Test6() {
        String A = "1100101110100101000110011011010010101";
        String B = "1110011100110110101110010011111011100110001011";
        String actual = solution.addBinary(A, B);
        String expected = "1110011110011100100010111100101111000000100000";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";
        String actual = solution.addBinary(A, B);
        String expected = "1001110001111010101001110";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String A = "1";
        String B = "";
        String actual = solution.addBinary(A, B);
        String expected = "1";
        assertEquals(expected, actual);
    }

}
