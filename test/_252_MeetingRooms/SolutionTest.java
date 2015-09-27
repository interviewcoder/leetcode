package _252_MeetingRooms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.Interval;

public class SolutionTest {
    
    /** Test method for {@link _252_MeetingRooms.Solution } */
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
        Interval[] intervals = {
                new Interval( 0, 30),
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertTrue(!solution.canAttendMeetings(intervals));
    }

    @Test
    public void Test2() {
        Interval[] intervals = {
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertTrue(solution.canAttendMeetings(intervals));
    }

}
