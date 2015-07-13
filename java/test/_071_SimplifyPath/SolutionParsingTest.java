package _071_SimplifyPath;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionParsingTest {

    SolutionParsing solution;

    @Before
    public void setUp() throws Exception {
        solution = new SolutionParsing();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String path = "/home/";
        String actual = solution.simplifyPath(path);
        String expected = "/home";
        assertEquals(path, expected, actual);
    }

    @Test
    public void Test2() {
        String path = "/a/./b/../../c/";
        String actual = solution.simplifyPath(path);
        String expected = "/c";
        assertEquals(path, expected, actual);
    }

    @Test
    public void Test3() {
        String path = "/../";
        String actual = solution.simplifyPath(path);
        String expected = "/";
        assertEquals(path, expected, actual);
    }

    @Test
    // ignore redundant slashes
    public void Test4() {
        String path = "/home//foo/";
        String actual = solution.simplifyPath(path);
        String expected = "/home/foo";
        assertEquals(path, expected, actual);
    }

    @Test
    public void Test5() {
        String path = "/abc/...";
        String actual = solution.simplifyPath(path);
        String expected = "/abc/...";
        assertEquals(path, expected, actual);
    }

    @Test
    public void Test6() {
        String path = "///";
        String actual = solution.simplifyPath(path);
        String expected = "/";
        assertEquals(path, expected, actual);
    }

}
