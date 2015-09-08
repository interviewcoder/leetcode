package _115_DistinctSubsequences;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionDFSTest {
    
    /** Test method for {@link _115_DistinctSubsequences.SolutionDFS } */
    SolutionDFS solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionDFS();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "rabbbit";
        String t = "rabbit";
        int actual = solution.numDistinct(s, t);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "a";
        String t = "";
        int actual = solution.numDistinct(s, t);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "ababab";
        String t = "ab";
        int actual = solution.numDistinct(s, t);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "abcb";
        String t = "abcb";
        int actual = solution.numDistinct(s, t);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "anacondastreetracecar";
        String t = "contra";
        int actual = solution.numDistinct(s, t);
        int expected = 6;
        assertEquals(expected, actual);
    }

    // TLE
    @Test
    public void Test6() {
        String s = "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeedd"
                + "eaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeae"
                + "dcdebeecdaaedaacadbdccabddaddacdddc";
        String t = "bcddceeeebecbc";
        int actual = solution.numDistinct(s, t);
        int expected = 1;
        assertEquals(expected, actual);
    }

    // TLE
    @Test
    public void Test7() {
        String s = "daacaedaceacabbaabdccdaaeaebacddadcaeaacadbceaecddecd"
                + "eedcebcdacdaebccdeebcbdeaccabcecbeeaadbccbaeccbbdaeade"
                + "cabbbedceaddcdeabbcdaeadcddedddcececbeeabcbecaeadddedd"
                + "ccbdbcdcbceabcacddbbcedebbcaccac";
        String t = "ceadbaa";
        int actual = solution.numDistinct(s, t);
        int expected = 8556153;
        assertEquals(expected, actual);
    }

    // TLE
    @Test
    public void Test8() {
        String s = "xslledayhxhadmctrliaxqpokyezcfhzaskeykchkmhpyjipxtsul"
                + "jkwkovmvelvwxzwieeuqnjozrfwmzsylcwvsthnxujvrkszqwtglew"
                + "kycikdaiocglwzukwovsghkhyidevhbgffoqkpabthmqihcfxxzdej"
                + "letqjoxmwftlxfcxgxgvpperwbqvhxgsbbkmphyomtbjzdjhcrcsgg"
                + "leiczpbfjcgtpycpmrjnckslrwduqlccqmgrdhxolfjafmsrfdghna"
                + "texyanldrdpxvvgujsztuffoymrfteholgonuaqndinadtumnuhkboy"
                + "zaqguwqijwxxszngextfcozpetyownmyneehdwqmtpjloztswmzzdz"
                + "qhuoxrblppqvyvsqhnhryvqsqogpnlqfulurexdtovqpqkfxxnqykg"
                + "scxaskmksivoazlducanrqxynxlgvwonalpsyddqmaemcrrwvrjmjj"
                + "nygyebwtqxehrclwsxzylbqexnxjcgspeynlbmetlkacnnbhmaizba"
                + "dynajpibepbuacggxrqavfnwpcwxbzxfymhjcslghmajrirqzjqxpg"
                + "tgisfjreqrqabssobbadmtmdknmakdigjqyqcruujlwmfoagrckdwy"
                + "iglviyyrekjealvvigiesnvuumxgsveadrxlpwetioxibtdjblowbl"
                + "qvzpbrmhupyrdophjxvhgzclidzybajuxllacyhyphssvhcffxonys"
                + "ahvzhzbttyeeyiefhunbokiqrpqfcoxdxvefugapeevdoakxwzykmh"
                + "bdytjbhigffkmbqmqxsoaiomgmmgwapzdosorcxxhejvgajyzdmzlc"
                + "ntqbapbpofdjtulstuzdrffafedufqwsknumcxbschdybosxkrabyf"
                + "dejgyozwillcxpcaiehlelczioskqtptzaczobvyojdlyflilvwqgy"
                + "rqmjaeepydrcchfyftjighntqzoo"; 
        String t =  "rwmimatmhydhbujebqehjprrwfkoebcxxqfktayaaeheys";
        int actual = solution.numDistinct(s, t);
        int expected = 543744000;
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test9() {
        String s = "abcb";
        String t = "";
        int actual = solution.numDistinct(s, t);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
