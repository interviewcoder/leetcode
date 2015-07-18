package _095_UniqueBinarySearchTreesII;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {

    /** Test method for {@link _095_UniqueBinarySearchTreesII.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

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
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(3);
        TreeNode t13 = new TreeNode(2);
        TreeNode.connect(t11, null, t12);
        TreeNode.connect(t12, t13, null);

        TreeNode t21 = new TreeNode(3);
        TreeNode t22 = new TreeNode(2);
        TreeNode t23 = new TreeNode(1);
        TreeNode.connect(t21, t22, null);
        TreeNode.connect(t22, t23, null);

        TreeNode t31 = new TreeNode(3);
        TreeNode t32 = new TreeNode(1);
        TreeNode t33 = new TreeNode(2);
        TreeNode.connect(t31, t32, null);
        TreeNode.connect(t32, null, t33);

        TreeNode t41 = new TreeNode(2);
        TreeNode t42 = new TreeNode(1);
        TreeNode t43 = new TreeNode(3);
        TreeNode.connect(t41, t42, t43);

        TreeNode t51 = new TreeNode(1);
        TreeNode t52 = new TreeNode(2);
        TreeNode t53 = new TreeNode(3);
        TreeNode.connect(t51, null, t52);
        TreeNode.connect(t52, null, t53);
        
        int n = 3;
        List<TreeNode> actual = solution.generateTrees(n);
        List<TreeNode> expected = new ArrayList<>();
        expected.add(t11);
        expected.add(t21);
        expected.add(t31);
        expected.add(t41);
        expected.add(t51);

        assertTrue(isListEqual(actual, expected));

    }
    
    public boolean isListEqual(List<TreeNode> l1, List<TreeNode> l2) {
        List<String> actualList = new ArrayList<>();
        for (TreeNode root : l1) {
            actualList.add(root.toString());
        }
        List<String> expectedList = new ArrayList<>();
        for (TreeNode root : l2) {
            expectedList.add(root.toString());
        }
        return actualList.containsAll(expectedList) 
                && expectedList.containsAll(actualList);
    }

    @Test
    public void Test2() {
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode.connect(t11, null, t12);

        TreeNode t21 = new TreeNode(2);
        TreeNode t22 = new TreeNode(1);
        TreeNode.connect(t21, t22, null);

        int n = 2;
        List<TreeNode> actual = solution.generateTrees(n);
        List<TreeNode> expected = new ArrayList<>();
        expected.add(t11);
        expected.add(t21);
        
        assertTrue(isListEqual(actual, expected));

    }

}
