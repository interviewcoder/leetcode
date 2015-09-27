package _253_MeetingRoomsII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Interval;

public class PracticeTest {
    
    /** Test method for {@link _253_MeetingRoomsII.Practice } */
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
        Interval[] intervals = {
                new Interval( 0, 30),
                new Interval( 5, 10),
                new Interval(15, 20),
        };
        int actual = solution.minMeetingRooms(intervals);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        Interval[] intervals = {
                new Interval( 0, 3),
                new Interval( 5, 10),
                new Interval(15, 20),
        };
        int actual = solution.minMeetingRooms(intervals);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        Interval[] intervals = {
                new Interval( 0, 30),
                new Interval( 5, 10),
                new Interval( 6, 20),
        };
        int actual = solution.minMeetingRooms(intervals);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        Interval[] intervals = {
                new Interval( 2, 11),
                new Interval( 6, 16),
                new Interval(11, 16),
        };
        int actual = solution.minMeetingRooms(intervals);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
