package _122_BestTimeToBuyAndSellStockII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _122_BestTimeToBuyAndSellStockII.Solution } */
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
        int[] prices = {1, 2, 3, 4, 5};
        int actual = solution.maxProfit(prices);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] prices = {5, 4, 3, 2, 1};
        int actual = solution.maxProfit(prices);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] prices = {1, 4, 2, 6, 3, 3};
        int actual = solution.maxProfit(prices);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] prices = {3, 2, 1, 3, 2, 7, 3};
        int actual = solution.maxProfit(prices);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] prices = {3};
        int actual = solution.maxProfit(prices);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
