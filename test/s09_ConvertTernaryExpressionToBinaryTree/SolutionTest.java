package s09_ConvertTernaryExpressionToBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link s09_ConvertTernaryExpressionToBinaryTree.Solution } */
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
        String s = "";
        TreeNode actual = solution.convertTernaryToBinaryTree(s);
        TreeNode expected = null;
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    @Test
    public void Test2() {
        String s = "a";
        TreeNode actual = solution.convertTernaryToBinaryTree(s);
        TreeNode expected = new TreeNode('a');
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "a?b?c:d:e";
        TreeNode actual = solution.convertTernaryToBinaryTree(s);
        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode.connect(a, b, e);
        TreeNode.connect(b, c, d);
        TreeNode expected = a;
        assertEquals(expected, actual);
    }

}
