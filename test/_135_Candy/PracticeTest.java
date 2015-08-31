package _135_Candy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _135_Candy.Practice } */
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
        int[] ratings = {1, 3, 5, 4, 2};
        int actual = solution.candy(ratings);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] ratings = {1, 3, 1, 2, 3};
        int actual = solution.candy(ratings);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] ratings = {1, 2, 3, 4, 5};
        int actual = solution.candy(ratings);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] ratings = {5, 4, 3, 2, 1};
        int actual = solution.candy(ratings);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] ratings = {1, 2, 2, 3, 3};
        int actual = solution.candy(ratings);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] ratings = {3, 1, 1, 2, 2};
        int actual = solution.candy(ratings);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] ratings = {1, 2, 1, 3, 2};
        int actual = solution.candy(ratings);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] ratings = {1, 2, 2};
        int actual = solution.candy(ratings);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int[] ratings = {2, 2, 1};
        int actual = solution.candy(ratings);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int[] ratings = {1, 3, 4, 3, 2, 1};
        int actual = solution.candy(ratings);
        int expected = 13;
        assertEquals(expected, actual);
    }

}
