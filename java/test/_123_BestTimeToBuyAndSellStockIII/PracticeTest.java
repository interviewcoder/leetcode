package _123_BestTimeToBuyAndSellStockIII;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _123_BestTimeToBuyAndSellStockIII.Practice } */
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
        int[] prices = { 1, 2, 3 };
        int actual = solution.maxProfit(prices);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] prices = { 1, 3, 1, 2, 1, 6 };
        int actual = solution.maxProfit(prices);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] prices = { 1, 3, 2, 1, 2, 1, 6 };
        int actual = solution.maxProfit(prices);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] prices = { 4, 2, 1 };
        int actual = solution.maxProfit(prices);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] prices = { 4, 2, 1, 2 };
        int actual = solution.maxProfit(prices);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] prices = { 1, 2, 4, 3, 2, 1, 2, 1, 10 };
        int actual = solution.maxProfit(prices);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] prices = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
        int actual = solution.maxProfit(prices);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int[] prices = new int[30000];
        int n = 0;
        try {
            String filename = "src/_123_BestTimeToBuyAndSellStockIII/Test8Input.txt";
            File file = new File(filename);
            BufferedReader rd = new BufferedReader(new FileReader(file));
            while (true) {
                String strLine = rd.readLine();
                if (strLine == null) {
                    break;
                }
                strLine = strLine.substring(1, strLine.length() - 1);
                String[] strs = strLine.split(",");
                for (int i = 0; i < strs.length; i++) {
                    prices[n++] = Integer.parseInt(strs[i]);
                }
            }
            rd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        int actual = solution.maxProfit(prices);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
