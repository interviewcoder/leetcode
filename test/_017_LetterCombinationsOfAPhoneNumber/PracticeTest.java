package _017_LetterCombinationsOfAPhoneNumber;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _017_LetterCombinationsOfAPhoneNumber.Practice } */
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
    public void Test0() {
        String digits = "23";
        List<String> actuals = solution.letterCombinations(digits);
        List<String> expecteds = Arrays.asList("ad", "ae", "af", "bd", "be",
                "bf", "cd", "ce", "cf");
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test1() {
        String digits = "";
        List<String> actuals = solution.letterCombinations(digits);
        List<String> expecteds = new ArrayList<>();
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

    @Test
    public void Test2() {
        String digits = "9";
        List<String> actuals = solution.letterCombinations(digits);
        List<String> expecteds = new ArrayList<>(Arrays.asList("w", "x", "y", "z"));
        assertEqualsIgnoreOrder(expecteds, actuals);
    }

}
