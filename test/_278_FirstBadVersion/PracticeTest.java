package _278_FirstBadVersion;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _278_FirstBadVersion.Practice } */
    Practice practice;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test1() {
        boolean[] versions = { true };
        practice = new Practice(versions);
        int n = 1;
        int actual = practice.firstBadVersion(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        boolean[] versions = { false, true };
        practice = new Practice(versions);
        int n = 2;
        int actual = practice.firstBadVersion(n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        boolean[] versions = { true, true };
        practice = new Practice(versions);
        int n = 2;
        int actual = practice.firstBadVersion(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        boolean[] versions = { false, false, false };
        practice = new Practice(versions);
        int n = 3;
        int actual = practice.firstBadVersion(n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        boolean[] versions = { false, false, false, true, true, true };
        practice = new Practice(versions);
        int n = 6;
        int actual = practice.firstBadVersion(n);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
