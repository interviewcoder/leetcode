package _225_ImplementStackUsingQueues;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MyStackOneQueueTest {
    
    /** Test method for {@link _225_ImplementStackUsingQueues.MyStackOneQueue } */
    MyStackOneQueue stack;

    @Rule
    public Timeout globalTimeout = new Timeout(100);

    @Before
    public void setUp() throws Exception {
        stack = new MyStackOneQueue();
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test
    public void Test1() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
    }

    @Test
    public void Test2() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        stack.pop();
        stack.push(3);
        assertEquals(3, stack.top());
        assertTrue(!stack.empty());
        stack.pop();
        stack.pop();
        assertTrue(stack.empty());
    }

}
