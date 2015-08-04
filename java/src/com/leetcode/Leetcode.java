/**
 * File: Leetcode.java
 *************************************************************************
 * Before you run!
 * set your git repository's prefix and suffix, see detail in code.
 * 
 * # Assuming you are at the parent directory at src and you have placed
 * # jsoup-1.8.2.jar at the same level of src.
 * 
 * Compilation: (generate .class file to bin directory)
 * % javac -d bin -cp jsoup-1.8.2.jar src/com/leetcode/Leetcode.java src/com/leetcode/Problem.java 
 * 
 * Execution: 
 * % java -cp jsoup-1.8.2.jar:bin com/leetcode/Leetcode
 * 
 * Dependency: Problem.java; jsoup.jar
 * 
 * If you have a github repository using this project, you can this program
 * to track your progress and find new problems from leetcode.
 * 
 *************************************************************************
 */
package com.leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Set <em>GIT_PREFIX</em> and <em>GIT_SUFFIX</em> before you run. For first
 * time use, this program will create a new mark down file. For update use, this
 * problem will try to find new problems from leetcode and and new solution
 * links from your git.
 * 
 * @author Steven Cooks
 */
public class Leetcode {

    private static final String LEETCODE_ALGO_URL = "https://leetcode.com/problemset/algorithms/";
    private static final String LEETCODE_PREFIX = "https://leetcode.com";

    // For example:
    // My solution for problem 1 is
    // https://github.com/interviewcoder/leetcode/blob/master/java/src/_001_TwoSum/Solution.java
    // then prefix is
    // "https://github.com/interviewcoder/leetcode/blob/master/java/src/";
    // suffix is "/Solution.java";

    // TODO: set your github repository's prefix
    private static final String GIT_PREFIX = "";
    // private static final String GIT_PREFIX = "https://github.com/interviewcoder/leetcode/blob/master/java/src/";

    // TODO: set your github repository's suffix
    private static final String GIT_SUFFIX = "";
    // private static final String GIT_SUFFIX = "/Solution.java";

    private static final String MD_DEST_FILE = "leetcode_java.md";

    private List<String> output = new ArrayList<>();

    private static final String STAR_DECO = "***************************************************";
    private static final String DASH_DECO = "---------------------------------------------------";

    @SuppressWarnings("serial")
    private static final Set<Character> skipSet = new HashSet<Character>() {
        {
            add(')');
            add('(');
            add(' ');
            add(',');
            add('-');
            add('\'');
        }
    };

