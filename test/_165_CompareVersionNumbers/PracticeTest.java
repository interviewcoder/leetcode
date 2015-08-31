package _165_CompareVersionNumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _165_CompareVersionNumbers.Practice } */
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
        String version1 = "1.1";
        String version2 = "1.2";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String version1 = "0.1";
        String version2 = "1.12";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String version1 = "13.1";
        String version2 = "1.12";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String version1 = "000.1";
        String version2 = "1.000";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String version1 = "01.1";
        String version2 = "1";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String version1 = "01.001";
        String version2 = "1.1";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String version1 = "01.001.2555";
        String version2 = "1.1.2556";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String version1 = "01.001.2555";
        String version2 = "1.1.2554";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        String version1 = "1.";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        String version1 = "1.0";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        String version1 = "1.0.0";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test12() {
        String version1 = "1.0.0.0.0";
        String version2 = "1.0";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        String version1 = "1.0.0.0.01";
        String version2 = "1.0";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }


}
