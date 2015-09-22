package _131_PalindromePartitioning;

import static com.leetcode.Test.assertEqualsIgnoreOrder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {
    
    /** Test method for {@link _131_PalindromePartitioning.Practice } */
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
        String s = "aab";
        List<List<String>> actual = solution.partition(s);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("aa", "b"));
        expected.add(Arrays.asList("a", "a", "b"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "a";
        List<List<String>> actual = solution.partition(s);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "abbab";
        List<List<String>> actual = solution.partition(s);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "b", "b", "a", "b"));
        expected.add(Arrays.asList("a", "b", "bab"));
        expected.add(Arrays.asList("a", "bb", "a", "b"));
        expected.add(Arrays.asList("abba", "b"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "kwtbjmsjvbrwriqwxadwnufplszhqccayvdhhvscxjaqsrmrrqng"
                + "muvxnugdzjfxeihogzsdjtvdmkudckjoggltcuybddbjoizu";
        List<List<String>> actual = solution.partition(s);
        List<List<String>> expected = new ArrayList<>();
        String file = "test/_131_PalindromePartitioning/Test5Expected";
        try {
            BufferedReader rd = new BufferedReader(new FileReader(file));
            while (true) {
                String list = rd.readLine();
                if (list == null) {
                    break;
                }
                list = list.substring(1, list.length() - 1);
                String[] strs = list.split(", ");
                expected.add(Arrays.asList(strs));
            }
            rd.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEqualsIgnoreOrder(expected, actual);
    }

}
