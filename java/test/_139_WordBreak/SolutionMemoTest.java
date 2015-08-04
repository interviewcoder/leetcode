package _139_WordBreak;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionMemoTest {

    /** Test method for {@link _139_WordBreak.SolutionMemo } */
    SolutionMemo solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionMemo();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "leetcode";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("leet");
        wordDict.add("code");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(true, actual);
    }

    @Test
    public void Test2() {
        String s = "a";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(true, actual);
    }

    @Test
    public void Test3() {
        String s = "leetcode";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("let");
        wordDict.add("tcode");
        wordDict.add("tode");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(false, actual);
    }

    @Test
    public void Test4() {
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
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(false, actual);
    }

    @Test
    public void Test5() {
        String s = "";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("let");
        wordDict.add("tcode");
        wordDict.add("tode");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(false, actual);
    }

    @Test
    public void Test6() {
        String s = "";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("let");
        wordDict.add("");
        wordDict.add("tcode");
        wordDict.add("tode");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(true, actual);
    }

    @Test
    public void Test7() {
        String s = "leetcode";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("leet");
        wordDict.add("co");
        wordDict.add("de");
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(true, actual);
    }

}
