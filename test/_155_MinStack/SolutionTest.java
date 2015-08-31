package _155_MinStack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _155_MinStack.Solution} */
    Solution minStack;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        minStack = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        minStack = null;
    }

    @Test
    public void Test1() {
        minStack.push(1);
        assertEquals(1, minStack.top());
        minStack.push(2);
        minStack.push(3);
        assertEquals(3, minStack.top());
    }

    @Test
    public void Test2() {
        minStack.push(1);
        assertEquals(1, minStack.top());
        assertEquals(1, minStack.getMin());
        minStack.push(2);
        minStack.push(3);
        assertEquals(1, minStack.getMin());
    }

    @Test
    public void Test3() {
        minStack.push(3);
        assertEquals(3, minStack.top());
        minStack.push(2);
        assertEquals(2, minStack.top());
        minStack.push(1);
        assertEquals(1, minStack.top());
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        assertEquals(2, minStack.top());
        minStack.pop();
        assertEquals(3, minStack.getMin());
        assertEquals(3, minStack.top());
    }

    @Test
    public void Test4() {
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        assertEquals(2147483647, minStack.top());
        minStack.pop();
        assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        assertEquals(2147483647, minStack.top());
        assertEquals(2147483647, minStack.getMin());
        minStack.push(-2147483648);
        assertEquals(-2147483648, minStack.top());
        assertEquals(-2147483648, minStack.getMin());
        minStack.pop();
        assertEquals(2147483647, minStack.getMin());
    }

    @Test
    public void Test5() {
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.getMin());
    }

}
