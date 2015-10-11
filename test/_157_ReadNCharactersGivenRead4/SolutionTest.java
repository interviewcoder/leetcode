package _157_ReadNCharactersGivenRead4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _157_ReadNCharactersGivenRead4.Solution } */
    Solution reader;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        reader = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        reader = null;
    }

    @Test
    public void Test1() {
        char[] contents = { 'a' };
        reader.setContents(contents);

        int n = 1;
        char[] buf = new char[n];
        int actual = reader.read(buf, n);
        int expected = 1;
        assertEquals(expected, actual);
        char[] exps = { 'a' };
        assertArrayEquals(exps, buf);
    }

    @Test
    public void Test2() {
        char[] contents = { 'a' , 'd', 'c', 'b' };
        reader.setContents(contents);

        int n = 2;
        char[] buf = new char[n];
        int actual = reader.read(buf, n);
        int expected = 2;
        assertEquals(expected, actual);
        char[] exps = { 'a', 'd' };
        assertArrayEquals(exps, buf);
    }

    @Test
    public void Test3() {
        char[] contents = { 'x' , 'y' };
        reader.setContents(contents);

        int n = 5;
        char[] buf = new char[n];
        int actual = reader.read(buf, n);
        int expected = 2;
        assertEquals(expected, actual);
        char[] exps = new char[n];
        exps[0] = 'x';
        exps[1] = 'y';
        assertArrayEquals(exps, buf);
    }

    @Test
    public void Test4() {
        char[] contents = { 'a', 'b', 'c', 'd', 'e'};
        reader.setContents(contents);

        int n = 7;
        char[] buf = new char[n];
        int actual = reader.read(buf, n);
        int expected = 5;
        assertEquals(expected, actual);
        char[] exps = new char[n];
        exps[0] = 'a';
        exps[1] = 'b';
        exps[2] = 'c';
        exps[3] = 'd';
        exps[4] = 'e';
        assertArrayEquals(exps, buf);
    }

}