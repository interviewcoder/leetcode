package _246_StrobogrammaticNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _246_StrobogrammaticNumber.Practice } */
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
        String num = "69";
        assertTrue(solution.isStrobogrammatic(num));
    }

    @Test
    public void Test2() {
        String num = "88";
        assertTrue(solution.isStrobogrammatic(num));
    }

    @Test
    public void Test3() {
        String num = "818";
        assertTrue(solution.isStrobogrammatic(num));
    }

    @Test
    public void Test4() {
        String num = "88";
        assertTrue(solution.isStrobogrammatic(num));
    }

    @Test
    public void Test5() {
        String num = "66";
        assertTrue(!solution.isStrobogrammatic(num));
    }

    @Test
    public void Test6() {
        String num = "8998";
        assertTrue(!solution.isStrobogrammatic(num));
    }

    @Test
    public void Test7() {
        String num = "2";
        assertTrue(!solution.isStrobogrammatic(num));
    }

}
