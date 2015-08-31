package _229_MajorityElementII;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _229_MajorityElementII.Practice } */
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
        int[] nums = { 1, 2, 3, 1, 1 };
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {};
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = { 3 };
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 1, 1, 1, 2, 3, 5, 7 };
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = { 1000545, 1000038, 1000647, 1000038, 1000562, 1000038,
                1000586, 1000487, 1000951, 1000226, 1000038, 1000145, 1000038,
                1000761, 1000196, 1000038, 1000821, 1000829, 1000038, 1000570,
                1000846, 1000038, 1000178, 1001000, 1000038, 1000568, 1000278,
                1000734, 1000048, 1000038, 1000002, 1000271, 1000388, 1000315,
                1000816, 1000038, 1000038, 1000846, 1000305, 1000853, 1000383,
                1000116, 1000797, 1000279, 1000038, 1000038, 1000049, 1000108,
                1000789, 1000240, 1000201, 1000506, 1000429, 1000857, 1000649,
                1000898, 1000211, 1000000, 1000178, 1000038, 1000569, 1000695,
                1000451, 1000159, 1000038, 1000038, 1000038, 1000129, 1000038,
                1000038, 1000904, 1000038, 1000038, 1000902, 1000525, 1000038,
                1000166, 1000038, 1000765, 1000038, 1000561, 1000417, 1000523,
                1000668, 1000296, 1000038, 1000038, 1000038, 1000461, 1000654,
                1000924, 1000985, 1000038, 1000426, 1000038, 1000038, 1000038,
                1000904, 1000775, 1000148, 1000961, 1000038, 1000038, 1000038,
                1000833, 1000332, 1000038, 1000038, 1000512, 1000322, 1000592,
                1000524, 1000788, 1000057, 1000497, 1000625, 1000599, 1000484,
                1000038, 1000747, 1000457, 1000111, 1000038, 1000038, 1000493,
                1000287, 1000007, 1000695, 1000344, 1000098, 1000038, 1000191,
                1000038, 1000576, 1000481, 1000488, 1000199, 1000038, 1000663,
                1000176, 1000038, 1000521, 1000721, 1000728, 1000247, 1000038,
                1000038, 1000460, 1000644, 1000038, 1000497, 1000966, 1000431,
                1000038, 1000975, 1000063, 1000580, 1000669, 1000038, 1000038,
                1000492, 1000038, 1000038, 1000529, 1000553, 1000333, 1000038,
                1000341, 1000569, 1000862, 1000017, 1000532, 1000571, 1000508,
                1000402, 1000285, 1000611, 1000210, 1000646, 1000110, 1000038,
                1000553, 1000273, 1000729, 1000038, 1000038, 1000720, 1000400,
                1000038, 1000983, 1000038, 1000766, 1000038, 1000180, 1000494,
                1000765, 1000136, 1000038, 1000029, 1000246, 1000991, 1000038,
                1000759, 1000038, 1000038, 1000045, 1000038, 1000648, 1000038,
                1000038, 1000694, 1000914, 1000990, 1000038, 1000038, 1000758,
                1000435, 1000038, 1000554, 1000038, 1000452, 1000156, 1000038,
                1000322, 1000828, 1000868, 1000038, 1000973, 1000991, 1000464,
                1000294, 1000633, 1000038, 1000582, 1000229, 1000285, 1000038,
                1000038, 1000086, 1000038, 1000989, 1000038, 1000038, 1000157,
                1000307, 1000369, 1000300, 1000038, 1000038, 1000038, 1000244,
                1000038, 1000038, 1000222, 1000458, 1000038, 1000523, 1000434,
                1000316, 1000038, 1000256, 1000038, 1000695, 1000038, 1000469 };
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3 };
        List<Integer> actual = solution.majorityElement(nums);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

}