    /**
     * Extract all problems from <em>Leetcode</em> and generate a mark down file
     * which has link to solutions in my Git repository.
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            new Leetcode().run();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // create a new mark down file if target file does not exist,
    // otherwise, update that mark down file.
    // Get all existing problem from target file, and add new problems,
    // then add solution links to each problem.
    private void run() {
        if (GIT_PREFIX.equals("") || GIT_SUFFIX.equals("")) {
            throw new NoSuchElementException(
                    "Please set your prefix and suffix");
        }
        // read in existing problem from mark down file and add solution link
        int lastProblem = readInProblems();
        // crawl new problems from leetcode
        try {
            List<Problem> problems = extractProblems(LEETCODE_ALGO_URL,
                    lastProblem);
            Collections.sort(problems);
            int unlock = 0;
            for (Problem problem : problems) {
                setProblemTags(problem);
                if (!problem.isLocked()) {
                    problem.setGitUrl(getGitSolutionURL(problem.getGitNumber(),
                            problem.getTitle()));
                    System.out.println(problem);
                    output.add(problem.toMDformat());
                    unlock++;
                }
            }
            System.out.println(DASH_DECO);
            System.out.println(unlock + " new problems found!");
            System.out.println(STAR_DECO);
            writeToFile(output, MD_DEST_FILE);
            System.out.println("job done, please see " + MD_DEST_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int readInProblems() {
        int lastProblem = 0;
        File f = new File(MD_DEST_FILE);
        if (!f.exists() || f.isDirectory()) {
            // target mark down file does not exist
            output.add(Problem.getMDHeader());
            output.add(Problem.getMDFormat());
            System.out
                    .println("First time to run, please allow several minutes.");
        } else {
            List<String> md = readInputFile(MD_DEST_FILE);
            if (md.size() < 2) {
                return lastProblem;
            }
            // first two rows are header row and format row
            output.add(md.get(0));
            output.add(md.get(1));
            int numOfNewSolution = 0;
            System.out.println(STAR_DECO);
            for (int i = 2; i < md.size(); i++) {
                String row = md.get(i);
                int titleStart = row.indexOf("|", 1) + 1;
                int titleEnd = row.indexOf("|", titleStart + 1) - 1;
                String title = row.substring(titleStart + 1, titleEnd);
                String num = parseProblemNumber(row);
                if (!title.startsWith("[")) {
                    // this solution has not been added before,
                    // try to find solution for this problem
                    String gitUrl = getGitSolutionURL(num, title);
                    if (!gitUrl.equals("")) {
                        numOfNewSolution++;
                        // new solution found!
                        StringBuilder sb = new StringBuilder();
                        sb.append("| ").append(num).append(" | [")
                                .append(title).append("]");
                        System.out.println(sb.toString());
                        sb.append("(").append(gitUrl).append(") ");
                        row = sb.append(row.substring(titleEnd)).toString();
                    }
                }
                lastProblem = Math.max(lastProblem, Integer.parseInt(num));
                output.add(row);
            }
            String info = numOfNewSolution + " new solution links added.";
            System.out.println(DASH_DECO);
            System.out.println(info);
            System.out.println();
            System.out.println(STAR_DECO);
        }
        return lastProblem;
    }

    private String parseProblemNumber(String row) {
        int numStart = row.indexOf("|", 0) + 1;
        int numEnd = row.indexOf("|", numStart + 1) - 1;
        String num = row.substring(numStart + 1, numEnd);
        return num;
    }

    private void setProblemTags(Problem problem) throws IOException {
        String url = problem.getUrl();
        List<String> tagList = new ArrayList<>();
        Document doc = Jsoup.connect(url).get();
        // find the elements in tag <a> with attribute href starting with "/tag"
        Elements tags = doc.select("a[href^=/tag]");
        for (Element link : tags) {
            String linkText = link.text();
            tagList.add(linkText);
        }
        problem.setTags(tagList);
    }

    private String getGitSolutionURL(String gitNumber, String title) {
        StringBuilder urlBuilder = new StringBuilder(GIT_PREFIX + "_");
        urlBuilder.append(gitNumber).append("_").append(camelStyleName(title))
                .append(GIT_SUFFIX);
        try {
            URL url;
            url = new URL(urlBuilder.toString());
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.setRequestMethod("HEAD");
            if (huc.getResponseCode() == HttpsURLConnection.HTTP_OK) {
                return urlBuilder.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println(url);
        return "";
    }

    // camel-style problem name
    private String camelStyleName(String problemName) {
        StringBuilder name = new StringBuilder();
        boolean capital = true;
        for (char ch : problemName.toCharArray()) {
            if (ch == ' ') {
                capital = true;
            }
            if (!skipSet.contains(ch)) {
                if (capital) {
                    name.append(Character.toUpperCase(ch));
                    capital = false;
                } else {
                    name.append(ch);
                }
            }
        }
        return name.toString();
    }

    // extract all problems from leetcode algorithm page that has problem number
    // larger than given from number
    private List<Problem> extractProblems(String leetcodeAlgoUrl, int from)
            throws IOException {
        List<Problem> problems = new ArrayList<>();
        Document doc = Jsoup.connect(leetcodeAlgoUrl).get();
        Element probList = doc.getElementById("problemList");
        Elements probs = probList.select("tbody tr");
        // right now : | ac or not | # | title | acceptance | difficulty |
        for (Element element : probs) {
            Elements elem = element.select("td");
            int number = Integer.parseInt(elem.get(1).text());
            if (number > from) {
                String title = element.select("a[href]").text();
                String url = element.select("a[href]").attr("href");
                String difficulty = element.select("td[value]").text();
                // acceptance is the 3rd column in element
                String acceptance = elem.get(3).text();
                Problem problem = new Problem.Builder(number, LEETCODE_PREFIX
                        + url).title(title).acceptance(acceptance)
                        .difficulty(difficulty).build();
                problems.add(problem);
            }
        }
        return problems;
    }

    private List<String> readInputFile(String inputfile) {
        List<String> page = new ArrayList<>();
        try {
            File file = new File(inputfile);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                page.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return page;
    }

    private void writeToFile(List<String> rows, String mdDestFile) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(new File(mdDestFile)));
            for (String row : rows) {
                bw.write(row);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
