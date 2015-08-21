package com.leetcode;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UndirectedGraphNodeTest {
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    /**
     * Test method for {@link com.leetcode.UndirectedGraphNode#isSameGraph}
     */
    @Test
    public void Test0() {
        UndirectedGraphNode n1 = null;
        UndirectedGraphNode n2 = null;
        assertTrue(UndirectedGraphNode.isSameGraph(n1, n2));
    }

    @Test
    public void Test1() {
        UndirectedGraphNode n1 = new UndirectedGraphNode(1);
        UndirectedGraphNode n2 = new UndirectedGraphNode(1);
        assertTrue(UndirectedGraphNode.isSameGraph(n1, n2));
    }

    //    1         1
    //   /_\       /_\
    @Test
    public void Test2() {
        UndirectedGraphNode n1 = new UndirectedGraphNode(1);
        n1.neighbors.add(n1);
        UndirectedGraphNode n2 = new UndirectedGraphNode(1);
        n2.neighbors.add(n2);
        assertTrue(UndirectedGraphNode.isSameGraph(n1, n2));
    }

    //    1         1
    //   /         /_\
    //  2
    @Test
    public void Test3() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        n11.neighbors.add(n12);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        n21.neighbors.add(n21);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1         1
    //   /         /_\
    //  2         2
    @Test
    public void Test4() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        n11.neighbors.add(n12);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        n21.neighbors.add(n21);
        n21.neighbors.add(n22);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2   3      2   4
    @Test
    public void Test5() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(4);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2   3      2   3
    @Test
    public void Test6() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2 - 3      2   3
    @Test
    public void Test7() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2 - 3      2 - 3
    //   \   \          \
    //    --- 4          4
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
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        UndirectedGraphNode n24 = new UndirectedGraphNode(4);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        n22.neighbors.add(n23);
        n23.neighbors.add(n24);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2 - 3      2 - 3
    //   \   \      \   \
    //    --- 4      ----4
    @Test
    public void Test9() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n14);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        UndirectedGraphNode n24 = new UndirectedGraphNode(4);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        n22.neighbors.add(n23);
        n22.neighbors.add(n24);
        n23.neighbors.add(n24);
        assertTrue(UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1 --
    //   / \        / \   \
    //  2 - 3      2 - 3   \
    //   \   \      \   \   \
    //    --- 4       ---4 --
    @Test
    public void Test10() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n14);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        UndirectedGraphNode n24 = new UndirectedGraphNode(4);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        n22.neighbors.add(n23);
        n22.neighbors.add(n24);
        n23.neighbors.add(n24);
        n24.neighbors.add(n21);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

    //    1          1
    //   / \        / \
    //  2 - 3      2 - 3
    //   \   \      \   \
    //    --- 4      ----4
    //                  /
    //                 5
    @Test
    public void Test11() {
        UndirectedGraphNode n11 = new UndirectedGraphNode(1);
        UndirectedGraphNode n12 = new UndirectedGraphNode(2);
        UndirectedGraphNode n13 = new UndirectedGraphNode(3);
        UndirectedGraphNode n14 = new UndirectedGraphNode(4);
        n11.neighbors.add(n12);
        n11.neighbors.add(n13);
        n12.neighbors.add(n13);
        n12.neighbors.add(n14);
        n13.neighbors.add(n14);
        UndirectedGraphNode n21 = new UndirectedGraphNode(1);
        UndirectedGraphNode n22 = new UndirectedGraphNode(2);
        UndirectedGraphNode n23 = new UndirectedGraphNode(3);
        UndirectedGraphNode n24 = new UndirectedGraphNode(4);
        UndirectedGraphNode n25 = new UndirectedGraphNode(5);
        n21.neighbors.add(n22);
        n21.neighbors.add(n23);
        n22.neighbors.add(n23);
        n22.neighbors.add(n24);
        n23.neighbors.add(n24);
        n24.neighbors.add(n25);
        assertTrue(!UndirectedGraphNode.isSameGraph(n11, n21));
    }

}
