package _173_BinarySearchTreeIterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class PracticeTest {
    
    /** Test method for {@link _173_BinarySearchTreeIterator.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

    @Test
    public void Test1() {
        TreeNode root = TreeNode.getEmptyBST();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    //   1
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getBST1();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getBST2();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getBST3();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    //      2 
    //    /   \
    //   1     3
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getBST4();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getBST5();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = Arrays.asList(4, 5, 7, 10, 12);
        assertEquals(expected, actual);
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \
    //     5
    //    /
    //    4
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getBST6();
        solution = new Practice(root);
        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = Arrays.asList(3, 4, 5, 6, 7, 8, 10, 18, 20);
        assertEquals(expected, actual);
    }

}
