package _139_WordBreak;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _139_WordBreak.Practice } */
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
        String s = "aaaabaababaaaabaabbabbbbbabaabbbbabbbabaabbabaaaaaabaabbabbbaabaababaabbaaabaababbaabbbaabaaaaabbbbaaaaabaababbbababbabbaabbbbabababaababaaaababbbaaaaaaabbbbaabbbbabbbabbbaaabbaaaaabbbabaaaabbababbbbaababaabaababbbbababbbaaaabbbbaabbbaaaabaababbbaaaaaabbbabbaaabaabaabaaaababbbabbbabbbaabbabaaabaaabbababaabbabaaaabbbbbbabbababaaabbababbabbaaaabbabbbababbbbaabaaabbbaababababaaaaaaaabababaabbabaaabbabaaaaaabbbbbbabaaabbaaaaaaaabbbbabbaaabaabbabbbbbbbbbbbbbbabbbababbbbaabaaabaababbaaabbbbaaabbbbbaabababbaabbabbaaabaababbbbbaaaaabbbabaabaaaabaaaaababbabbababbbbbbaaababbbbbbbabbaabbabaaabbbaabbabaaaabaababb";
        Set<String> wordDict = new HashSet<>();
        String[] strs = { "aabababaa", "aaaabaa", "ababaabaa", "aaaa", "b",
                "aaaaba", "a", "aaba", "bbaaaaaab", "bbb", "aabbaaaaba", "baa",
                "aabbaba", "abbabb", "bbaaab", "bbbbabbaab", "abbaabbb",
                "babaa", "b", "bbaaa", "bab", "abaaaaaa", "bbbba", "baababab",
                "abbaa", "bbaaaaa", "aaaabbbbba" };
        for (String string : strs) {
            wordDict.add(string);
        }
        boolean actual = solution.wordBreak(s, wordDict);
        assertEquals(true, actual);
    }

}
