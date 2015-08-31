/**
 * Time : O(); Space : O()
 * @tag :
 * @by  : Steven Cooks
 * @date: Jul 12, 2015
 *******************************************************************************
 * Description: 
 * 
 *******************************************************************************
 * {@link  }
 */
package s01_SubarraySum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link s01_SubarraySum.Solution } */
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
        int[] nums = {1, 2, -3, 1};
        int target = 0;
        List<List<Integer>> actual = solution.subarraySumToTarget(nums, target);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, -3));
        expected.add(Arrays.asList(2, -3, 1));
        assertEquals(expected, actual);
    }

}
