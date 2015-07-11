package _093_RestoreIPAddresses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _093_RestoreIPAddresses.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        String s = "25525511135";
        List<String> actual = solution.restoreIpAddresses(s);
        List<String> expected = new ArrayList<String>();
        expected.add("255.255.11.135");
        expected.add("255.255.111.35");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "01011";
        List<String> actual = solution.restoreIpAddresses(s);
        List<String> expected = new ArrayList<String>();
        expected.add("0.1.0.11");
        expected.add("0.10.1.1");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "172162541";
        List<String> actual = solution.restoreIpAddresses(s);
        List<String> expected = new ArrayList<String>();
        expected.add("17.216.25.41");
        expected.add("17.216.254.1");
        expected.add("172.16.25.41");
        expected.add("172.16.254.1");
        expected.add("172.162.5.41");
        expected.add("172.162.54.1");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "0000";
        List<String> actual = solution.restoreIpAddresses(s);
        List<String> expected = new ArrayList<String>();
        expected.add("0.0.0.0");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEquals(expected, actual);
    }

}
