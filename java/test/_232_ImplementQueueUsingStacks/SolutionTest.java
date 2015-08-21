package _232_ImplementQueueUsingStacks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import _232_ImplementQueueUsingStacks.Solution;

public class SolutionTest {
    
    /** Test method for {@link _232_ImplementQueueUsingStacks.Solution } */
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
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.peek());
        solution.push(3);
        assertEquals(1, solution.peek());
    }

    @Test
    public void Test2() {
        assertTrue(solution.empty());
        solution.push(1);
        solution.push(2);
        assertTrue(!solution.empty());
        solution.push(3);
        assertTrue(!solution.empty());
    }

    @Test
    public void Test3() {
        solution.push(1);
        solution.push(2);
        solution.pop();
        assertEquals(2, solution.peek());
        solution.push(3);
        solution.pop();
        assertEquals(3, solution.peek());
        solution.pop();
        assertTrue(solution.empty());
    }

}
