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
 */
package _218_TheSkylineProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/** see test {@link _218_TheSkylineProblem.SolutionHeapTest } */
public class SolutionHeap {

    private class Edge {
        int x;
        int height;
        int type; // left edge is type 0, right edge is type 1

        public Edge(int x, int height, int type) {
            this.x = x;
            this.height = height;
            this.type = type;
        }

        @Override
        public String toString() {
            return "[" + x + "," + height + "," + type + "]";
        }
    }

    //TODO
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> res = new ArrayList<>();
        if (buildings.length == 0) {
            return res;
        }
        Queue<Edge> edges = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.x - e2.x;
            }
        });
        for (int i = 0; i < buildings.length; i++) {
            int[] triplet = buildings[i];
            edges.offer(new Edge(triplet[0], triplet[2], 0));
            edges.offer(new Edge(triplet[1], triplet[2], 1));
        }
        edges.offer(new Edge(0, 0, 0));
        edges.offer(new Edge(Integer.MAX_VALUE, 0, 1));

        while (edges.size() >= 2) {
            Edge e1 = edges.poll();
            Edge e2 = edges.peek();
            if (e1.type == 0 && e2.type == 0) {
                if (e1.height < e2.height) {
                    int[] key = { e2.x, e2.height };
                    res.add(key);
                }
            } else if (e1.type == 0 && e2.type == 1) {
                if (e1.height < e2.height) {
                    int[] key = { e2.x, e1.height };
                    res.add(key);
                }
            } else if (e1.type == 1 && e2.type == 1) {
                if (e1.height > e2.height) {
                    int[] key = { e1.x, e2.height };
                    res.add(key);
                }
            }
        }

        return res;
    }

}
