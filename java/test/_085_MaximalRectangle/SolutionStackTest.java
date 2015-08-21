package _085_MaximalRectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionStackTest {
    
    /** Test method for {@link _085_MaximalRectangle.SolutionStack } */
    SolutionStack solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionStack();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        char[][] matrix = { 
                { '1', '1', '1', '1' }, 
                { '1', '1', '1', '1' },
                { '1', '1', '1', '1' }, 
                { '1', '1', '1', '1' } 
        };
        int actual = solution.maximalRectangle(matrix);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        char[][] matrix = { 
                { '1', '1', '1', '0' }, 
                { '1', '0', '1', '1' },
                { '1', '1', '0', '1' }, 
                { '1', '0', '1', '1' } 
        };
        int actual = solution.maximalRectangle(matrix);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        char[][] matrix = { 
                { '1', '1', '1', '1' }, 
                { '1', '1', '1', '1' },
                { '1', '1', '0', '1' }, 
                { '1', '0', '1', '1' }
        };
        int actual = solution.maximalRectangle(matrix);
        int expected = 8;
        assertEquals(expected, actual);
    }

}
