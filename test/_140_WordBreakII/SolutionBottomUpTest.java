package _140_WordBreakII;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBottomUpTest {

    /** Test method for {@link _140_WordBreakII.SolutionBottomup } */
    SolutionBottomup solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBottomup();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "catsanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("cats and dog");
        expected.add("cat sand dog");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "haha";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "catscatanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("cats cat and dog");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "dogcat";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("dog");
        wordDict.add("dogcat");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("dogcat");
        expected.add("dog cat");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test7() {
        String s = "baab";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("ab");
        wordDict.add("b");
        wordDict.add("ba");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("b a a b");
        expected.add("b a ab");
        expected.add("b aa b");
        expected.add("ba a b");
        expected.add("ba ab");
        assertEqualsIgnoreOrder(expected, actual);
    }

}
