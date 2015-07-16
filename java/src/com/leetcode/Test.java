/**
 * File: src/com/leetcode/Test.java
 ********************************************
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Test {

    /**
     * Asserts two list are equals ignoring order of elements in list
     * 
     * @param actual actual list value
     * @param expected expected list value
     */
    public static <T> void assertEqualsIgnoreOrder(List<T> expected, List<T> actual) {
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

}
