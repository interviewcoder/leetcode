package _112_PathSum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _112_PathSum.Practice } */
    Practice solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \         \
    // 7    2         1
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t4, t7, t8);
        TreeNode.connect(t6, null, t9);
        TreeNode root = t1;
        int sum = 22;
        boolean actual = solution.hasPathSum(root, sum);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode root = t1;
        int sum = 22;

        assertTrue(solution.hasPathSum(root, sum));
    }

    //       10
    //      /  \
    //     5   12
    //    / \
    //   4   7
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode root = t1;
        int sum = 15;

        assertTrue(!solution.hasPathSum(root, sum));
    }

    //          5
    //         /
    //       4
    //      /
    //     3
    //    /
    //   2
    //  /
    // 1
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(1);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode.connect(t4, t5, null);
        TreeNode root = t1;
        int sum = 15;

        assertTrue(solution.hasPathSum(root, sum));
    }

    //   1
    //    \
    //     2
    //      \
    //       3
    //        \
    //         4
    //          \
    //           5
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode root = t1;
        int sum = 15;

        assertTrue(solution.hasPathSum(root, sum));
    }

    //   1
    //    \
    //     2
    //      \
    //       3
    //        \
    //         4
    //          \
    //           5
    @Test
    public void Test6() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode root = t1;
        int sum = 16;

        assertTrue(!solution.hasPathSum(root, sum));
    }

    // 1
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(1);
        TreeNode root = t1;
        int sum = 16;
        assertTrue(!solution.hasPathSum(root, sum));
    }

    // 1
    @Test
    public void Test8() {
        TreeNode t1 = new TreeNode(1);
        TreeNode root = t1;
        int sum = 16;
        assertTrue(!solution.hasPathSum(root, sum));
    }

    @Test
    public void Test9() {
        TreeNode root = null;
        int sum = 16;
        assertTrue(!solution.hasPathSum(root, sum));
    }

    //    1
    //   /
    // 2
    @Test
    public void Test10() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode.connect(t1, t2, null);
        TreeNode root = t1;
        int sum = 1;
        assertTrue(!solution.hasPathSum(root, sum));
    }

}
