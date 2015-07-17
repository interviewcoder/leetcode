package _146_LRUCache;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _146_LRUCache.Solution } */
    Solution cache;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Test
    public void Test1() {
        int capacity = 1;
        cache = new Solution(capacity);
        assertEquals(-1, cache.get(1));
        cache.set(1, 1);
        assertEquals(1, cache.get(1));
        cache.set(1, 2);
        assertEquals(2, cache.get(1));
        cache.set(2, 3);
        assertEquals(3, cache.get(2));
        assertEquals(3, cache.get(2));
        cache = null;
    }

    @Test
    public void Test2() {
        int capacity = 3;
        cache = new Solution(capacity);
        assertEquals(-1, cache.get(1));
        cache.set(1, 1);
        cache.set(1, 2);
        cache.set(1, 3);
        cache.set(1, 4);
        assertEquals(4, cache.get(1));
        cache.set(2, 21);
        cache.set(3, 31);
        cache.set(4, 41);
        System.out.println(cache);
        assertEquals(-1, cache.get(1));
        assertEquals(21, cache.get(2));
        assertEquals(31, cache.get(3));
        assertEquals(41, cache.get(4));
        cache.set(5, 51);
        assertEquals(-1, cache.get(2));
        assertEquals(51, cache.get(5));
    }

}
