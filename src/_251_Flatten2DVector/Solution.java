/**
 * Time : O() ; Space: O()
 * @tag : Design
 * @by  : Steven Cooks
 * @date: Sep 20, 2015
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
 * {@link https://leetcode.com/problems/flatten-2d-vector/ }
 */
package _251_Flatten2DVector;

import java.util.List;
import java.util.NoSuchElementException;

/** see test {@link _251_Flatten2DVector.SolutionTest } */
public class Solution {
    
    private int _x;
    private int _y;
    
    List<List<Integer>> _vec;

    public Solution(List<List<Integer>> vec2d) {
        _x = 0;
        _y = 0;
        _vec = vec2d;
        while (_x < _vec.size() && _vec.get(_x).size() == 0) {
            _x++;
        }
    }

    public boolean hasNext() {
        return _x < _vec.size() && _y < _vec.get(_x).size();
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int next = _vec.get(_x).get(_y);
        _y++;
        while (_x < _vec.size() && _vec.get(_x).size() == _y) {
            _x++;
            _y = 0;
        }
        return next;
    }
    
}
