/**
 * Time : O(NlgN) ; Space: O()
 * @tag : Divide and Conquer; Heap
 * @by  : Steven Cooks
 * @date: Sep 18, 2015
 ***************************************************************************
 * Description:
 *
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/the-skyline-problem/ }
 * {@link http://www.geeksforgeeks.org/divide-and-conquer-set-7-the-skyline-problem/ }
 * {@link https://leetcode.com/discuss/40963/share-my-divide-and-conquer-java-solution-464-ms }
 */
package _218_TheSkylineProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** see test {@link _218_TheSkylineProblem.SolutionTest } */
public class Solution {

    // divide and conquer
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> res = new ArrayList<>();
        if (buildings.length == 0) {
            return res;
        }
        int p = 0;
        int q = buildings.length - 1;
        return recurSkyline(buildings, p, q);
    }

    // construct sky line for buildings[p : q]
    private LinkedList<int[]> recurSkyline(int[][] buildings, int p, int q) {
        if (p == q) {
            LinkedList<int[]> skyline = new LinkedList<>();
            skyline.add(new int[] { buildings[p][0], buildings[p][2] });
            skyline.add(new int[] { buildings[p][1], 0 });
            return skyline;
        } else {
            int mid = p + (q - p) / 2;
            return merge(recurSkyline(buildings, p, mid), recurSkyline(buildings, mid + 1, q));
        }
    }

    // merge sky line 1 and sky line 2
    private LinkedList<int[]> merge(LinkedList<int[]> s1, LinkedList<int[]> s2) {
        LinkedList<int[]> res = new LinkedList<>();
        int h1 = 0; // height from s1
        int h2 = 0; // height from s2
        while (s1.size() > 0 && s2.size() > 0) {
            // key point is { x, h }
            int x = 0; int h = 0;
            if (s1.getFirst()[0] < s2.getFirst()[0]) {
                x = s1.getFirst()[0];
                h1 = s1.getFirst()[1];
                h = Math.max(h1, h2);
                s1.removeFirst();
            } else if (s1.getFirst()[0] > s2.getFirst()[0]) {
                x = s2.getFirst()[0]; 
                h2 = s2.getFirst()[1];
                h = Math.max(h1, h2);
                s2.removeFirst();
            } else {
                x = s1.getFirst()[0];
                h1 = s1.getFirst()[1];
                h2 = s2.getFirst()[1];
                h = Math.max(h1, h2);
                s1.removeFirst();
                s2.removeFirst();
            }
            if (res.size() == 0 || h != res.getLast()[1]) {
                // ignore key points that at the same level
                res.add(new int[] { x, h });
            }
        }
        res.addAll(s1);
        res.addAll(s2);
        return res;
    }

}
