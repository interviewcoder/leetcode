/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Aug 12, 2015
 ***************************************************************************
 * Description:
 *
 * 
 ***************************************************************************
 * {@link }
 */
package com.leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper {

    public static List<String> readInput(String filename) {
        List<String> res = new ArrayList<>();
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                res.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }

    public static List<List<String>> readListInput(String filename) {
        List<List<String>> res = new ArrayList<>();
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                // skip "[" and "]"
                List<String> list = Arrays.asList(line.substring(1, line.length() - 1));
                res.add(list);
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }

    public static void writeOutput(String filename, List<String> contents) {
        File file = new File(filename);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String line : contents) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void writeListOutput(String filename, List<List<String>> contents) {
        File file = new File(filename);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (List<String> list : contents) {
                bw.write(list.toString());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
