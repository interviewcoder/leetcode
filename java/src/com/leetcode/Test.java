/**
 * File: src/com/leetcode/Test.java
 ***************************************************************************
 * Some supplements to assertion in Junit Test
 * 
 ***************************************************************************
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Test {

    /**
     * Asserts two lists are equals ignoring order of elements in list
     * 
     * @param actual actual list value
     * @param expected expected list value
     */
    public static <T> void assertEqualsIgnoreOrder(List<T> expected,
            List<T> actual) {
        List<String> act = toStringList(actual);
        List<String> exp = toStringList(expected);
        Collections.sort(act);
        Collections.sort(exp);
        assertEquals(exp, act);
    }

    // convert to a list of string in order to compare
    private static <T> List<String> toStringList(List<T> list) {
        List<String> result = new ArrayList<>();
        for (T l : list) {
            result.add(l.toString());
        }
        return result;
    }

    /**
     * Asserts two lists of array are equals ignoring order of elements in list
     * 
     * @param expected
     * @param actual
     */
    public static <T> void assertArrayEqualsIgnoreOrder(List<T[]> expected,
            List<T[]> actual) {
        List<String> act = arrayToStringList(actual);
        List<String> exp = arrayToStringList(expected);
        Collections.sort(act);
        Collections.sort(exp);
        assertEquals(exp, act);
    }

    private static <T> List<String> arrayToStringList(List<T[]> list) {
        List<String> result = new ArrayList<>();
        for (T[] l : list) {
            result.add(Arrays.toString(l));
        }
        return result;
    }

}
