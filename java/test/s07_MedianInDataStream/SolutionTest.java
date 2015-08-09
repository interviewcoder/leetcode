package s07_MedianInDataStream;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    private static final double DELTA = 1e-15;
    
    /** Test method for {@link s07_MedianInDataStream.Solution } */
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
        int[] nums = {};
        double actual = solution.findMedian(nums);
        double expected = 0;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test2() {
        int[] nums = {1};
        double actual = solution.findMedian(nums);
        double expected = 1;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test3() {
        int[] nums = {4, 3, 2, 1};
        double actual = solution.findMedian(nums);
        double expected = 2.5;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test4() {
        int[] nums = {2, 6, 4};
        double actual = solution.findMedian(nums);
        double expected = 4;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test5() {
        int[] nums = {0, 2, 6, 4};
        double actual = solution.findMedian(nums);
        double expected = 3;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test6() {
        int n = 101;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        int mid = (n - 1) / 2;
        double expected = nums[mid];
        shuffleArray(nums);
        double actual = solution.findMedian(nums);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void Test7() {
        int n = 10000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        int mid = (n - 1) / 2;
        double expected = (nums[mid] + nums[mid + 1]) / 2.0;
        shuffleArray(nums);
        double actual = solution.findMedian(nums);
        assertEquals(expected, actual, DELTA);
    }

    // implementation of Knuth shuffling
    private void shuffleArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Random rd = new Random();
            // random number from [0, i + 1)
            int index = rd.nextInt(i + 1);
            if (index <= i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp; 
            }
        }
    }

}
