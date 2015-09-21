/**
 ***************************************************************************
 * Description:
 * 
 * Implement an iterator to flatten a 2d vector. 
 * For example, 
 * Given 2d vector = 
 * [ [1,2],
 *   [3], 
 *   [4,5,6] 
 * ] 
 * 
 * By calling next repeatedly until hasNext returns false, the order of 
 * elements returned by next should be: [1,2,3,4,5,6].
 *
 ***************************************************************************
 * @tag : Design
 * {@link https://leetcode.com/problems/flatten-2d-vector/ }
 */
package _251_Flatten2DVector;

import java.util.List;

/** see test {@link _251_Flatten2DVector.SolutionTest } */
public class Practice {
    
    public Practice(List<List<Integer>> vec2d) {
    }

    public boolean hasNext() {
        return false;
    }

    public int next() {
        return 0;
    }
    
}
