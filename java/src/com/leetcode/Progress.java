/**
 * File: src/com/leetcode/Progress.java
 * -----------------------------------------------------------------------
 * Generate a mark down file that recording solutions in my git repository.
 * 
 * Run below command in terminal first: (which creates input file)
 *      $ sh parse
 *      
 * Dependencies: join.awk, parse.sed, parse      
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class Progress {

    private static final String DELIMITER = "\t";

    private static final String INPUT_FILE = "scripts/progress.tsv";
    private static final String DEST_FILE = "scripts/progress.md";

    private static final String GIT_PREFIX = "https://github.com/interviewcoder/leetcode/blob/master/java/src/";
    private static final String GIT_SUFFIX = "/Solution.java";
    
    private int undone = 0;

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

    public static void main(String[] args) {
        new Progress().run();
    }

    public void run() {
        List<String> page = readInputFile();
        writeMDFile(page);
        System.out.println("done!");
    }

    // add url link between problem name and solution from my github repository
    private void writeMDFile(List<String> page) {
        File dest = new File(DEST_FILE);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
            for (int i = 0; i < page.size(); i++) {
                String[] cols = page.get(i).split(DELIMITER);
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < cols.length; j++) {
                    // skip the acceptance column
                    if (j != 2) {
                        row.append("|");
                        if (i != 0 && j == 1) {
                            // try to find active url for this problem
                            row.append(toGitURL(cols[0], cols[j]));
                        } else {
                            row.append(cols[j]);
                        }
                        if (j == cols.length - 1) {
                            row.append("|");
                        }
                    }
                }
                // add tags and description
                if (i == 0) {
                    row.append( " Tags | Description | ");
                } else {
                    row.append(" Array |     |");
                }
                bw.write(row.toString());
                bw.newLine();
                if (i == 0) {
                    // insert format row after title row
                    String format = row.toString().replaceAll("[^\\|]", "---");
                    bw.write(format);
                    bw.newLine();
                }
            }
            bw.close();
            System.out.println("undone: " + undone +  " out of " + (page.size() - 2));
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private String toGitURL(String num, String probName) {
        StringBuilder name = new StringBuilder();
        boolean capital = true;
        // Camel Style problem name
        for (char ch : probName.toCharArray()) {
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
        String urlStr = GIT_PREFIX + "_" + getGitNumber(num) + "_"
                + name.toString() + GIT_SUFFIX;
        try {
            URL url;
            url = new URL(urlStr);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.setRequestMethod("HEAD");
            if (huc.getResponseCode() == HttpsURLConnection.HTTP_OK) {
                return "[" + probName + "](" + urlStr + ")";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        undone++;
        System.out.println(urlStr);
        return probName;
    }

    // add leading 0s to make all number have 3 digits
    private String getGitNumber(String num) {
        int len = num.length();
        StringBuilder res = new StringBuilder();
        for (int i = 3 - len; i > 0; i--) {
            res.append("0");
        }
        res.append(num);
        return res.toString();
    }

    private List<String> readInputFile() {
        List<String> page = new ArrayList<>();
        try {
            File file = new File(INPUT_FILE);
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

}
