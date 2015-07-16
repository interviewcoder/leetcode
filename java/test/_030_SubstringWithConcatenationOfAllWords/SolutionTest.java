package _030_SubstringWithConcatenationOfAllWords;

import static com.leetcode.Test.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _030_SubstringWithConcatenationOfAllWords.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(100);

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
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        List<Integer> actual = solution.findSubstring(s, words);
        // index order does not matter
        List<Integer> expected = Arrays.asList(0, 9);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "ejwwmybnorgshugzmoxopwuvshlcwasclobxmckcvtxfndeztdqiakfusswqsovdfwatanwxgtctyjvsmlcoxijrahivwfybbbudosawnfpmomgczirzscqvlaqhfqkithlhbodptvdhjljltckogcjsdbbktotnxgwyuapnxuwgfirbmdrvgapldsvwgqjfxggtixjhshnzphcemtzsvodygbxpriwqockyavfscvtsewyqpxlnnqnvrkmjtjbjllilinflkbfoxdhocsbpirmcbznuioevcojkdqvoraeqdlhffkwqbjsdkfxstdpxryixrdligpzldgtiqryuasxmxwgtcwsvwasngdwovxzafuixmjrobqbbnhwpdokcpfpxinlfmkfrfqrtzkhabidqszhxorzfypcjcnopzwigmbznmjnpttflsmjifknezrneedvgzfmnhoavxqksjreddpmibbodtbhzfehgluuukupjmbbvshzxyniaowdjamlfssndojyyephstlonsplrettspwepipwcjmfyvfybxiuqtkdlzqedjxxbvdsfurhedneauccrkyjfiptjfxmpxlssrkyldfriuvjranikluqtjjcoiqffdxaukagphzycvjtvwdhhxzagkevvuccxccuoccdkbboymjtimdrmerspxpktsmrwrlkvpnhqrvpdekmtpdfuxzjwpvqjjhfaupylefbvbsbhdncsshmrhxoyuejenqgjheulkxjnqkwvzznriclrbzryfaeuqkfxrbldyusoeoldpbwadhrgijeplijcvqbormrqglgmzsprtmryvkeevlthvflsvognbxfjilwkdndyzwwxgdbeqwlldyezmkopktzugxgkklimhhjqkmuaifnodtpredhqygmedtqpezboimeuyyujfjxkdmbjpizpqltvgknnlodtbhnbhjkmuhwxvzgmkhbcvvadhnssbvneecglnqxhavhvxpkjxlluilzpysjcnwguyofnhfvhaceztoiscumkhociglkvispihvyoatxcxbeqsmluixgsliatukrecgoldmzfhwkgaqzsckonjuhxdhqztjfxstjvikdrhpyjfxbjjryslfpqoiphrwfjqqhaamrjbrsiovrxmqsyxhqmritjeauwqbwtpqcqhvyyssvfknfhxvtodpzipueixdbntdfcaeatyyainfpkclbgaaqrwwzwbcjwiqzkwzfuxfclmsxpdyvfbnwxjytnaejivivriamhgqsskqhnqeurttrfrmstrbeokzhuzvbfmwywohmgogyhzpmsdemugqkspsmoppwbnwabdmiruibwznqcuczculujfiavzwynsyqxmarjkshjhxobandwyzggjibjgzyaaqxorqxbkenscbveqbaociwmqxxyzvyblypeongzrttvwqzmrccwkzidyfbxcaypyquodcpwxkstbthuvjqgialhfmgjohzoxvdaxuywfqrgmyahhtpqtazbphmfoluliznftodyguesshcacrsvutylalqrykehjuofisdookjhrljvedsywrlyccpaowjaqyfaqioesxnlkwgpbznzszyudpwrlgrdgwdyhucztsneqttsuirmjriohhgunzatyfrfzvgvptbgpwajgtysligupoqeoqxoyqtzozufvvlktnvahvsseymtpeyfvxttqosgpplkmxwgmsgtpantazppgnubmpwcdqkvhwfuvcahwibniohiqyywnuzzmxeppokxksrfwrpuzqhjgqryorwboxdauhrkxehiwaputeouwxdfoudcoagcxjcuqvenznxxnprgvhasffxtzaxpcfrcovwgrcwqptoekhmgpoywtxruxokcubekzcrqengviwbtgnzvdzrwwkqvacxwgdhffyvjldgvchoiwnfzoyvkiogisdfyjmfomcazigukqlumyzmnzjzhzfpslwsukykwckvktswjdqxdrlsqvsxwxpqkljeyjpulbswwmuhplfueqnvnhukgjarxlxvwmriqjgmxawmndhsvwnjdjvjtxcsjapfogpesxtpypenunfpjuyoevzztctecilqqbxkaqcyhiobvtqgqruumvvhxolbyzsqcrdchhdqprtkkjsccowrjtyjjmkhleanvfpemuublnnyzfabtxsestncfalqenfcswgerbfcqsapzdtscnzugmwlmidtxkvqhbuaecevwhmwkfqmvpgbefpqpsjmdecmixmmbsjxzwvjdmxydechlraajjmoqpcyoqmrjwoiumuzatydzcnktnkeyztoqvogodxxznhvzduzxudwwqhpftwdspuimioanlzobhjakgajafgzxpqckmhdbbnqmcszpuoqbztnftzgahhxwxbgkilnmzfydyxusnnvngksbjabqjaohdvrniezhmxmkxhemwbbclwdxwgngicplzgajmaryzfkyoqlkrmmfirchzrphveuwmvgaxzbwenvteifxuuefnimnadwxhruvoavlzyhfmeasmgrjawongccgfbgoualiaivbhcgvjjnxpggrewglalthmzvgziobrjeanlvyukwlscexbkibvdjhdgnepdiimmkcxhattwglbkicvsfswocbvphmtpwhcgjbnmxgidtlqcnnwtfujhvgzdussqbwynylzvtjapvqtidpdjkpshvrmqlhindhabubyokzdfrwqvnvgzkyhistydagsgnujiviyijdnabfxqbdqnexvwsvzvcsbrmkbkuzsdehghndyqjodnnblfwmaygdstotfkvxozgwhtbhlkvrzismnozqpfthajafuxekzlgigjpsukjvsdihrjzgovnreqwapdkoqswyclqyvbvpedzyoyedvuuamscbxnqnfmmjyehvidnoimmxmtcinwkbqmcobubjjpshucechrqrffqsyscnqoohcsxenypyqhfklloudgmklcejvgynwouzhtfwuuukdbwpmkjrqxeeaipxrokncholathupdetgaktmvmftqjvzyssocftjwemroghrncynmtchhhcaqxbqpthuaafwgrouaxonzocljeuslzsdwvuoodipdpnlhdihaywzmymxdjrqikughquwtenyucjdgrmipiidiwclhuepgyynoslhzahtdqwliktzsddaahohbszhqxxgripqlwlomjbwtuynydoakejmwkvojuwbfltqjfgxqhwkduzbxpdhtpvrzrfjndmsqfizmqxdxtpbpoemekvxzrrakwjxcxqsdasptruqmjtbaapgmkfnbwnlvzlxwdpzfjryanrmzmpzoefapmnsjdgecrdywsabctaegttffigupnwgakylngrrxurtotxqmzxvsqazajvrwsxyeyjteakeudzjxwbjvagnsjntskmocmpgkybqbnwvrwgoskzqkgffpsyhfmxhymqinrbohxlytsmoeleqrjvievpjipsgdkrqeuglrsjnmvdsihicsgkybcjltcswolpsfxdypmlbjotuxewskisnmczfgreuevnjssjifvlqlhkllifxrxkdbjlhcpegmtrelbosyajljvwwedtxbdccpnmreqaqjrxwulpunagwxesbilalrdniqbzxrbpcvmzpyqklsskpwctgqtrjwhrpisocwderqfiqxsdpkphjsapkvhvsqojyixaechvuoemmyqdlfkuzmlliugckuljfkljoshjhlvvlnywvjswvekfyqhjnsusefdtakejxbejrchoncklguqgnyrcslwztbstmycjziuskegagtlonducdogwbevugppsptdqbajmepmmizaycwcgmjeopbivsyphtvxvvgjbyxpgwpganjiaumojpyhhywosrmnouwpstgbrvhtlqcnmqbygbfnabesvshjmdbhyhirfrkqkmfwdgujhzyjdcbyuijjnkqluaczrnrbbwaeeupnwqzbsazplkyaxqorqsshhlljjlpphhedxdepgfgrqerpuhgmaawhnhqwsgnznrfmxjbdrkwjopylxezxgvetcvrwdewsxdeumhzfrvoilmvksuhyqltuimrnsphqslmgvmmojawwptghonigbdclqtbikiacwpjrbxhmzejozpypfixglatdvuogdoizdtsgsztsfcihtgwyqugeuahpuvvzmgarbsyuutmbxuisdfrvbxzxzhmuektssuktoknkfbmcwwubbnwenybmfqglaceuyqnoadzfenjcjfdlvcpiatuhjdujhaffqsvqvuxchgerokejovrqonxxstibunikiedfyahijobxyhimebctobsjudkqstbcxgixgrhpfiofpwruzvpqyjzvollheoldutddnksutjakhtghpxxnjykxjwgqmsvhnykclexepxqxqzghwfxfdhfmflesfabvanxlrurjtigkjotftqnwyskffpxlragrnfffawqtgyfpmzxfpkdpenxlewyxxgrkmwrmshhzfnorolyfxbvdrspxqnxnuoygkruczddgssygfymdcjgvdxutlrhffhnpyjuxmxefrelxezcgikdliyhvpocvvpkvagvmezrxffujeysplvavtjqjxsgujqsjznxforctwzecxyrkwufpdxadrgzczrnyelfschnagucguuqqqwitviynrypsrdswqxqsegulcwrwsjnihxedfcqychqumiscfkwmqqxunqrfbgqjdwmkyelbldxympctbzfupeocwhkypchuyvhybsbmvymjppfrqmlfrbkpjwpyyytytawuuyjrwxboogfessmltwdcssdqtwomymjskujjtmxiueopwacrwfuqazitvyhvlspvoaeipdsjhgyfjbxhityisidnhlksfznubucqxwaheamndjxmcxwufajmnveuwuoyosqnoqwvtjkwuhkzghvmjhawcfszbhzrbpgsidnbmxxihihnrfbamcyojqpkzodbejtmmipahojoysepzhpljpaugrghgjimtdahnpivdtlcnptnxjyiaafislqavamqgmxtdfoiaakorebqpbbpegawrqymqkewycsdjglkiwaacdqterkixkgraedtqirqmjtvsfhadhafktyrmkzmvidxmisfskvevpcnujqxrqedleuyowkjgphsxzzqlvujkwwgiodbfjesnbsbzcnftuzrvzjjudsgcqmmfpnmyrenuxotbbyvxyovzxgtcyzgqnsvcfhczoptnfnojnlinbfmylhdlijcvcxzjhdixuckaralemvsnbgooorayceuedtomzyjtctvtwgyiesxhynvogxnjdjphcftbefxgasawzagfugmuthjahylkhatlgpnkuksuesrduxkodwjzgubpsmzzmvkskzeglxaqrrvmrgcwcnvkhwzbibaxwnriowoavosminabvfxastkcrkdclgzjvqrjofjjvbyfragofeoazzeqljuypthkmywaffmcjkickqqsuhsviyovhitxeajqahshpejaqtcdkuvgdpclnsguabtgbfwdmrmbvydorfrbcokfdmtsgboidkpgpnmdeyhawkqqshtwxdbarwuxykgduxjlkxppwyruihkcqgynjcpbylayvgdqfpbqmshksyfbhrfxxemhgbkgmkhjtkzyzdqmxxwqvdtevyducpdksntgyaqtkrrkwiyuhukfadjvdnrievszilfinxbyrvknfihmetreydbcstkwoexwsfhfekfvfplmxszcosgovisnbemrjlndqwkvhqsofdbdychmupcsxvhazvrihhnxfyumonbvqeyoghccxfuwacxzxqkezxefxarnnujgyjugrzjoefmghjfhcrnbrtgouaehwnnxwkdplodpuqxdbemfwahptpfppjzowoltyqijfoabgzejerpatwponuefgdtcrgxswiddygeeflpjeelzccnsztxfyqhqyhkuppapvgvdtkmxraytcolbhkiiasaazkvqzvfxbaaxkoudovxrjkusxdazxaawmvoostlvvnsfbpjqkijvudpriqrfsrdfortimgdhtypunakzituezjyhbrpuksbamuiycngvlvpyvczfxvlwhjgicvempfobbwadkiavdswyuxdttoqaaykctprkwfmyeodowglzyjzuhencufcwdobydslazxadnftllhmjslfbrtdlahkgwlebdpdeofidldoymakfnpgekmsltcrrnxvspywfggjrmxryybdltmsfykstmlnzjitaipfoyohkmzimcozxardydxtpjgquoluzbznzqvlewtqyhryjldjoadgjlyfckzbnbootlzxhupieggntjxilcqxnocpyesnhjbauaxcvmkzusmodlyonoldequfunsbwudquaurogsiyhydswsimflrvfwruouskxjfzfynmrymyyqsvkajpnanvyepnzixyteyafnmwnbwmtojdpsucthxtopgpxgnsmnsrdhpskledapiricvdmtwaifrhnebzuttzckroywranbrvgmashxurelyrrbslxnmzyeowchwpjplrdnjlkfcoqdhheavbnhdlltjpahflwscafnnsspikuqszqpcdyfrkaabdigogatgiitadlinfyhgowjuvqlhrniuvrketfmboibttkgakohbmsvhigqztbvrsgxlnjndrqwmcdnntwofojpyrhamivfcdcotodwhvtuyyjlthbaxmrvfzxrhvzkydartfqbalxyjilepmemawjfxhzecyqcdswxxmaaxxyifmouauibstgpcfwgfmjlfhketkeshfcorqirmssfnbuqiqwqfhbmol";
        String[] words = { "toiscumkhociglkvispihvyoatxcx",
                "ndojyyephstlonsplrettspwepipw",
                "yzfkyoqlkrmmfirchzrphveuwmvga",
                "mxxihihnrfbamcyojqpkzodbejtmm",
                "fenjcjfdlvcpiatuhjdujhaffqsvq",
                "ehghndyqjodnnblfwmaygdstotfkv",
                "heoldutddnksutjakhtghpxxnjykx",
                "cvrwdewsxdeumhzfrvoilmvksuhyq",
                "ftqjvzyssocftjwemroghrncynmtc",
                "idiwclhuepgyynoslhzahtdqwlikt",
                "eurttrfrmstrbeokzhuzvbfmwywoh",
                "jxlluilzpysjcnwguyofnhfvhacez",
                "uskegagtlonducdogwbevugppsptd",
                "xmcxwufajmnveuwuoyosqnoqwvtjk",
                "wolpsfxdypmlbjotuxewskisnmczf",
                "fjryanrmzmpzoefapmnsjdgecrdyw",
                "jgmxawmndhsvwnjdjvjtxcsjapfog",
                "wuhkzghvmjhawcfszbhzrbpgsidnb",
                "yelbldxympctbzfupeocwhkypchuy",
                "vzduzxudwwqhpftwdspuimioanlzo",
                "bdpdeofidldoymakfnpgekmsltcrr",
                "fmyeodowglzyjzuhencufcwdobyds",
                "dhtypunakzituezjyhbrpuksbamui",
                "bdmiruibwznqcuczculujfiavzwyn",
                "eudzjxwbjvagnsjntskmocmpgkybq",
                "tuynydoakejmwkvojuwbfltqjfgxq",
                "psrdswqxqsegulcwrwsjnihxedfcq",
                "cokfdmtsgboidkpgpnmdeyhawkqqs",
                "fujhvgzdussqbwynylzvtjapvqtid",
                "rqeuglrsjnmvdsihicsgkybcjltcs",
                "vhybsbmvymjppfrqmlfrbkpjwpyyy",
                "aukagphzycvjtvwdhhxzagkevvucc",
                "hwkduzbxpdhtpvrzrfjndmsqfizmq",
                "ywnuzzmxeppokxksrfwrpuzqhjgqr",
                "qbajmepmmizaycwcgmjeopbivsyph",
                "uamscbxnqnfmmjyehvidnoimmxmtc",
                "nxvspywfggjrmxryybdltmsfykstm",
                "amrjbrsiovrxmqsyxhqmritjeauwq",
                "yorwboxdauhrkxehiwaputeouwxdf",
                "qkewycsdjglkiwaacdqterkixkgra",
                "ycngvlvpyvczfxvlwhjgicvempfob",
                "jgphsxzzqlvujkwwgiodbfjesnbsb",
                "mkxhemwbbclwdxwgngicplzgajmar",
                "mryvkeevlthvflsvognbxfjilwkdn",
                "mezrxffujeysplvavtjqjxsgujqsj",
                "rtotxqmzxvsqazajvrwsxyeyjteak",
                "sabctaegttffigupnwgakylngrrxu",
                "xccuoccdkbboymjtimdrmerspxpkt",
                "xusnnvngksbjabqjaohdvrniezhmx",
                "oyuejenqgjheulkxjnqkwvzznricl",
                "mxszcosgovisnbemrjlndqwkvhqso",
                "wsgnznrfmxjbdrkwjopylxezxgvet",
                "dxmisfskvevpcnujqxrqedleuyowk",
                "dhrgijeplijcvqbormrqglgmzsprt",
                "vuxchgerokejovrqonxxstibuniki",
                "lumyzmnzjzhzfpslwsukykwckvkts",
                "inwkbqmcobubjjpshucechrqrffqs",
                "ywtxruxokcubekzcrqengviwbtgnz",
                "ccpnmreqaqjrxwulpunagwxesbila",
                "pesxtpypenunfpjuyoevzztctecil",
                "sygfymdcjgvdxutlrhffhnpyjuxmx",
                "uisdfrvbxzxzhmuektssuktoknkfb",
                "cejvgynwouzhtfwuuukdbwpmkjrqx",
                "oudcoagcxjcuqvenznxxnprgvhasf",
                "sxnlkwgpbznzszyudpwrlgrdgwdyh",
                "qqbxkaqcyhiobvtqgqruumvvhxolb",
                "mkhleanvfpemuublnnyzfabtxsest",
                "bibaxwnriowoavosminabvfxastkc",
                "bcxgixgrhpfiofpwruzvpqyjzvoll",
                "lzccnsztxfyqhqyhkuppapvgvdtkm",
                "pdjkpshvrmqlhindhabubyokzdfrw",
                "qbbnhwpdokcpfpxinlfmkfrfqrtzk",
                "rnyelfschnagucguuqqqwitviynry",
                "qtrjwhrpisocwderqfiqxsdpkphjs",
                "vxttqosgpplkmxwgmsgtpantazppg",
                "tyisidnhlksfznubucqxwaheamndj",
                "kgaqzsckonjuhxdhqztjfxstjvikd",
                "jeuslzsdwvuoodipdpnlhdihaywzm",
                "vdzrwwkqvacxwgdhffyvjldgvchoi",
                "cftbefxgasawzagfugmuthjahylkh",
                "xraytcolbhkiiasaazkvqzvfxbaax",
                "oyqtzozufvvlktnvahvsseymtpeyf",
                "rnnujgyjugrzjoefmghjfhcrnbrtg",
                "rfzvgvptbgpwajgtysligupoqeoqx",
                "igbdclqtbikiacwpjrbxhmzejozpy",
                "dyzwwxgdbeqwlldyezmkopktzugxg",
                "hmetreydbcstkwoexwsfhfekfvfpl",
                "zcnftuzrvzjjudsgcqmmfpnmyrenu",
                "zzmvkskzeglxaqrrvmrgcwcnvkhwz",
                "vjswvekfyqhjnsusefdtakejxbejr",
                "rwwzwbcjwiqzkwzfuxfclmsxpdyvf",
                "fdbdychmupcsxvhazvrihhnxfyumo",
                "vdtevyducpdksntgyaqtkrrkwiyuh",
                "nbvqeyoghccxfuwacxzxqkezxefxa",
                "vpgbefpqpsjmdecmixmmbsjxzwvjd",
                "jwgqmsvhnykclexepxqxqzghwfxfd",
                "olyfxbvdrspxqnxnuoygkruczddgs",
                "qgmxtdfoiaakorebqpbbpegawrqym",
                "liaivbhcgvjjnxpggrewglalthmzv",
                "choncklguqgnyrcslwztbstmycjzi",
                "fpkdpenxlewyxxgrkmwrmshhzfnor",
                "hhhcaqxbqpthuaafwgrouaxonzocl",
                "ipahojoysepzhpljpaugrghgjimtd",
                "wosrmnouwpstgbrvhtlqcnmqbygbf",
                "nwyskffpxlragrnfffawqtgyfpmzx",
                "bcvvadhnssbvneecglnqxhavhvxpk",
                "hoavxqksjreddpmibbodtbhzfehgl",
                "lazxadnftllhmjslfbrtdlahkgwle",
                "uuukupjmbbvshzxyniaowdjamlfss",
                "tpqtazbphmfoluliznftodyguessh",
                "ychqumiscfkwmqqxunqrfbgqjdwmk",
                "rkdclgzjvqrjofjjvbyfragofeoaz",
                "pphhedxdepgfgrqerpuhgmaawhnhq",
                "cacrsvutylalqrykehjuofisdookj",
                "kyldfriuvjranikluqtjjcoiqffdx",
                "bnwvrwgoskzqkgffpsyhfmxhymqin",
                "uzmlliugckuljfkljoshjhlvvlnyw",
                "abfxqbdqnexvwsvzvcsbrmkbkuzsd",
                "xotbbyvxyovzxgtcyzgqnsvcfhczo",
                "bwtpqcqhvyyssvfknfhxvtodpzipu",
                "nsfbpjqkijvudpriqrfsrdfortimg",
                "tgwyqugeuahpuvvzmgarbsyuutmbx",
                "upnwqzbsazplkyaxqorqsshhlljjl",
                "edfyahijobxyhimebctobsjudkqst",
                "ialhfmgjohzoxvdaxuywfqrgmyahh",
                "jlhcpegmtrelbosyajljvwwedtxbd",
                "tpfppjzowoltyqijfoabgzejerpat",
                "mgogyhzpmsdemugqkspsmoppwbnwa",
                "nubmpwcdqkvhwfuvcahwibniohiqy",
                "ukfadjvdnrievszilfinxbyrvknfi",
                "dgnepdiimmkcxhattwglbkicvsfsw",
                "syqxmarjkshjhxobandwyzggjibjg",
                "bnwxjytnaejivivriamhgqsskqhnq",
                "hzyjdcbyuijjnkqluaczrnrbbwaee",
                "yscnqoohcsxenypyqhfklloudgmkl",
                "habidqszhxorzfypcjcnopzwigmbz",
                "wjdqxdrlsqvsxwxpqkljeyjpulbsw",
                "tytawuuyjrwxboogfessmltwdcssd",
                "pfixglatdvuogdoizdtsgsztsfcih",
                "apkvhvsqojyixaechvuoemmyqdlfk",
                "ouaehwnnxwkdplodpuqxdbemfwahp",
                "ixuckaralemvsnbgooorayceuedto",
                "ymxdjrqikughquwtenyucjdgrmipi",
                "smrwrlkvpnhqrvpdekmtpdfuxzjwp",
                "bhjakgajafgzxpqckmhdbbnqmcszp",
                "beqsmluixgsliatukrecgoldmzfhw",
                "greuevnjssjifvlqlhkllifxrxkdb",
                "yzsqcrdchhdqprtkkjsccowrjtyjj",
                "sviyovhitxeajqahshpejaqtcdkuv",
                "qtwomymjskujjtmxiueopwacrwfuq",
                "mzyjtctvtwgyiesxhynvogxnjdjph",
                "dyfbxcaypyquodcpwxkstbthuvjqg",
                "hfmflesfabvanxlrurjtigkjotftq",
                "mxydechlraajjmoqpcyoqmrjwoium",
                "nabesvshjmdbhyhirfrkqkmfwdguj",
                "bhrfxxemhgbkgmkhjtkzyzdqmxxwq",
                "gziobrjeanlvyukwlscexbkibvdjh",
                "mcwwubbnwenybmfqglaceuyqnoadz",
                "xyzvyblypeongzrttvwqzmrccwkzi",
                "ncfalqenfcswgerbfcqsapzdtscnz",
                "dtqpezboimeuyyujfjxkdmbjpizpq",
                "wmuhplfueqnvnhukgjarxlxvwmriq",
                "qwapdkoqswyclqyvbvpedzyoyedvu",
                "uoqbztnftzgahhxwxbgkilnmzfydy",
                "zsddaahohbszhqxxgripqlwlomjbw",
                "bwadkiavdswyuxdttoqaaykctprkw",
                "eixdbntdfcaeatyyainfpkclbgaaq",
                "nmjnpttflsmjifknezrneedvgzfmn",
                "avlzyhfmeasmgrjawongccgfbgoua",
                "kklimhhjqkmuaifnodtpredhqygme",
                "xzbwenvteifxuuefnimnadwxhruvo",
                "ugmwlmidtxkvqhbuaecevwhmwkfqm",
                "rhpyjfxbjjryslfpqoiphrwfjqqha",
                "eeaipxrokncholathupdetgaktmvm",
                "ltuimrnsphqslmgvmmojawwptghon",
                "azitvyhvlspvoaeipdsjhgyfjbxhi",
                "efrelxezcgikdliyhvpocvvpkvagv",
                "znxforctwzecxyrkwufpdxadrgzcz",
                "kcqgynjcpbylayvgdqfpbqmshksyf",
                "hrljvedsywrlyccpaowjaqyfaqioe",
                "cjmfyvfybxiuqtkdlzqedjxxbvdsf",
                "zeqljuypthkmywaffmcjkickqqsuh",
                "wnfzoyvkiogisdfyjmfomcazigukq",
                "zyaaqxorqxbkenscbveqbaociwmqx",
                "ahnpivdtlcnptnxjyiaafislqavam",
                "edtqirqmjtvsfhadhafktyrmkzmvi",
                "wponuefgdtcrgxswiddygeeflpjee",
                "xozgwhtbhlkvrzismnozqpfthajaf",
                "ptnfnojnlinbfmylhdlijcvcxzjhd",
                "uxekzlgigjpsukjvsdihrjzgovnre",
                "rbohxlytsmoeleqrjvievpjipsgdk",
                "fxtzaxpcfrcovwgrcwqptoekhmgpo",
                "tvxvvgjbyxpgwpganjiaumojpyhhy",
                "vqjjhfaupylefbvbsbhdncsshmrhx",
                "urhedneauccrkyjfiptjfxmpxlssr",
                "ltvgknnlodtbhnbhjkmuhwxvzgmkh",
                "ucztsneqttsuirmjriohhgunzatyf",
                "rbzryfaeuqkfxrbldyusoeoldpbwa",
                "atlgpnkuksuesrduxkodwjzgubpsm",
                "lrdniqbzxrbpcvmzpyqklsskpwctg",
                "qvnvgzkyhistydagsgnujiviyijdn",
                "uzatydzcnktnkeyztoqvogodxxznh",
                "ocbvphmtpwhcgjbnmxgidtlqcnnwt",
                "koudovxrjkusxdazxaawmvoostlvv",
                "ptruqmjtbaapgmkfnbwnlvzlxwdpz",
                "xdxtpbpoemekvxzrrakwjxcxqsdas",
                "gdpclnsguabtgbfwdmrmbvydorfrb",
                "htwxdbarwuxykgduxjlkxppwyruih" };

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = Arrays.asList(373);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "a";
        String[] words = { "a" };

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = Arrays.asList(0);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "aaaaa";
        String[] words = { "aa" };

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "";
        String[] words = { "aa" };

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = new ArrayList<Integer>();
        assertEqualsIgnoreOrder(expected, actual);
    }


    @Test
    public void Test6() {
        String s = "aaa";
        String[] words = {};

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = new ArrayList<Integer>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test7() {
        String s = "cabba";
        String[] words = {"a", "b"};

        List<Integer> actual = solution.findSubstring(s, words);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 1));
        assertEqualsIgnoreOrder(expected, actual);
    }

}
