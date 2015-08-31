package _133_CloneGraph;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.UndirectedGraphNode;

public class SolutionTest {
    
    /** Test method for {@link _133_CloneGraph.Solution } */
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

    //  n1 - n2
    @Test
    public void Test0() {
        UndirectedGraphNode n1 = null;
        assertTrue(UndirectedGraphNode.isSameGraph(n1, solution.cloneGraph(n1)));
    }

    @Test
    public void Test1() {
        UndirectedGraphNode n1 = new UndirectedGraphNode(1);
        assertTrue(UndirectedGraphNode.isSameGraph(n1, solution.cloneGraph(n1)));
    }

    //    1  
    //   /_\ 
    @Test
    public void Test2() {
        UndirectedGraphNode n1 = new UndirectedGraphNode(1);
        n1.neighbors.add(n1);
        assertTrue(UndirectedGraphNode.isSameGraph(n1, solution.cloneGraph(n1)));
    }

    //    1
    //   / 
    //  2
    @Test
    public void Test3() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        n11.neighbors.add(n12);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1
    //   /_\
    //  2 
    @Test
    public void Test4() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        n11.neighbors.add(n12);
        n11.neighbors.add(n11);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1
    //   / \
    //  2   3
    @Test
    public void Test5() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1  
    //   / \ 
    //  2 - 3
    @Test
    public void Test6() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1  
    //   / \ 
    //  2 - 3 
    //   \   \ 
    //    --- 4 
    @Test
    public void Test7() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n14);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1--
    //   / \  \
    //  2 - 3  \
    //   \   \  \
    //    --- 4 --
    @Test
    public void Test8() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n14);
        n14.neighbors.add(n11);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

    //    1   
    //   / \  /\
    //  2 - 3 --\
    //   \   \ 
    //    --- 4 
    //       /
    //      5
    @Test
    public void Test11() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        UndirectedGraphNode n15 = new UndirectedGraphNode(5);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n13);
        n13.neighbors.add(n14);
        n14.neighbors.add(n15);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, solution.cloneGraph(n11)));
    }

}
