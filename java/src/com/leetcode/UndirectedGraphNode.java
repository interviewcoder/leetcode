package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    public static boolean isSameGraph(UndirectedGraphNode node1,
            UndirectedGraphNode node2) {
        // whether two nodes have been compared
        Map<UndirectedGraphNode, List<UndirectedGraphNode>> compareMap = new HashMap<>();
        return isSameGraph(node1, node2, compareMap);
    }

    private static boolean isSameGraph(UndirectedGraphNode node1,
            UndirectedGraphNode node2,
            Map<UndirectedGraphNode, List<UndirectedGraphNode>> compareMap) {
        if (compareMap.containsKey(node1) && compareMap.get(node1).contains(node2)) {
            // loop up in memo
            return true;
        } else if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            if (node1.label == node2.label
                    && node1.neighbors.size() == node2.neighbors.size()) {
                // update map
                if (!compareMap.containsKey(node1)) {
                    compareMap.put(node1, new ArrayList<>(Arrays.asList(node2)));
                } else {
                    compareMap.get(node1).add(node2);
                }
                for (int i = 0; i < node1.neighbors.size(); i++) {
                    if (!isSameGraph(node1.neighbors.get(i),
                            node2.neighbors.get(i), compareMap)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

}
