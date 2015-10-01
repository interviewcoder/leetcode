/**
 * Time : O() ; Space: O()
 * @tag : Design
 * @by  : Steven Cooks
 * @date: Sep 30, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an Iterator class interface with methods: next() and hasNext(), 
 * design and implement a PeekingIterator that support the peek() operation 
 * -- it essentially peek() at the element that will be returned by the next 
 * call to next().
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/peeking-iterator/ }
 */
package _284_PeekingIterator;

import java.util.Iterator;

/** see test {@link _284_PeekingIterator.SolutionTest } */
public class Solution implements Iterator<Integer> {
    
    private Integer cache;
    
    private Iterator<Integer> _iter;
    
    public Solution(Iterator<Integer> iterator) {
        // initialize any member here.
        cache = null;
        _iter = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (cache == null) {
            cache = _iter.next();
        }
        return cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (cache != null) {
            Integer next = cache;
            cache = null;
            return next;
        } else {
            return _iter.next();
        }
    }

    @Override
    public boolean hasNext() {
        return _iter.hasNext() || cache != null;
    }

}
