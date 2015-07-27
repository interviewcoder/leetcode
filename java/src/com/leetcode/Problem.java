/**
 * File: Problem.java
 ************************************************************************
 * Helper class for Leetcode.java
 * 
 ************************************************************************
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to wrap problem in leetcode online judge, and is used by {@link com.leetcode.Leetcode}
 */
public class Problem implements Comparable<Problem> {

    private final int number; // problem number in leetcode
    private final String title; // title of problem
    private final String url; // url to this problem
    private String acceptance = "";
    private final String difficulty;
    private final String note; // note about this problem
    private String gitUrl = "";
    private List<String> tags = new ArrayList<>();

    /**
     * Sets the tags for this problem
     * 
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    // Builder Pattern for constructor
    public static class Builder {
        // Required parameters
        private final int number;
        private final String url;

        // Optional parameters - initialized to default values
        private String title = "";
        private String acceptance = "";
        private String note = "";
        private String difficulty = "Easy";
        private List<String> tags = new ArrayList<>();

        public Builder(int number, String url) {
            this.number = number;
            this.url = url;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder acceptance(String val) {
            acceptance = val;
            return this;
        }

        public Builder tags(List<String> val) {
            tags = val;
            return this;
        }

        public Builder difficulty(String val) {
            difficulty = val;
            return this;
        }


        public Builder note(String val) {
            note = val;
            return this;
        }

        public Problem build() {
            return new Problem(this);
        }
    }

    private Problem(Builder builder) {
        number = builder.number;
        title = builder.title;
        url = builder.url;
        difficulty = builder.difficulty;
        setAcceptance(builder.acceptance);
        note = builder.note;
        tags = builder.tags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(getNumber());
        sb.append("] ");
        sb.append(getTitle());
        return sb.toString();
    }

    @Override
    public int compareTo(Problem prob) {
        return number - prob.number;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String url) {
        gitUrl = url;
    }
    
    public static String getMDHeader() {
        return "| # | Problem | Difficulty | Tags | Note |"; 
    }
    
    public static String getMDFormat() {
        return "| :---: | ---- | ---- | ---- | ----- |";
    }

    /**
     * 
     * @return string in mark down format
     */
    public String toMDformat() {
        String delim = " | ";
        StringBuilder strBuilder = new StringBuilder("| ");
        strBuilder.append(getGitNumber()).append(delim)
            .append(getMDTitle()).append(delim)
            .append(difficulty).append(delim) 
            .append(getMDTags()).append(delim)
            .append(note).append(delim);
        return strBuilder.toString();
    }

    // add emphasis symbol around each tag
    private String getMDTags() {
        if (tags.size() == 0) {
            return "You need buy that book ";
        }
        StringBuilder tagBuilder = new StringBuilder();
        for (String tag : tags) {
            tagBuilder.append("`" + tag + "` ");
        }
        return tagBuilder.toString(); 
    }

    // add git solution url to title
    private String getMDTitle() {
        if (gitUrl.equals("")) {
            // no solution in git
            return title;
        } else {
            // add ref link to title
            return "[" + title + "](" + gitUrl + ")";
        }
    }

    // add leading 0s to make all number have 3 digits
    private String addTo3Digits(String num, int digits) {
        int len = num.length();
        StringBuilder res = new StringBuilder();
        for (int i = 3 - len; i > 0; i--) {
            res.append("0");
        }
        res.append(num);
        return res.toString();
    }

    public String getGitNumber() {
        return addTo3Digits(number + "", 3);
    }

    /**
     * @return the acceptance
     */
    public String getAcceptance() {
        return acceptance;
    }

    /**
     * @param acceptance the acceptance to set
     */
    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

}
