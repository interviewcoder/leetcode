package _261_GraphValidTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBFSTest {
    
    /** Test method for {@link _261_GraphValidTree.SolutionBFS } */
    SolutionBFS solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBFS();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[][] edges = {
                { 0, 1 },
                { 0, 2 },
                { 0, 3 },
                { 1, 4 }
        };
        int n = 5;
        assertTrue(solution.validTree(n, edges));
    }

    @Test
    public void Test2() {
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 3 },
                { 1, 3 },
                { 1, 4 }
        };
        int n = 5;
        assertTrue(!solution.validTree(n, edges));
    }

    @Test
    public void Test3() {
        int[][] edges = {
                { 0, 1 },
                { 2, 3 }
        };
        int n = 4;
        assertTrue(!solution.validTree(n, edges));
    }

    @Test
    public void Test4() {
        int[][] edges = {
                { 1, 0 },
                { 2, 0 }
        };
        int n = 3;
        assertTrue(solution.validTree(n, edges));
    }

    @Test
    public void Test6() {
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 3 },
                { 3, 0 },
                { 3, 4 }
        };
        int n = 5;
        assertTrue(!solution.validTree(n, edges));
    }

    @Test
    public void Test7() {
        int[][] edges = {
                { 2, 0 },
                { 2, 1 }
        };
        int n = 3;
        assertTrue(solution.validTree(n, edges));
    }


}
