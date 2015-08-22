/**
 * Time : O(); Space: O()
 * @Tag : String
 * @Date: Jun 5, 2015
 *******************************************************************************
 * Description: 
 * 
 * Given an array of words and a length L, format the text such that each 
 * line has exactly L characters and is fully (left and right) justified. 
 * 
 * You should pack your words in a greedy approach; that is, pack as many 
 * words as you can in each line. Pad extra spaces ' ' when necessary 
 * so that each line has exactly L characters. 
 * 
 * Extra spaces between words should be distributed as evenly as possible. 
 * If the number of spaces on a line do not divide evenly between words, 
 * the empty slots on the left will be assigned more spaces than the slots on the right. 
 * 
 * For the last line of text, it should be left justified and no extra 
 * space is inserted between words. 
 * 
 * For example,
 *  words: ["This", "is", "an", "example", "of", "text", "justification."]
 *  L: 16. 
 *  Return the formatted lines as: 
 *  [ 
 *      "This    is    an", 
 *      "example  of text", 
 *      "justification.  " 
 *  ] 
 * Note: Each word is guaranteed not to exceed L in length.
 * 
 *******************************************************************************
 * {@link https://leetcode.com/problems/text-justification/ }
 */
package _068_TextJustification;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _068_TextJustification.SolutionTest } */
public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<String>();
        if (words.length == 0) {
            return result;
        }
        int lenOfLine = 0;
        int lenOfWords = 0;
        int wordCt = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() + lenOfLine > maxWidth) {
                // one line found, deal with this line
                result.add(processOneLine(words, index, maxWidth, lenOfWords,
                        wordCt));
                // a new line
                index = i;
                lenOfLine = word.length() + 1;
                lenOfWords = word.length();
                wordCt = 1;
            } else {
                // appending to current line
                lenOfLine += word.length() + 1;
                lenOfWords += word.length();
                wordCt += 1;
            }
        }

        // last line: left-justified and no extra spaces between words
        String line = words[index];
        for (int i = index + 1; i < words.length; i++) {
            line += " " + words[i];
        }
        line += getPadding(maxWidth - line.length());
        result.add(line);

        return result;
    }

    public String getPadding(int n) {
        String padding = "";
        for (int i = 0; i < n; i++) {
            padding += " ";
        }
        return padding;
    }

    public String processOneLine(String[] words, int index, int maxWidth,
            int lenOfWords, int wordCt) {
        int emptySpaces = maxWidth - lenOfWords;
        int paddingCt = wordCt == 1 ? 0 : emptySpaces / (wordCt - 1);
        int extras = emptySpaces - paddingCt * (wordCt - 1);
        String padding = getPadding(paddingCt);
        // construct one line
        String line = "";
        for (int j = 0; j < wordCt; j++) {
            if (j == 0) {
                // first word in line
                line = words[index];
                // extra padding added to left part
                if (wordCt == 1) {
                    line += getPadding(maxWidth - line.length());
                } else {
                    line += padding;
                }
            } else if (j > 0 && j == wordCt - 1) {
                // last word in line
                line += words[index + j];
            } else {
                line += words[index + j] + padding;
            }
            // try to use extra spaces as even as possible
            if (j != wordCt - 1 && extras > 0) {
                line += " ";
                extras--;
            }
        }
        return line;
    }

}
