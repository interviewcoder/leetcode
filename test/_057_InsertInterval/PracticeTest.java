package _057_InsertInterval;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Interval;

public class PracticeTest {
    
    /** Test method for {@link _057_InsertInterval.Practice } */
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        Interval newInterval = new Interval(2, 5);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1, 5));
        expected.add(new Interval(6, 9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(12, 16));
        Interval newInterval = new Interval(4, 9);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1, 2));
        expected.add(new Interval(3, 10));
        expected.add(new Interval(12, 16));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Interval> intervals = new ArrayList<>();
        Interval newInterval = new Interval(2, 5);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(2, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 4));
        Interval newInterval = new Interval(5, 6);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1, 2));
        expected.add(new Interval(3, 4));
        expected.add(new Interval(5, 6));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(3, 4));
        intervals.add(new Interval(5, 6));
        Interval newInterval = new Interval(1, 2);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1, 2));
        expected.add(new Interval(3, 4));
        expected.add(new Interval(5, 6));
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(8, 10));
        Interval newInterval = new Interval(4, 5);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(3, 6));
        expected.add(new Interval(8, 10));
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 5));
        Interval newInterval = new Interval(0, 3);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(0, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(12, 15));
        Interval newInterval = new Interval(6, 6);
        List<Interval> actual = solution.insert(intervals, newInterval);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(3, 5));
        expected.add(new Interval(6, 6));
        expected.add(new Interval(12, 15));
        assertEquals(expected, actual);
    }

}
