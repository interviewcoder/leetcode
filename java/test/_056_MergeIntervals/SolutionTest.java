package _056_MergeIntervals;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Interval;

public class SolutionTest {

    /** Test method {@link _056_MergeIntervals.Solution } */
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
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 6));
        expected.add(new Interval(8, 10));
        expected.add(new Interval(15, 18));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 9));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 10));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 9));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 2));
        expected.add(new Interval(3, 5));
        expected.add(new Interval(6, 9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(2, 6));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 6));
        assertEquals(expected, actual);
    }

}