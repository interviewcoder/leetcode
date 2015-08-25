package s11_ReplacePermutation;

import static com.leetcode.Test.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link s11_ReplacePermutation.Solution } */
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
        String s = "?";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("J", "K");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "T";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("T");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "T?";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("TJ", "TK");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "T?A?";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("TJAJ", "TKAK", "TJAK", "TKAJ");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "??J";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("JJJ", "JKJ", "KJJ", "KKJ");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "???";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("JJJ", "JKJ", "JKK", "KJJ",
                "KKJ", "KJK", "JJK", "KKK");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test7() {
        String s = "A??";
        List<String> actual = solution.replace(s);
        List<String> expected = Arrays.asList("AJJ", "AKJ", "AKK", "AJK");
        assertEqualsIgnoreOrder(expected, actual);
    }

}
