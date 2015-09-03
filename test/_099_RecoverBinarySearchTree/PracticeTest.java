package _099_RecoverBinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _099_RecoverBinarySearchTree.Practice } */
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

    //          5      5
    //         /      /
    //        2  =>  4
    //      /       /
    //     3       3
    //    /       /
    //   4   =>  2
    //  /       /
    // 1       1
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(1);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode.connect(t4, t5, null);
        TreeNode root = t1;

        TreeNode e1 = new TreeNode(5);
        TreeNode e2 = new TreeNode(4);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(2);
        TreeNode e5 = new TreeNode(1);
        TreeNode.connect(e1, e2, null);
        TreeNode.connect(e2, e3, null);
        TreeNode.connect(e3, e4, null);
        TreeNode.connect(e4, e5, null);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    // 1       1
    //  \       \  
    //   4   =>  2
    //    \       \
    //     3       3
    //      \       \
    //       2  =>   4
    //        \       \
    //         5       5
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t1, null, t4);
        TreeNode.connect(t4, null, t3);
        TreeNode.connect(t3, null, t2);
        TreeNode.connect(t2, null, t5);
        TreeNode root = t1;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode.connect(e3, null, e4);
        TreeNode.connect(e4, null, e5);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //      3            3
    //    /   \        /   \
    //   4     2  =>  2     4
    //  /       \    /       \
    // 1         5  1         5
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t3, t4, t2);
        TreeNode.connect(t4, t1, null);
        TreeNode.connect(t2, null, t5);
        TreeNode root = t3;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode.connect(e3, e2, e4);
        TreeNode.connect(e2, e1, null);
        TreeNode.connect(e4, null, e5);
        TreeNode expected = e3;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //      2            3
    //    /   \        /   \
    //   3     4  =>  2     4
    //  /       \    /       \
    // 1         5  1         5
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode.connect(t2, t3, t4);
        TreeNode.connect(t3, t1, null);
        TreeNode.connect(t4, null, t5);
        TreeNode root = t2;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode.connect(e3, e2, e4);
        TreeNode.connect(e2, e1, null);
        TreeNode.connect(e4, null, e5);
        TreeNode expected = e3;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //    3          2 
    //  /   \      /   \
    // 1     2    1     3 
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t3, t1, t2);
        TreeNode root = t3;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e2, e1, e3);
        TreeNode expected = e2;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //    3          1 
    //       \          \
    //        1          3 
    //       /           /
    //      2           2
    @Test
    public void Test6() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t3, null, t1);
        TreeNode.connect(t1, t2, null);
        TreeNode root = t3;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e1, null, e3);
        TreeNode.connect(e3, e2, null);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //    2          1 
    //       \          \
    //        3          3 
    //       /           /
    //      1           2
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, t1, null);
        TreeNode root = t2;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e1, null, e3);
        TreeNode.connect(e3, e2, null);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    //        3 
    //      /   \
    //     2     0   
    //    /     / \
    //   1     6   7
    //  /
    // 4 
    // ------------------
    //        3 
    //      /   \
    //     2     4   
    //    /     / \
    //   1     6   7
    //  /
    // 0
    @Test
    public void Test8() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n0 = new TreeNode(0);
        TreeNode.connect(n3, n2, n0);
        TreeNode.connect(n2, n1, null);
        TreeNode.connect(n0, n6, n7);
        TreeNode.connect(n1, n4, null);
        TreeNode root = n3;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode e0 = new TreeNode(0);
        TreeNode.connect(e3, e2, e4);
        TreeNode.connect(e2, e1, null);
        TreeNode.connect(e4, e6, e7);
        TreeNode.connect(e1, e0, null);
        TreeNode expected = e3;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    // 1       1
    //  \       \  
    //   3   =>  2
    //    \       \
    //     2       3
    //      \       \
    //       4  =>   4
    //        \       \
    //         5       5
    //          \       \
    //           6       6
    //            \       \
    //             7       7
    @Test
    public void Test9() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode.connect(t1, null, t3);
        TreeNode.connect(t3, null, t2);
        TreeNode.connect(t2, null, t4);
        TreeNode.connect(t4, null, t5);
        TreeNode.connect(t5, null, t6);
        TreeNode.connect(t6, null, t7);
        TreeNode root = t1;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode.connect(e3, null, e4);
        TreeNode.connect(e4, null, e5);
        TreeNode.connect(e5, null, e6);
        TreeNode.connect(e6, null, e7);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

    // 5       1
    //  \       \  
    //   2   =>  2
    //    \       \
    //     3       3
    //      \       \
    //       4  =>   4
    //        \       \
    //         1       5
    //          \       \
    //           6       6
    //            \       \
    //             7       7
    //              \       \
    //               8       8              
    @Test
    public void Test10() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode.connect(t5, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode.connect(t3, null, t4);
        TreeNode.connect(t4, null, t1);
        TreeNode.connect(t1, null, t6);
        TreeNode.connect(t6, null, t7);
        TreeNode.connect(t7, null, t8);
        TreeNode root = t5;

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode e8 = new TreeNode(8);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode.connect(e3, null, e4);
        TreeNode.connect(e4, null, e5);
        TreeNode.connect(e5, null, e6);
        TreeNode.connect(e6, null, e7);
        TreeNode.connect(e7, null, e8);
        TreeNode expected = e1;

        solution.recoverTree(root);
        assertTrue(TreeNode.isSameTree(expected, root));
    }

}
