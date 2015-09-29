package _256_PaintHouse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _256_PaintHouse.Solution } */
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
    public void Test0() {
        int[][] costs = {
                { 10, 30, 20 },
        };
        int actual = solution.minCost(costs);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        int[][] costs = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        int actual = solution.minCost(costs);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[][] costs = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 2, 2, 2 },
                { 3, 1, 2 }
        };
        int actual = solution.minCost(costs);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[][] costs = {
                {17,  2, 17 },
                {16, 16,  5 },
                {14,  3, 19 },
        };
        int actual = solution.minCost(costs);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[][] costs = { 
                { 12,  1, 19 }, 
                { 15,  1, 10 }, 
                {  3, 11, 10 },
                {  9,  3, 10 }, 
                {  4,  8,  7 }, 
                {  4, 18,  2 }, 
                { 16,  6,  6 },
                {  3,  3,  6 }, 
                { 10, 18, 16 }, 
                {  5,  4,  8 }, 
                {  5,  3, 16 },
                { 11,  8, 19 }, 
                { 18, 15, 18 }, 
                { 16,  4, 15 }, 
                { 10,  7, 13 },
                { 11, 10, 14 }, 
                {  3,  9,  8 }, 
                {  5,  2,  2 }, 
                {  3,  2,  5 },
                {  2, 19, 14 }, 
                { 17,  3,  6 }, 
                {  6,  4, 17 }, 
                {  5, 15, 19 },
                {  2, 14, 14 }, 
                { 19,  4, 16 } 
        };
        int actual = solution.minCost(costs);
        int expected = 143;
        assertEquals(expected, actual);
    }

}
