package _049_GroupAnagrams;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Helper;

import _049_GroupAnagrams.Practice;

public class PracticeTest {

    /** Test method for {@link _049_GroupAnagrams.Practice } */
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
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = solution.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("ate", "eat","tea"));
        expected.add(Arrays.asList("nat", "tan"));
        expected.add(Arrays.asList("bat"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String[] strs = { "", "" };
        List<List<String>> actual = solution.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("", ""));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String[] strs = { "ant", "ant" };
        List<List<String>> actual = solution.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("ant", "ant"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String[] strs = { "", "", "" };
        List<List<String>> actual = solution.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("", "", ""));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        String path = "test/" + this.getClass().getPackage().getName();
        List<String> in = Helper.readInput(path + "/input5.txt");
        String line = in.get(0);
        String[] strs = line.split(",");
        List<List<String>> actual = solution.groupAnagrams(strs);

        String filename = path + "/output5.txt";
        List<List<String>> expected = Helper.readListInput(filename);
        assertEqualsIgnoreOrder(expected, actual);
    }

}
