package _126_WordLadderII;

import static com.leetcode.Test.assertEqualsIgnoreOrder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PracticeTest {

    /** Test method for {@link _126_WordLadderII.Practice } */
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
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        List<List<String>> actual = solution.findLadders(start, end, dict);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        expected.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String start = "hit";
        String end = "hit";
        Set<String> dict = new HashSet<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        List<List<String>> actual = solution.findLadders(start, end, dict);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("hit", "hit"));
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String start = "a";
        String end = "c";
        Set<String> dict = new HashSet<>();
        dict.add("a");
        dict.add("b");
        List<List<String>> actual = solution.findLadders(start, end, dict);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a", "c"));
        assertEqualsIgnoreOrder(expected, actual);
    }

//    @Test
//    public void Test4() {
//        String start = "red";
//        String end = "tax";
//        Set<String> dict = new HashSet<>();
//        dict.add("ted");
//        dict.add("tex");
//        dict.add("red");
//        dict.add("tax");
//        dict.add("tad");
//        dict.add("den");
//        dict.add("rex");
//        dict.add("pee");
//        List<List<String>> actual = solution.findLadders(start, end, dict);
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("red", "ted", "tad", "tax"));
//        expected.add(Arrays.asList("red", "ted", "tex", "tax"));
//        expected.add(Arrays.asList("red", "rex", "tex", "tax"));
//        assertEqualsIgnoreOrder(expected, actual);
//    }
//
//    @Test
//    public void Test5() {
//        String start = "hot";
//        String end = "dog";
//        Set<String> dict = new HashSet<>();
//        dict.add("hot");
//        dict.add("cog");
//        dict.add("dog");
//        dict.add("tot");
//        dict.add("hog");
//        dict.add("hop");
//        dict.add("pot");
//        dict.add("dot");
//        List<List<String>> actual = solution.findLadders(start, end, dict);
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("hot", "dot", "dog"));
//        expected.add(Arrays.asList("hot", "hog", "dog"));
//        assertEqualsIgnoreOrder(expected, actual);
//    }
//
//    @Test
//    public void Test6() {
//        String beginWord = "nape";
//        String endWord = "mild";
//        String[] strs = { "dose", "ends", "dine", "jars", "prow", "soap",
//                "guns", "hops", "cray", "hove", "ella", "hour", "lens", "jive",
//                "wiry", "earl", "mara", "part", "flue", "putt", "rory", "bull",
//                "york", "ruts", "lily", "vamp", "bask", "peer", "boat", "dens",
//                "lyre", "jets", "wide", "rile", "boos", "down", "path", "onyx",
//                "mows", "toke", "soto", "dork", "nape", "mans", "loin", "jots",
//                "male", "sits", "minn", "sale", "pets", "hugo", "woke", "suds",
//                "rugs", "vole", "warp", "mite", "pews", "lips", "pals", "nigh",
//                "sulk", "vice", "clod", "iowa", "gibe", "shad", "carl", "huns",
//                "coot", "sera", "mils", "rose", "orly", "ford", "void", "time",
//                "eloy", "risk", "veep", "reps", "dolt", "hens", "tray", "melt",
//                "rung", "rich", "saga", "lust", "yews", "rode", "many", "cods",
//                "rape", "last", "tile", "nosy", "take", "nope", "toni", "bank",
//                "jock", "jody", "diss", "nips", "bake", "lima", "wore", "kins",
//                "cult", "hart", "wuss", "tale", "sing", "lake", "bogy", "wigs",
//                "kari", "magi", "bass", "pent", "tost", "fops", "bags", "duns",
//                "will", "tart", "drug", "gale", "mold", "disk", "spay", "hows",
//                "naps", "puss", "gina", "kara", "zorn", "boll", "cams", "boas",
//                "rave", "sets", "lego", "hays", "judy", "chap", "live", "bahs",
//                "ohio", "nibs", "cuts", "pups", "data", "kate", "rump", "hews",
//                "mary", "stow", "fang", "bolt", "rues", "mesh", "mice", "rise",
//                "rant", "dune", "jell", "laws", "jove", "bode", "sung", "nils",
//                "vila", "mode", "hued", "cell", "fies", "swat", "wags", "nate",
//                "wist", "honk", "goth", "told", "oise", "wail", "tels", "sore",
//                "hunk", "mate", "luke", "tore", "bond", "bast", "vows", "ripe",
//                "fond", "benz", "firs", "zeds", "wary", "baas", "wins", "pair",
//                "tags", "cost", "woes", "buns", "lend", "bops", "code", "eddy",
//                "siva", "oops", "toed", "bale", "hutu", "jolt", "rife", "darn",
//                "tape", "bold", "cope", "cake", "wisp", "vats", "wave", "hems",
//                "bill", "cord", "pert", "type", "kroc", "ucla", "albs", "yoko",
//                "silt", "pock", "drub", "puny", "fads", "mull", "pray", "mole",
//                "talc", "east", "slay", "jamb", "mill", "dung", "jack", "lynx",
//                "nome", "leos", "lade", "sana", "tike", "cali", "toge", "pled",
//                "mile", "mass", "leon", "sloe", "lube", "kans", "cory", "burs",
//                "race", "toss", "mild", "tops", "maze", "city", "sadr", "bays",
//                "poet", "volt", "laze", "gold", "zuni", "shea", "gags", "fist",
//                "ping", "pope", "cora", "yaks", "cosy", "foci", "plan", "colo",
//                "hume", "yowl", "craw", "pied", "toga", "lobs", "love", "lode",
//                "duds", "bled", "juts", "gabs", "fink", "rock", "pant", "wipe",
//                "pele", "suez", "nina", "ring", "okra", "warm", "lyle", "gape",
//                "bead", "lead", "jane", "oink", "ware", "zibo", "inns", "mope",
//                "hang", "made", "fobs", "gamy", "fort", "peak", "gill", "dino",
//                "dina", "tier" };
//        Set<String> dict = new HashSet<>();
//        for (String word : strs) {
//            dict.add(word);
//        }
//        List<List<String>> actual = solution.findLadders(beginWord, endWord,
//                dict);
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("nape", "tape", "tale", "male", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "nope", "mope", "mole", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "rape", "ripe", "rile", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "tape", "tale", "tile", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "gape", "gale", "male", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "nate", "mate", "male", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "nate", "mate", "mite", "mile",
//                "mild"));
//        expected.add(Arrays.asList("nape", "nope", "mope", "mole", "mold",
//                "mild"));
//        expected.add(Arrays.asList("nape", "naps", "nips", "nils", "mils",
//                "mild"));
//        assertEqualsIgnoreOrder(expected, actual);
//    }
//
//    @Test
//    public void Test7() {
//        String beginWord = "zings";
//        String endWord = "brown";
//        String[] strs = { "chump", "sours", "mcgee", "piers", "match", "folds",
//                "rinse", "films", "small", "umbel", "assad", "morin", "plied",
//                "basin", "moots", "blurb", "suits", "solve", "sooty", "fluky",
//                "bombs", "nurse", "ceres", "lopes", "yucky", "ricks", "goads",
//                "loses", "coyly", "marcy", "bonds", "niece", "cures", "sonic",
//                "crows", "dicey", "gaped", "buggy", "riles", "homer", "fakir",
//                "hello", "riper", "makes", "laked", "sinus", "fangs", "acton",
//                "spiky", "salts", "boots", "skiff", "maker", "pence", "fells",
//                "cedar", "kited", "raved", "flake", "jiffy", "tanks", "barns",
//                "sized", "gluts", "amman", "jumps", "cavil", "quaff", "rents",
//                "looms", "toner", "gibes", "aside", "drawn", "karin", "torte",
//                "haded", "psych", "hacks", "jesus", "fumed", "lisle", "spays",
//                "sumps", "beats", "tunas", "naked", "bathe", "gulfs", "karma",
//                "snuff", "boast", "grins", "turds", "plant", "spicy", "risen",
//                "tints", "tomas", "stand", "noses", "toxin", "sheep", "paddy",
//                "abase", "jeeps", "dated", "tough", "timid", "forty", "kusch",
//                "pones", "smack", "token", "havel", "vanes", "repay", "chums",
//                "paved", "chimp", "spinx", "smirk", "pupas", "bares", "mites",
//                "egged", "palsy", "gyros", "wolfe", "chips", "pouts", "johns",
//                "barbs", "slunk", "hires", "seals", "rally", "tromp", "roads",
//                "writs", "aches", "corny", "fiats", "hench", "gilts", "blake",
//                "phony", "drams", "skimp", "suing", "horus", "hewer", "barfs",
//                "hewed", "needs", "epsom", "knots", "tided", "befit", "eager",
//                "melva", "coves", "plush", "pawed", "zebra", "gales", "blots",
//                "foggy", "rooks", "comas", "laxly", "cries", "kirks", "monks",
//                "magic", "fugue", "apter", "limos", "congo", "rosin", "seder",
//                "bones", "holes", "fated", "gamay", "snags", "wimpy", "rites",
//                "gilds", "slink", "staph", "sioux", "bends", "wilma", "warts",
//                "reeds", "yolks", "lover", "demon", "salve", "hulas", "shard",
//                "worst", "leach", "omits", "flint", "tines", "julio", "trots",
//                "silly", "cocks", "gleam", "react", "camps", "nicks", "bored",
//                "coded", "swine", "scope", "aloes", "south", "hands", "rainy",
//                "david", "newer", "ferns", "jelly", "index", "gibbs", "truly",
//                "tubes", "opera", "raven", "noyce", "whims", "titus", "hared",
//                "vined", "dealt", "slats", "erick", "rolls", "breed", "udder",
//                "oozed", "prays", "tsars", "harry", "shelf", "norms", "larks",
//                "hazes", "brice", "gifts", "units", "veeps", "dumas", "mommy",
//                "spock", "dotty", "molls", "slobs", "diane", "buddy", "boost",
//                "ginny", "rends", "marks", "timur", "bands", "genes", "slews",
//                "leeds", "karyn", "mobil", "mixes", "ronny", "sadly", "rinks",
//                "smash", "baled", "pulpy", "toils", "yards", "piing", "dried",
//                "veils", "spook", "snaky", "sizer", "spout", "percy", "sheol",
//                "blank", "waxes", "herod", "attar", "doped", "polls", "banes",
//                "penny", "knelt", "laded", "manic", "acids", "squat", "jerry",
//                "stony", "woofs", "idles", "bruin", "carla", "sheik", "hodge",
//                "goody", "merge", "nicer", "scums", "evens", "lames", "wends",
//                "midge", "jives", "tuner", "reins", "boars", "fryer", "realm",
//                "dyson", "narks", "torts", "yawed", "waked", "cress", "curvy",
//                "bongs", "fared", "jilts", "liens", "ducat", "shaft", "pesos",
//                "dulls", "donna", "potty", "winks", "marsh", "giddy", "tiffs",
//                "scoot", "nifty", "daisy", "slots", "stacy", "colby", "skims",
//                "malls", "sifts", "jinns", "flank", "molar", "hatch", "wiped",
//                "taped", "clink", "brims", "credo", "fezes", "molds", "finds",
//                "quids", "terra", "damns", "dusky", "wanes", "musty", "barer",
//                "snare", "honey", "piked", "wiser", "elvin", "dolly", "fetal",
//                "ships", "reign", "cause", "caved", "mecca", "blink", "close",
//                "birth", "pints", "reefs", "amado", "comae", "waite", "willy",
//                "lorry", "nixed", "quire", "napes", "voted", "eldon", "nappy",
//                "myles", "laser", "pesky", "leant", "septa", "mucks", "agree",
//                "sworn", "lofty", "slush", "holst", "tevet", "wases", "cheer",
//                "torah", "treks", "purge", "class", "popes", "roans", "curve",
//                "quads", "magma", "drier", "hales", "chess", "prigs", "sivan",
//                "romes", "finch", "peels", "mousy", "atria", "offer", "coals",
//                "crash", "tauts", "oinks", "dazed", "flaps", "truck", "treed",
//                "colas", "petty", "marty", "cadet", "clips", "zones", "wooed",
//                "haves", "grays", "gongs", "minis", "macaw", "horde", "witch",
//                "flows", "heady", "fuels", "conks", "lifts", "tumid", "husks",
//                "irony", "pines", "glops", "fonds", "covey", "chino", "riggs",
//                "tonya", "slavs", "caddy", "poled", "blent", "mired", "whose",
//                "scows", "forte", "hikes", "riped", "knobs", "wroth", "bagel",
//                "basks", "nines", "scams", "males", "holed", "solid", "farms",
//                "glaxo", "poise", "drays", "ryder", "slash", "rajas", "goons",
//                "bowed", "shirt", "blurs", "fussy", "rills", "loren", "helps",
//                "feels", "fiefs", "hines", "balms", "blobs", "fiord", "light",
//                "dinky", "maids", "sagas", "joked", "pyxed", "lilly", "leers",
//                "galls", "malts", "minos", "ionic", "lower", "peale", "ratty",
//                "tuber", "newed", "whirl", "eases", "wests", "herds", "clods",
//                "floes", "skate", "weeds", "tones", "rangy", "kings", "adder",
//                "pitts", "smith", "coats", "lenny", "sorta", "floss", "looks",
//                "angie", "peppy", "upper", "darin", "white", "lofts", "clint",
//                "jared", "heros", "ruler", "tonia", "sexed", "grail", "villa",
//                "topic", "kenny", "dopes", "hoots", "boobs", "gerry", "eries",
//                "lyres", "lunch", "glove", "cumin", "harms", "races", "today",
//                "crust", "track", "mends", "snout", "shark", "iliad", "shrew",
//                "dorky", "monty", "dodge", "toted", "worse", "dream", "weird",
//                "gaunt", "damon", "rimes", "layer", "salem", "bards", "dills",
//                "hobby", "gives", "shall", "crazy", "brace", "faxed", "pools",
//                "foamy", "viral", "strop", "liver", "ceded", "jolts", "jonah",
//                "tight", "lilia", "hussy", "mutts", "crate", "girls", "marge",
//                "hypos", "mewls", "bulls", "gazes", "wands", "avior", "sonya",
//                "slick", "clump", "cater", "aural", "agave", "grief", "shana",
//                "fices", "moans", "grape", "fetid", "jenna", "humus", "poesy",
//                "cooks", "still", "lease", "wanda", "oddly", "areas", "frats",
//                "imply", "files", "ramon", "seuss", "hubby", "wakes", "rural",
//                "nodal", "doric", "carry", "chefs", "fails", "klaus", "shine",
//                "filly", "yawls", "brows", "cabby", "favor", "styli", "filed",
//                "jinni", "ferry", "balls", "lakes", "voled", "drone", "lusty",
//                "tansy", "among", "trail", "liven", "slake", "madge", "steps",
//                "donne", "sties", "picks", "lacks", "jumpy", "meade", "bogie",
//                "bauer", "scene", "lubes", "brigs", "label", "fines", "grebe",
//                "limns", "mouse", "ensue", "swags", "bunch", "kayla", "micky",
//                "sneak", "bulbs", "camus", "yours", "aisha", "dunne", "volta",
//                "cores", "dweeb", "libby", "flees", "shops", "bided", "satan",
//                "socks", "draws", "golfs", "taunt", "genus", "belts", "orbit",
//                "taxis", "hinds", "fakes", "chart", "wings", "words", "digit",
//                "copse", "deena", "perry", "sanes", "huffy", "chung", "lucks",
//                "fills", "selma", "wafts", "pecks", "trite", "combs", "sooth",
//                "weary", "salty", "brews", "kooky", "robby", "loans", "props",
//                "huang", "marry", "swabs", "tinny", "mince", "japed", "ellis",
//                "lowed", "newly", "loath", "drown", "loved", "joker", "lints",
//                "kinky", "skits", "feats", "hiker", "doles", "every", "dolby",
//                "stirs", "lobed", "fusty", "cozen", "vader", "byron", "dozes",
//                "slows", "bethe", "ploys", "misty", "binds", "bumpy", "spurs",
//                "wolfs", "ernie", "nails", "prows", "seeds", "visas", "dowse",
//                "pores", "jocks", "cower", "hoofs", "mined", "marat", "gorge",
//                "souse", "clack", "liter", "jewel", "hates", "boats", "stark",
//                "blabs", "murks", "woken", "stomp", "peeks", "perky", "pasta",
//                "goats", "hocks", "kinks", "gushy", "outdo", "gelds", "foxes",
//                "fives", "sybil", "upton", "taine", "helga", "mauls", "gills",
//                "grows", "bauds", "aloft", "cline", "payer", "pinch", "thorn",
//                "slits", "thumb", "biked", "cowls", "grams", "disks", "belly",
//                "randy", "hunts", "prize", "minty", "river", "chevy", "gages",
//                "cysts", "years", "scoff", "becky", "inert", "abler", "bevel",
//                "dyers", "tonne", "glows", "ocean", "spits", "bowen", "tings",
//                "baths", "goals", "whiny", "merry", "fares", "leila", "cairo",
//                "honor", "verge", "teary", "pimps", "sarah", "meets", "tamed",
//                "bumps", "alias", "pings", "wears", "dante", "snore", "ruled",
//                "savor", "gapes", "loony", "chaps", "froth", "fancy", "herbs",
//                "cutes", "crowd", "ghana", "teddy", "abate", "scalp", "mules",
//                "patsy", "minks", "shuck", "billy", "helen", "stain", "moles",
//                "jodie", "homed", "stack", "niger", "denny", "kinds", "elves",
//                "waled", "rover", "medan", "churn", "whizz", "green", "reach",
//                "lajos", "mates", "ditch", "grads", "start", "press", "rimed",
//                "hells", "vised", "slums", "notes", "canes", "taper", "camry",
//                "weans", "sinks", "arise", "crown", "prier", "ramps", "wotan",
//                "chars", "mussy", "rodes", "sonar", "cheri", "sired", "snell",
//                "basel", "eider", "sades", "times", "ovule", "gusto", "myrna",
//                "gabby", "dully", "spake", "beast", "towns", "allay", "gaged",
//                "smell", "skids", "clone", "slack", "pooch", "vulva", "arson",
//                "blown", "kongo", "maize", "thick", "brags", "spore", "soles",
//                "trial", "snort", "price", "bowel", "stoke", "pents", "hutch",
//                "flack", "arced", "cubic", "hiram", "tongs", "lades", "coons",
//                "finer", "games", "unpin", "vests", "slabs", "santa", "tamer",
//                "asian", "tease", "miked", "lodes", "vents", "leafy", "stats",
//                "shuts", "bully", "edith", "bloch", "corps", "bloom", "doses",
//                "coins", "skips", "gains", "hided", "coops", "ninja", "pills",
//                "raves", "hanks", "seres", "ewing", "bests", "wrath", "burgs",
//                "thrum", "cabin", "daren", "imams", "junks", "brood", "bacon",
//                "creel", "gazed", "teats", "halos", "gypsy", "ether", "train",
//                "tiles", "bulks", "bolls", "added", "roger", "sites", "balmy",
//                "tilts", "swoop", "jules", "bawdy", "mango", "stoop", "girts",
//                "costs", "lemur", "yucks", "swazi", "okays", "piped", "ticks",
//                "tomes", "filch", "depth", "meals", "coots", "bites", "pansy",
//                "spelt", "leeks", "hills", "drops", "verde", "japes", "holds",
//                "bangs", "maxed", "plume", "frets", "lymph", "modes", "twits",
//                "devon", "cawed", "putty", "sowed", "likes", "quips", "board",
//                "loxed", "slags", "dilly", "refit", "saved", "takes", "meter",
//                "prove", "spacy", "poach", "cilia", "pears", "lists", "gated",
//                "verdi", "shave", "notch", "culls", "shams", "weedy", "gaols",
//                "hoops", "kraft", "burro", "roles", "rummy", "click", "plots",
//                "mitty", "yanks", "drool", "papal", "rearm", "prose", "fucks",
//                "berra", "salas", "tents", "flues", "loves", "poker", "parry",
//                "polyp", "agent", "flown", "walls", "studs", "troll", "baron",
//                "earle", "panda", "wiley", "raged", "sexes", "berne", "vista",
//                "rojas", "cones", "byway", "vases", "wines", "forth", "freya",
//                "gully", "fires", "sails", "dusts", "terse", "booed", "stung",
//                "basic", "saver", "basis", "hmong", "brawn", "pured", "locks",
//                "downs", "punts", "rhine", "metes", "title", "shims", "bents",
//                "blows", "harte", "boyle", "peach", "posts", "olson", "might",
//                "flier", "rubes", "lingo", "tarts", "nexus", "woman", "mains",
//                "finis", "mikes", "pleas", "trams", "shawl", "gunny", "sleds",
//                "ruder", "aries", "usher", "refed", "toady", "caper", "tries",
//                "gimpy", "doors", "thieu", "deere", "mucky", "rests", "mares",
//                "cards", "bouts", "dines", "rants", "giles", "flunk", "enact",
//                "derek", "dover", "conan", "mooed", "fiver", "kaput", "enrol",
//                "payed", "feint", "miner", "shyer", "whelk", "perch", "furor",
//                "hayes", "tammy", "caves", "maims", "cairn", "tract", "legal",
//                "adler", "veldt", "basal", "spiny", "surer", "bolds", "grove",
//                "heaps", "noway", "pokes", "tubed", "beaks", "loots", "drawl",
//                "jones", "typed", "funny", "cells", "beaus", "bayed", "rears",
//                "seats", "hazed", "flubs", "maura", "goths", "rumba", "morse",
//                "fumes", "slide", "snoot", "music", "sully", "perth", "pocks",
//                "mills", "lopez", "sacks", "stine", "gawks", "gavel", "rains",
//                "wound", "hares", "guild", "leger", "foxed", "craws", "rinds",
//                "faced", "groom", "lully", "boded", "lends", "serge", "sword",
//                "faked", "envoy", "stick", "tumor", "riser", "bolts", "trued",
//                "gasps", "thoth", "veers", "verbs", "boles", "lunar", "taxes",
//                "vexes", "pucks", "welsh", "pelts", "shift", "booth", "smote",
//                "spied", "gnawn", "crete", "dough", "tasha", "timed", "wired",
//                "state", "hears", "lauds", "wills", "dummy", "basil", "belie",
//                "calls", "crams", "matts", "gybes", "limed", "snots", "moder",
//                "faces", "sibyl", "spare", "crops", "drips", "frown", "doggy",
//                "pearl", "reese", "curls", "earns", "poles", "tiara", "risks",
//                "lethe", "titan", "tucks", "trace", "vises", "prick", "sears",
//                "ogled", "preps", "livid", "kicky", "candy", "weeps", "tapes",
//                "cokes", "foods", "wards", "coifs", "shirk", "elsie", "ketch",
//                "trunk", "goofs", "kodak", "toyed", "lance", "whale", "soups",
//                "roars", "poxed", "tombs", "noons", "hindi", "basie", "hoffa",
//                "bayou", "tests", "roots", "shove", "hoses", "doled", "tempt",
//                "kilos", "velma", "avers", "dorks", "comic", "fanny", "poops",
//                "sicks", "leary", "merer", "finks", "garbo", "cains", "mimed",
//                "sates", "celli", "flats", "grown", "broth", "augur", "chaos",
//                "sangs", "chide", "barks", "guide", "mewed", "synch", "rings",
//                "scrap", "zings", "howls", "duded", "noemi", "geeks", "nexis",
//                "comte", "helot", "whams", "brand", "hogan", "moira", "trips",
//                "loges", "baits", "winds", "marla", "never", "louis", "anted",
//                "helix", "morns", "heeds", "crags", "rowdy", "becks", "venue",
//                "diary", "stoat", "feeds", "kiths", "riled", "drags", "lucia",
//                "deeps", "sends", "fonts", "swing", "fence", "stout", "trice",
//                "taker", "drugs", "babel", "plows", "pends", "sloes", "gents",
//                "brawl", "arabs", "leaps", "flied", "fulls", "meats", "megan",
//                "burch", "oscar", "evict", "betsy", "lasts", "ethos", "mavis",
//                "petal", "fever", "alone", "snips", "assay", "rocks", "talon",
//                "grass", "clive", "discs", "wrapt", "calfs", "razed", "learn",
//                "bruce", "midst", "swear", "merck", "meyer", "funks", "lobby",
//                "fears", "decay", "sedge", "alien", "reaps", "koran", "range",
//                "enter", "lepke", "honed", "gallo", "staid", "joist", "lines",
//                "paler", "fined", "sorts", "piper", "highs", "busch", "dario",
//                "north", "ashed", "sands", "songs", "rakes", "garza", "pinks",
//                "rival", "leann", "allow", "golds", "hilts", "berry", "hicks",
//                "idler", "weiss", "cider", "desks", "skies", "hulls", "warns",
//                "datum", "brown", "leapt", "dregs", "dozed", "stump", "reply",
//                "finny", "clues", "diode", "dicks", "rabid", "moors", "limbs",
//                "gulls", "scary", "dungs", "liege", "vicky", "nigel", "peeps",
//                "dolls", "blame", "sings", "wants", "fuzes", "proud", "bungs",
//                "seams", "bingo", "buffs", "shire", "decks", "hosed", "scots",
//                "pumas", "jazzy", "books", "ellie", "hayed", "snowy", "twill",
//                "links", "coped", "spats", "reyes", "piles", "hovel", "reads",
//                "wryer", "patty", "sling", "oneal", "waves", "gorse", "ofter",
//                "teams", "strep", "mores", "daily", "spoil", "limes", "foots",
//                "dells", "hakes", "danny", "furls", "flaws", "tarot", "dusty",
//                "potts", "tells", "pager", "claps", "serra", "josie", "award",
//                "pewee", "snack", "lobes", "damps", "tanya", "lures", "mushy",
//                "hertz", "caret", "marco", "parks", "pithy", "synge", "spoon",
//                "troth", "drama", "bleak", "lidia", "banns", "forms", "iambs",
//                "crick", "patel", "mercy", "waded" };
//        Set<String> dict = new HashSet<>();
//        for (String word : strs) {
//            dict.add(word);
//        }
//        List<List<String>> actual = solution.findLadders(beginWord, endWord,
//                dict);
//        List<List<String>> expected = new ArrayList<>();
//        readResultFromDist("test/_126_WordLadderII/Test7Result", expected);
//        assertEqualsIgnoreOrder(expected, actual);
//    }
//
//    @Test
//    public void Test8() {
//        String start = "sand";
//        String end = "acne";
//        Set<String> dict = new HashSet<>();
//        String[] words = { "slit", "bunk", "wars", "ping", "viva", "wynn",
//                "wows", "irks", "gang", "pool", "mock", "fort", "heel", "send",
//                "ship", "cols", "alec", "foal", "nabs", "gaze", "giza", "mays",
//                "dogs", "karo", "cums", "jedi", "webb", "lend", "mire", "jose",
//                "catt", "grow", "toss", "magi", "leis", "bead", "kara", "hoof",
//                "than", "ires", "baas", "vein", "kari", "riga", "oars", "gags",
//                "thug", "yawn", "wive", "view", "germ", "flab", "july", "tuck",
//                "rory", "bean", "feed", "rhee", "jeez", "gobs", "lath", "desk",
//                "yoko", "cute", "zeus", "thus", "dims", "link", "dirt", "mara",
//                "disc", "limy", "lewd", "maud", "duly", "elsa", "hart", "rays",
//                "rues", "camp", "lack", "okra", "tome", "math", "plug", "monk",
//                "orly", "friz", "hogs", "yoda", "poop", "tick", "plod", "cloy",
//                "pees", "imps", "lead", "pope", "mall", "frey", "been", "plea",
//                "poll", "male", "teak", "soho", "glob", "bell", "mary", "hail",
//                "scan", "yips", "like", "mull", "kory", "odor", "byte", "kaye",
//                "word", "honk", "asks", "slid", "hopi", "toke", "gore", "flew",
//                "tins", "mown", "oise", "hall", "vega", "sing", "fool", "boat",
//                "bobs", "lain", "soft", "hard", "rots", "sees", "apex", "chan",
//                "told", "woos", "unit", "scow", "gilt", "beef", "jars", "tyre",
//                "imus", "neon", "soap", "dabs", "rein", "ovid", "hose", "husk",
//                "loll", "asia", "cope", "tail", "hazy", "clad", "lash", "sags",
//                "moll", "eddy", "fuel", "lift", "flog", "land", "sigh", "saks",
//                "sail", "hook", "visa", "tier", "maws", "roeg", "gila", "eyes",
//                "noah", "hypo", "tore", "eggs", "rove", "chap", "room", "wait",
//                "lurk", "race", "host", "dada", "lola", "gabs", "sobs", "joel",
//                "keck", "axed", "mead", "gust", "laid", "ends", "oort", "nose",
//                "peer", "kept", "abet", "iran", "mick", "dead", "hags", "tens",
//                "gown", "sick", "odis", "miro", "bill", "fawn", "sumo", "kilt",
//                "huge", "ores", "oran", "flag", "tost", "seth", "sift", "poet",
//                "reds", "pips", "cape", "togo", "wale", "limn", "toll", "ploy",
//                "inns", "snag", "hoes", "jerk", "flux", "fido", "zane", "arab",
//                "gamy", "raze", "lank", "hurt", "rail", "hind", "hoot", "dogy",
//                "away", "pest", "hoed", "pose", "lose", "pole", "alva", "dino",
//                "kind", "clan", "dips", "soup", "veto", "edna", "damp", "gush",
//                "amen", "wits", "pubs", "fuzz", "cash", "pine", "trod", "gunk",
//                "nude", "lost", "rite", "cory", "walt", "mica", "cart", "avow",
//                "wind", "book", "leon", "life", "bang", "draw", "leek", "skis",
//                "dram", "ripe", "mine", "urea", "tiff", "over", "gale", "weir",
//                "defy", "norm", "tull", "whiz", "gill", "ward", "crag", "when",
//                "mill", "firs", "sans", "flue", "reid", "ekes", "jain", "mutt",
//                "hems", "laps", "piss", "pall", "rowe", "prey", "cull", "knew",
//                "size", "wets", "hurl", "wont", "suva", "girt", "prys", "prow",
//                "warn", "naps", "gong", "thru", "livy", "boar", "sade", "amok",
//                "vice", "slat", "emir", "jade", "karl", "loyd", "cerf", "bess",
//                "loss", "rums", "lats", "bode", "subs", "muss", "maim", "kits",
//                "thin", "york", "punt", "gays", "alpo", "aids", "drag", "eras",
//                "mats", "pyre", "clot", "step", "oath", "lout", "wary", "carp",
//                "hums", "tang", "pout", "whip", "fled", "omar", "such", "kano",
//                "jake", "stan", "loop", "fuss", "mini", "byrd", "exit", "fizz",
//                "lire", "emil", "prop", "noes", "awed", "gift", "soli", "sale",
//                "gage", "orin", "slur", "limp", "saar", "arks", "mast", "gnat",
//                "port", "into", "geed", "pave", "awls", "cent", "cunt", "full",
//                "dint", "hank", "mate", "coin", "tars", "scud", "veer", "coax",
//                "bops", "uris", "loom", "shod", "crib", "lids", "drys", "fish",
//                "edit", "dick", "erna", "else", "hahs", "alga", "moho", "wire",
//                "fora", "tums", "ruth", "bets", "duns", "mold", "mush", "swop",
//                "ruby", "bolt", "nave", "kite", "ahem", "brad", "tern", "nips",
//                "whew", "bait", "ooze", "gino", "yuck", "drum", "shoe", "lobe",
//                "dusk", "cult", "paws", "anew", "dado", "nook", "half", "lams",
//                "rich", "cato", "java", "kemp", "vain", "fees", "sham", "auks",
//                "gish", "fire", "elam", "salt", "sour", "loth", "whit", "yogi",
//                "shes", "scam", "yous", "lucy", "inez", "geld", "whig", "thee",
//                "kelp", "loaf", "harm", "tomb", "ever", "airs", "page", "laud",
//                "stun", "paid", "goop", "cobs", "judy", "grab", "doha", "crew",
//                "item", "fogs", "tong", "blip", "vest", "bran", "wend", "bawl",
//                "feel", "jets", "mixt", "tell", "dire", "devi", "milo", "deng",
//                "yews", "weak", "mark", "doug", "fare", "rigs", "poke", "hies",
//                "sian", "suez", "quip", "kens", "lass", "zips", "elva", "brat",
//                "cosy", "teri", "hull", "spun", "russ", "pupa", "weed", "pulp",
//                "main", "grim", "hone", "cord", "barf", "olav", "gaps", "rote",
//                "wilt", "lars", "roll", "balm", "jana", "give", "eire", "faun",
//                "suck", "kegs", "nita", "weer", "tush", "spry", "loge", "nays",
//                "heir", "dope", "roar", "peep", "nags", "ates", "bane", "seas",
//                "sign", "fred", "they", "lien", "kiev", "fops", "said", "lawn",
//                "lind", "miff", "mass", "trig", "sins", "furl", "ruin", "sent",
//                "cray", "maya", "clog", "puns", "silk", "axis", "grog", "jots",
//                "dyer", "mope", "rand", "vend", "keen", "chou", "dose", "rain",
//                "eats", "sped", "maui", "evan", "time", "todd", "skit", "lief",
//                "sops", "outs", "moot", "faze", "biro", "gook", "fill", "oval",
//                "skew", "veil", "born", "slob", "hyde", "twin", "eloy", "beat",
//                "ergs", "sure", "kobe", "eggo", "hens", "jive", "flax", "mons",
//                "dunk", "yest", "begs", "dial", "lodz", "burp", "pile", "much",
//                "dock", "rene", "sago", "racy", "have", "yalu", "glow", "move",
//                "peps", "hods", "kins", "salk", "hand", "cons", "dare", "myra",
//                "sega", "type", "mari", "pelt", "hula", "gulf", "jugs", "flay",
//                "fest", "spat", "toms", "zeno", "taps", "deny", "swag", "afro",
//                "baud", "jabs", "smut", "egos", "lara", "toes", "song", "fray",
//                "luis", "brut", "olen", "mere", "ruff", "slum", "glad", "buds",
//                "silt", "rued", "gelt", "hive", "teem", "ides", "sink", "ands",
//                "wisp", "omen", "lyre", "yuks", "curb", "loam", "darn", "liar",
//                "pugs", "pane", "carl", "sang", "scar", "zeds", "claw", "berg",
//                "hits", "mile", "lite", "khan", "erik", "slug", "loon", "dena",
//                "ruse", "talk", "tusk", "gaol", "tads", "beds", "sock", "howe",
//                "gave", "snob", "ahab", "part", "meir", "jell", "stir", "tels",
//                "spit", "hash", "omit", "jinx", "lyra", "puck", "laue", "beep",
//                "eros", "owed", "cede", "brew", "slue", "mitt", "jest", "lynx",
//                "wads", "gena", "dank", "volt", "gray", "pony", "veld", "bask",
//                "fens", "argo", "work", "taxi", "afar", "boon", "lube", "pass",
//                "lazy", "mist", "blot", "mach", "poky", "rams", "sits", "rend",
//                "dome", "pray", "duck", "hers", "lure", "keep", "gory", "chat",
//                "runt", "jams", "lays", "posy", "bats", "hoff", "rock", "keri",
//                "raul", "yves", "lama", "ramp", "vote", "jody", "pock", "gist",
//                "sass", "iago", "coos", "rank", "lowe", "vows", "koch", "taco",
//                "jinn", "juno", "rape", "band", "aces", "goal", "huck", "lila",
//                "tuft", "swan", "blab", "leda", "gems", "hide", "tack", "porn",
//                "scum", "frat", "plum", "duds", "shad", "arms", "pare", "chin",
//                "gain", "knee", "foot", "line", "dove", "vera", "jays", "fund",
//                "reno", "skid", "boys", "corn", "gwyn", "sash", "weld", "ruiz",
//                "dior", "jess", "leaf", "pars", "cote", "zing", "scat", "nice",
//                "dart", "only", "owls", "hike", "trey", "whys", "ding", "klan",
//                "ross", "barb", "ants", "lean", "dopy", "hock", "tour", "grip",
//                "aldo", "whim", "prom", "rear", "dins", "duff", "dell", "loch",
//                "lava", "sung", "yank", "thar", "curl", "venn", "blow", "pomp",
//                "heat", "trap", "dali", "nets", "seen", "gash", "twig", "dads",
//                "emmy", "rhea", "navy", "haws", "mite", "bows", "alas", "ives",
//                "play", "soon", "doll", "chum", "ajar", "foam", "call", "puke",
//                "kris", "wily", "came", "ales", "reef", "raid", "diet", "prod",
//                "prut", "loot", "soar", "coed", "celt", "seam", "dray", "lump",
//                "jags", "nods", "sole", "kink", "peso", "howl", "cost", "tsar",
//                "uric", "sore", "woes", "sewn", "sake", "cask", "caps", "burl",
//                "tame", "bulk", "neva", "from", "meet", "webs", "spar", "fuck",
//                "buoy", "wept", "west", "dual", "pica", "sold", "seed", "gads",
//                "riff", "neck", "deed", "rudy", "drop", "vale", "flit", "romp",
//                "peak", "jape", "jews", "fain", "dens", "hugo", "elba", "mink",
//                "town", "clam", "feud", "fern", "dung", "newt", "mime", "deem",
//                "inti", "gigs", "sosa", "lope", "lard", "cara", "smug", "lego",
//                "flex", "doth", "paar", "moon", "wren", "tale", "kant", "eels",
//                "muck", "toga", "zens", "lops", "duet", "coil", "gall", "teal",
//                "glib", "muir", "ails", "boer", "them", "rake", "conn", "neat",
//                "frog", "trip", "coma", "must", "mono", "lira", "craw", "sled",
//                "wear", "toby", "reel", "hips", "nate", "pump", "mont", "died",
//                "moss", "lair", "jibe", "oils", "pied", "hobs", "cads", "haze",
//                "muse", "cogs", "figs", "cues", "roes", "whet", "boru", "cozy",
//                "amos", "tans", "news", "hake", "cots", "boas", "tutu", "wavy",
//                "pipe", "typo", "albs", "boom", "dyke", "wail", "woke", "ware",
//                "rita", "fail", "slab", "owes", "jane", "rack", "hell", "lags",
//                "mend", "mask", "hume", "wane", "acne", "team", "holy", "runs",
//                "exes", "dole", "trim", "zola", "trek", "puma", "wacs", "veep",
//                "yaps", "sums", "lush", "tubs", "most", "witt", "bong", "rule",
//                "hear", "awry", "sots", "nils", "bash", "gasp", "inch", "pens",
//                "fies", "juts", "pate", "vine", "zulu", "this", "bare", "veal",
//                "josh", "reek", "ours", "cowl", "club", "farm", "teat", "coat",
//                "dish", "fore", "weft", "exam", "vlad", "floe", "beak", "lane",
//                "ella", "warp", "goth", "ming", "pits", "rent", "tito", "wish",
//                "amps", "says", "hawk", "ways", "punk", "nark", "cagy", "east",
//                "paul", "bose", "solo", "teed", "text", "hews", "snip", "lips",
//                "emit", "orgy", "icon", "tuna", "soul", "kurd", "clod", "calk",
//                "aunt", "bake", "copy", "acid", "duse", "kiln", "spec", "fans",
//                "bani", "irma", "pads", "batu", "logo", "pack", "oder", "atop",
//                "funk", "gide", "bede", "bibs", "taut", "guns", "dana", "puff",
//                "lyme", "flat", "lake", "june", "sets", "gull", "hops", "earn",
//                "clip", "fell", "kama", "seal", "diaz", "cite", "chew", "cuba",
//                "bury", "yard", "bank", "byes", "apia", "cree", "nosh", "judo",
//                "walk", "tape", "taro", "boot", "cods", "lade", "cong", "deft",
//                "slim", "jeri", "rile", "park", "aeon", "fact", "slow", "goff",
//                "cane", "earp", "tart", "does", "acts", "hope", "cant", "buts",
//                "shin", "dude", "ergo", "mode", "gene", "lept", "chen", "beta",
//                "eden", "pang", "saab", "fang", "whir", "cove", "perk", "fads",
//                "rugs", "herb", "putt", "nous", "vane", "corm", "stay", "bids",
//                "vela", "roof", "isms", "sics", "gone", "swum", "wiry", "cram",
//                "rink", "pert", "heap", "sikh", "dais", "cell", "peel", "nuke",
//                "buss", "rasp", "none", "slut", "bent", "dams", "serb", "dork",
//                "bays", "kale", "cora", "wake", "welt", "rind", "trot", "sloe",
//                "pity", "rout", "eves", "fats", "furs", "pogo", "beth", "hued",
//                "edam", "iamb", "glee", "lute", "keel", "airy", "easy", "tire",
//                "rube", "bogy", "sine", "chop", "rood", "elbe", "mike", "garb",
//                "jill", "gaul", "chit", "dons", "bars", "ride", "beck", "toad",
//                "make", "head", "suds", "pike", "snot", "swat", "peed", "same",
//                "gaza", "lent", "gait", "gael", "elks", "hang", "nerf", "rosy",
//                "shut", "glop", "pain", "dion", "deaf", "hero", "doer", "wost",
//                "wage", "wash", "pats", "narc", "ions", "dice", "quay", "vied",
//                "eons", "case", "pour", "urns", "reva", "rags", "aden", "bone",
//                "rang", "aura", "iraq", "toot", "rome", "hals", "megs", "pond",
//                "john", "yeps", "pawl", "warm", "bird", "tint", "jowl", "gibe",
//                "come", "hold", "pail", "wipe", "bike", "rips", "eery", "kent",
//                "hims", "inks", "fink", "mott", "ices", "macy", "serf", "keys",
//                "tarp", "cops", "sods", "feet", "tear", "benz", "buys", "colo",
//                "boil", "sews", "enos", "watt", "pull", "brag", "cork", "save",
//                "mint", "feat", "jamb", "rubs", "roxy", "toys", "nosy", "yowl",
//                "tamp", "lobs", "foul", "doom", "sown", "pigs", "hemp", "fame",
//                "boor", "cube", "tops", "loco", "lads", "eyre", "alta", "aged",
//                "flop", "pram", "lesa", "sawn", "plow", "aral", "load", "lied",
//                "pled", "boob", "bert", "rows", "zits", "rick", "hint", "dido",
//                "fist", "marc", "wuss", "node", "smog", "nora", "shim", "glut",
//                "bale", "perl", "what", "tort", "meek", "brie", "bind", "cake",
//                "psst", "dour", "jove", "tree", "chip", "stud", "thou", "mobs",
//                "sows", "opts", "diva", "perm", "wise", "cuds", "sols", "alan",
//                "mild", "pure", "gail", "wins", "offs", "nile", "yelp", "minn",
//                "tors", "tran", "homy", "sadr", "erse", "nero", "scab", "finn",
//                "mich", "turd", "then", "poem", "noun", "oxus", "brow", "door",
//                "saws", "eben", "wart", "wand", "rosa", "left", "lina", "cabs",
//                "rapt", "olin", "suet", "kalb", "mans", "dawn", "riel", "temp",
//                "chug", "peal", "drew", "null", "hath", "many", "took", "fond",
//                "gate", "sate", "leak", "zany", "vans", "mart", "hess", "home",
//                "long", "dirk", "bile", "lace", "moog", "axes", "zone", "fork",
//                "duct", "rico", "rife", "deep", "tiny", "hugh", "bilk", "waft",
//                "swig", "pans", "with", "kern", "busy", "film", "lulu", "king",
//                "lord", "veda", "tray", "legs", "soot", "ells", "wasp", "hunt",
//                "earl", "ouch", "diem", "yell", "pegs", "blvd", "polk", "soda",
//                "zorn", "liza", "slop", "week", "kill", "rusk", "eric", "sump",
//                "haul", "rims", "crop", "blob", "face", "bins", "read", "care",
//                "pele", "ritz", "beau", "golf", "drip", "dike", "stab", "jibs",
//                "hove", "junk", "hoax", "tats", "fief", "quad", "peat", "ream",
//                "hats", "root", "flak", "grit", "clap", "pugh", "bosh", "lock",
//                "mute", "crow", "iced", "lisa", "bela", "fems", "oxes", "vies",
//                "gybe", "huff", "bull", "cuss", "sunk", "pups", "fobs", "turf",
//                "sect", "atom", "debt", "sane", "writ", "anon", "mayo", "aria",
//                "seer", "thor", "brim", "gawk", "jack", "jazz", "menu", "yolk",
//                "surf", "libs", "lets", "bans", "toil", "open", "aced", "poor",
//                "mess", "wham", "fran", "gina", "dote", "love", "mood", "pale",
//                "reps", "ines", "shot", "alar", "twit", "site", "dill", "yoga",
//                "sear", "vamp", "abel", "lieu", "cuff", "orbs", "rose", "tank",
//                "gape", "guam", "adar", "vole", "your", "dean", "dear", "hebe",
//                "crab", "hump", "mole", "vase", "rode", "dash", "sera", "balk",
//                "lela", "inca", "gaea", "bush", "loud", "pies", "aide", "blew",
//                "mien", "side", "kerr", "ring", "tess", "prep", "rant", "lugs",
//                "hobo", "joke", "odds", "yule", "aida", "true", "pone", "lode",
//                "nona", "weep", "coda", "elmo", "skim", "wink", "bras", "pier",
//                "bung", "pets", "tabs", "ryan", "jock", "body", "sofa", "joey",
//                "zion", "mace", "kick", "vile", "leno", "bali", "fart", "that",
//                "redo", "ills", "jogs", "pent", "drub", "slaw", "tide", "lena",
//                "seep", "gyps", "wave", "amid", "fear", "ties", "flan", "wimp",
//                "kali", "shun", "crap", "sage", "rune", "logs", "cain", "digs",
//                "abut", "obit", "paps", "rids", "fair", "hack", "huns", "road",
//                "caws", "curt", "jute", "fisk", "fowl", "duty", "holt", "miss",
//                "rude", "vito", "baal", "ural", "mann", "mind", "belt", "clem",
//                "last", "musk", "roam", "abed", "days", "bore", "fuze", "fall",
//                "pict", "dump", "dies", "fiat", "vent", "pork", "eyed", "docs",
//                "rive", "spas", "rope", "ariz", "tout", "game", "jump", "blur",
//                "anti", "lisp", "turn", "sand", "food", "moos", "hoop", "saul",
//                "arch", "fury", "rise", "diss", "hubs", "burs", "grid", "ilks",
//                "suns", "flea", "soil", "lung", "want", "nola", "fins", "thud",
//                "kidd", "juan", "heps", "nape", "rash", "burt", "bump", "tots",
//                "brit", "mums", "bole", "shah", "tees", "skip", "limb", "umps",
//                "ache", "arcs", "raft", "halo", "luce", "bahs", "leta", "conk",
//                "duos", "siva", "went", "peek", "sulk", "reap", "free", "dubs",
//                "lang", "toto", "hasp", "ball", "rats", "nair", "myst", "wang",
//                "snug", "nash", "laos", "ante", "opal", "tina", "pore", "bite",
//                "haas", "myth", "yugo", "foci", "dent", "bade", "pear", "mods",
//                "auto", "shop", "etch", "lyly", "curs", "aron", "slew", "tyro",
//                "sack", "wade", "clio", "gyro", "butt", "icky", "char", "itch",
//                "halt", "gals", "yang", "tend", "pact", "bees", "suit", "puny",
//                "hows", "nina", "brno", "oops", "lick", "sons", "kilo", "bust",
//                "nome", "mona", "dull", "join", "hour", "papa", "stag", "bern",
//                "wove", "lull", "slip", "laze", "roil", "alto", "bath", "buck",
//                "alma", "anus", "evil", "dumb", "oreo", "rare", "near", "cure",
//                "isis", "hill", "kyle", "pace", "comb", "nits", "flip", "clop",
//                "mort", "thea", "wall", "kiel", "judd", "coop", "dave", "very",
//                "amie", "blah", "flub", "talc", "bold", "fogy", "idea", "prof",
//                "horn", "shoo", "aped", "pins", "helm", "wees", "beer", "womb",
//                "clue", "alba", "aloe", "fine", "bard", "limo", "shaw", "pint",
//                "swim", "dust", "indy", "hale", "cats", "troy", "wens", "luke",
//                "vern", "deli", "both", "brig", "daub", "sara", "sued", "bier",
//                "noel", "olga", "dupe", "look", "pisa", "knox", "murk", "dame",
//                "matt", "gold", "jame", "toge", "luck", "peck", "tass", "calf",
//                "pill", "wore", "wadi", "thur", "parr", "maul", "tzar", "ones",
//                "lees", "dark", "fake", "bast", "zoom", "here", "moro", "wine",
//                "bums", "cows", "jean", "palm", "fume", "plop", "help", "tuba",
//                "leap", "cans", "back", "avid", "lice", "lust", "polo", "dory",
//                "stew", "kate", "rama", "coke", "bled", "mugs", "ajax", "arts",
//                "drug", "pena", "cody", "hole", "sean", "deck", "guts", "kong",
//                "bate", "pitt", "como", "lyle", "siam", "rook", "baby", "jigs",
//                "bret", "bark", "lori", "reba", "sups", "made", "buzz", "gnaw",
//                "alps", "clay", "post", "viol", "dina", "card", "lana", "doff",
//                "yups", "tons", "live", "kids", "pair", "yawl", "name", "oven",
//                "sirs", "gyms", "prig", "down", "leos", "noon", "nibs", "cook",
//                "safe", "cobb", "raja", "awes", "sari", "nerd", "fold", "lots",
//                "pete", "deal", "bias", "zeal", "girl", "rage", "cool", "gout",
//                "whey", "soak", "thaw", "bear", "wing", "nagy", "well", "oink",
//                "sven", "kurt", "etna", "held", "wood", "high", "feta", "twee",
//                "ford", "cave", "knot", "tory", "ibis", "yaks", "vets", "foxy",
//                "sank", "cone", "pius", "tall", "seem", "wool", "flap", "gird",
//                "lore", "coot", "mewl", "sere", "real", "puts", "sell", "nuts",
//                "foil", "lilt", "saga", "heft", "dyed", "goat", "spew", "daze",
//                "frye", "adds", "glen", "tojo", "pixy", "gobi", "stop", "tile",
//                "hiss", "shed", "hahn", "baku", "ahas", "sill", "swap", "also",
//                "carr", "manx", "lime", "debs", "moat", "eked", "bola", "pods",
//                "coon", "lacy", "tube", "minx", "buff", "pres", "clew", "gaff",
//                "flee", "burn", "whom", "cola", "fret", "purl", "wick", "wigs",
//                "donn", "guys", "toni", "oxen", "wite", "vial", "spam", "huts",
//                "vats", "lima", "core", "eula", "thad", "peon", "erie", "oats",
//                "boyd", "cued", "olaf", "tams", "secs", "urey", "wile", "penn",
//                "bred", "rill", "vary", "sues", "mail", "feds", "aves", "code",
//                "beam", "reed", "neil", "hark", "pols", "gris", "gods", "mesa",
//                "test", "coup", "heed", "dora", "hied", "tune", "doze", "pews",
//                "oaks", "bloc", "tips", "maid", "goof", "four", "woof", "silo",
//                "bray", "zest", "kiss", "yong", "file", "hilt", "iris", "tuns",
//                "lily", "ears", "pant", "jury", "taft", "data", "gild", "pick",
//                "kook", "colt", "bohr", "anal", "asps", "babe", "bach", "mash",
//                "biko", "bowl", "huey", "jilt", "goes", "guff", "bend", "nike",
//                "tami", "gosh", "tike", "gees", "urge", "path", "bony", "jude",
//                "lynn", "lois", "teas", "dunn", "elul", "bonn", "moms", "bugs",
//                "slay", "yeah", "loan", "hulk", "lows", "damn", "nell", "jung",
//                "avis", "mane", "waco", "loin", "knob", "tyke", "anna", "hire",
//                "luau", "tidy", "nuns", "pots", "quid", "exec", "hans", "hera",
//                "hush", "shag", "scot", "moan", "wald", "ursa", "lorn", "hunk",
//                "loft", "yore", "alum", "mows", "slog", "emma", "spud", "rice",
//                "worn", "erma", "need", "bags", "lark", "kirk", "pooh", "dyes",
//                "area", "dime", "luvs", "foch", "refs", "cast", "alit", "tugs",
//                "even", "role", "toed", "caph", "nigh", "sony", "bide", "robs",
//                "folk", "daft", "past", "blue", "flaw", "sana", "fits", "barr",
//                "riot", "dots", "lamp", "cock", "fibs", "harp", "tent", "hate",
//                "mali", "togs", "gear", "tues", "bass", "pros", "numb", "emus",
//                "hare", "fate", "wife", "mean", "pink", "dune", "ares", "dine",
//                "oily", "tony", "czar", "spay", "push", "glum", "till", "moth",
//                "glue", "dive", "scad", "pops", "woks", "andy", "leah", "cusp",
//                "hair", "alex", "vibe", "bulb", "boll", "firm", "joys", "tara",
//                "cole", "levy", "owen", "chow", "rump", "jail", "lapp", "beet",
//                "slap", "kith", "more", "maps", "bond", "hick", "opus", "rust",
//                "wist", "shat", "phil", "snow", "lott", "lora", "cary", "mote",
//                "rift", "oust", "klee", "goad", "pith", "heep", "lupe", "ivan",
//                "mimi", "bald", "fuse", "cuts", "lens", "leer", "eyry", "know",
//                "razz", "tare", "pals", "geek", "greg", "teen", "clef", "wags",
//                "weal", "each", "haft", "nova", "waif", "rate", "katy", "yale",
//                "dale", "leas", "axum", "quiz", "pawn", "fend", "capt", "laws",
//                "city", "chad", "coal", "nail", "zaps", "sort", "loci", "less",
//                "spur", "note", "foes", "fags", "gulp", "snap", "bogs", "wrap",
//                "dane", "melt", "ease", "felt", "shea", "calm", "star", "swam",
//                "aery", "year", "plan", "odin", "curd", "mira", "mops", "shit",
//                "davy", "apes", "inky", "hues", "lome", "bits", "vila", "show",
//                "best", "mice", "gins", "next", "roan", "ymir", "mars", "oman",
//                "wild", "heal", "plus", "erin", "rave", "robe", "fast", "hutu",
//                "aver", "jodi", "alms", "yams", "zero", "revs", "wean", "chic",
//                "self", "jeep", "jobs", "waxy", "duel", "seek", "spot", "raps",
//                "pimp", "adan", "slam", "tool", "morn", "futz", "ewes", "errs",
//                "knit", "rung", "kans", "muff", "huhs", "tows", "lest", "meal",
//                "azov", "gnus", "agar", "sips", "sway", "otis", "tone", "tate",
//                "epic", "trio", "tics", "fade", "lear", "owns", "robt", "weds",
//                "five", "lyon", "terr", "arno", "mama", "grey", "disk", "sept",
//                "sire", "bart", "saps", "whoa", "turk", "stow", "pyle", "joni",
//                "zinc", "negs", "task", "leif", "ribs", "malt", "nine", "bunt",
//                "grin", "dona", "nope", "hams", "some", "molt", "smit", "sacs",
//                "joan", "slav", "lady", "base", "heck", "list", "take", "herd",
//                "will", "nubs", "burg", "hugs", "peru", "coif", "zoos", "nick",
//                "idol", "levi", "grub", "roth", "adam", "elma", "tags", "tote",
//                "yaws", "cali", "mete", "lula", "cubs", "prim", "luna", "jolt",
//                "span", "pita", "dodo", "puss", "deer", "term", "dolt", "goon",
//                "gary", "yarn", "aims", "just", "rena", "tine", "cyst", "meld",
//                "loki", "wong", "were", "hung", "maze", "arid", "cars", "wolf",
//                "marx", "faye", "eave", "raga", "flow", "neal", "lone", "anne",
//                "cage", "tied", "tilt", "soto", "opel", "date", "buns", "dorm",
//                "kane", "akin", "ewer", "drab", "thai", "jeer", "grad", "berm",
//                "rods", "saki", "grus", "vast", "late", "lint", "mule", "risk",
//                "labs", "snit", "gala", "find", "spin", "ired", "slot", "oafs",
//                "lies", "mews", "wino", "milk", "bout", "onus", "tram", "jaws",
//                "peas", "cleo", "seat", "gums", "cold", "vang", "dewy", "hood",
//                "rush", "mack", "yuan", "odes", "boos", "jami", "mare", "plot",
//                "swab", "borg", "hays", "form", "mesh", "mani", "fife", "good",
//                "gram", "lion", "myna", "moor", "skin", "posh", "burr", "rime",
//                "done", "ruts", "pays", "stem", "ting", "arty", "slag", "iron",
//                "ayes", "stub", "oral", "gets", "chid", "yens", "snub", "ages",
//                "wide", "bail", "verb", "lamb", "bomb", "army", "yoke", "gels",
//                "tits", "bork", "mils", "nary", "barn", "hype", "odom", "avon",
//                "hewn", "rios", "cams", "tact", "boss", "oleo", "duke", "eris",
//                "gwen", "elms", "deon", "sims", "quit", "nest", "font", "dues",
//                "yeas", "zeta", "bevy", "gent", "torn", "cups", "worm", "baum",
//                "axon", "purr", "vise", "grew", "govs", "meat", "chef", "rest",
//                "lame" };
//        dict.addAll(Arrays.asList(words));
//        List<List<String>> actual = solution.findLadders(start, end, dict);
//        // writeInputToDisk("test/_126_WordLadderII/Test8Result", actual);
//        List<List<String>> expected = new ArrayList<>();
//        readResultFromDist("test/_126_WordLadderII/Test8Result", expected);
//        assertEqualsIgnoreOrder(expected, actual);
//    }
//
//    private void readResultFromDist(String filename, List<List<String>> result) {
//        String pathname = filename;
//        try {
//            File file = new File(pathname);
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            while (true) {
//                String line = br.readLine();
//                if (line == null) {
//                    break;
//                }
//                result.add(Arrays.asList(line.substring(1, line.length() - 1)
//                        .split(", ")));
//            }
//            br.close();
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }

}
