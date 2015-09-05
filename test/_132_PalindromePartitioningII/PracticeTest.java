package _132_PalindromePartitioningII;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _132_PalindromePartitioningII.Practice } */
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
        int actual = solution.minCut(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "abcd";
        int actual = solution.minCut(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "abba";
        int actual = solution.minCut(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "ltsqjodzeriqdtyewsrpfscozbyrpidadvsmlylqrviuqiynbscg"
                + "mhulkvdzdicgdwvquigoepiwxjlydogpxdahyfhdnljshgjeprsvg"
                + "ctgnfgqtnfsqizonirdtcvblehcwbzedsmrxtjsipkyxk";
        int actual = solution.minCut(s);
        int expected = 143;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "adabdcaebdcebdcacaaaadbbcadabcbeabaadcbcaaddebdbddcb"
                + "dacdbbaedbdaaecabdceddccbdeeddccdaabbabbdedaaabcdadbd"
                + "abeacbeadbaddcbaacdbabcccbaceedbcccedbeecbccaecadccbd"
                + "bdccbcbaacccbddcccbaedbacdbcaccdcaadcbaebebcceabbdcde"
                + "aabdbabadeaaaaedbdbcebcbddebccacacddebecabccbbdcbecba"
                + "eedcdacdcbdbebbacddddaabaedabbaaabaddcdaadcccdeebcaba"
                + "cdadbaacdccbeceddeebbbdbaaaaabaeecccaebdeabddacbedede"
                + "debdebabdbcbdcbadbeeceecdcdbbdcbdbeeebcdcabdeeacabdea"
                + "edebbcaacdadaecbccbededceceabdcabdeabbcdecdedadcaebaa"
                + "babeedcaacdbdacbccdbcece";
        int actual = solution.minCut(s);
        int expected = 273;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int actual = solution.minCut(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String s = "apjesgpsxoeiokmqmfgvjslcjukbqxpsobyhjpbgdfruqdkeiszrlmtwgfxyfostpqczidfljwfbbrflkgdvtytbgqalguewnhvvmcgxboycffopmtmhtfizxkmeftcucxpobxmelmjtuzigsxnncxpaibgpuijwhankxbplpyejxmrrjgeoevqozwdtgospohznkoyzocjlracchjqnggbfeebmuvbicbvmpuleywrpzwsihivnrwtxcukwplgtobhgxukwrdlszfaiqxwjvrgxnsveedxseeyeykarqnjrtlaliyudpacctzizcftjlunlgnfwcqqxcqikocqffsjyurzwysfjmswvhbrmshjuzsgpwyubtfbnwajuvrfhlccvfwhxfqthkcwhatktymgxostjlztwdxritygbrbibdgkezvzajizxasjnrcjwzdfvdnwwqeyumkamhzoqhnqjfzwzbixclcxqrtniznemxeahfozp";
        int actual = solution.minCut(s);
        int expected = 452;
        assertEquals(expected, actual);
    }

}
