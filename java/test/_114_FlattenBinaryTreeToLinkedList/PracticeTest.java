package _114_FlattenBinaryTreeToLinkedList;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {

    /** Test method for {@link _114_FlattenBinaryTreeToLinkedList.Practice } */
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

    //     1
    //    / \
    //   2   5     ===> 1 - 2 - 3 - 4 - 5 - 6
    //  / \   \
    // 3   4   6
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        TreeNode.connect(t3, null, t6);
        TreeNode root = t1;

        solution.flatten(root);

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode.connect(e1, null, e2);
        TreeNode.connect(e2, null, e3);
        TreeNode.connect(e3, null, e4);
        TreeNode.connect(e4, null, e5);
        TreeNode.connect(e5, null, e6);
        TreeNode expected = e1;

        assertTrue(TreeNode.isSameTree(expected, root));

    }

}
