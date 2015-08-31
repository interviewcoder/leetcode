package _138_CopyListWithRandomPointer;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _138_CopyListWithRandomPointer.Solution } */
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
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);
        RandomListNode n4 = new RandomListNode(4);
        RandomListNode n5 = new RandomListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;
        n4.next = n5;
        n1.random = n3;
        n1.random = n5;
        n3.random = n1;
        n3.random = n2;
        RandomListNode head = n1;
        RandomListNode actual = solution.copyRandomList(head);
        System.out.println(actual);
    }

}
