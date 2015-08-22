package _068_TextJustification;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _068_TextJustification.Practice } */
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
        String[] words = { "This", "is", "an", "example", "of", "text",
                "justification." };
        int maxWidth = 16;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("This    is    an");
        expected.add("example  of text");
        expected.add("justification.  ");
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String[] words = { "This", "is", "an", "example" };
        int maxWidth = 7;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("This is");
        expected.add("an     ");
        expected.add("example");
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String[] words = { "This", "is", "a", "good", "example" };
        int maxWidth = 7;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("This is");
        expected.add("a  good");
        expected.add("example");
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String[] words = { "This" };
        int maxWidth = 7;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("This   ");
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String[] words = { "" };
        int maxWidth = 0;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String[] words = { "" };
        int maxWidth = 3;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("   ");
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String[] words = { "very", "good" };
        int maxWidth = 4;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("very");
        expected.add("good");
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String[] words = { "What", "must", "be", "shall", "be." };
        int maxWidth = 12;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("What must be");
        expected.add("shall be.   ");
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        String[] words = { "Don't", "go", "around", "saying", "the", "world",
                "owes", "you", "a", "living;", "the", "world", "owes", "you",
                "nothing;", "it", "was", "here", "first." };
        int maxWidth = 30;
        List<String> actual = solution.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<String>();
        expected.add("Don't  go  around  saying  the");
        expected.add("world  owes  you a living; the");
        expected.add("world owes you nothing; it was");
        expected.add("here first.                   ");
        assertEquals(expected, actual);
    }
}
