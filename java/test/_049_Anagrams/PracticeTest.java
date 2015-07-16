package _049_Anagrams;

import static com.leetcode.Test.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _049_Anagrams.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        String[] strs = { "dog", "cat", "god", "tac" };
        List<String> actualList = solution.anagrams(strs);
        List<String> expectedList = Arrays.asList("dog", "god", "cat", "tac");
        assertEqualsIgnoreOrder(expectedList, actualList);
    }

    @Test
    public void Test2() {
        String[] strs = { "", "" };
        List<String> actualList = solution.anagrams(strs);
        List<String> expectedList = Arrays.asList("", "");
        assertEqualsIgnoreOrder(expectedList, actualList);
    }

    @Test
    public void Test3() {
        String[] strs = { "ant", "ant" };
        List<String> actualList = solution.anagrams(strs);
        List<String> expectedList = Arrays.asList("ant", "ant");
        assertEqualsIgnoreOrder(expectedList, actualList);
    }

    @Test
    public void Test4() {
        String[] strs = { "", "", "" };
        List<String> actualList = solution.anagrams(strs);
        List<String> expectedList = Arrays.asList("", "", "");
        assertEqualsIgnoreOrder(expectedList, actualList);
    }

}
