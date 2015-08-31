package _125_ValidPalindrome;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _125_ValidPalindrome.Practice } */
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
        String s = "A man, a plan, a canal: Panama";
        boolean actual = solution.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "race a car";
        boolean actual = solution.isPalindrome(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "";
        boolean actual = solution.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "a";
        boolean actual = solution.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "aaa";
        boolean actual = solution.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "abaa";
        boolean actual = solution.isPalindrome(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String A = "\"";
        boolean actual = solution.isPalindrome(A);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String A = "      ";
        boolean actual = solution.isPalindrome(A);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
