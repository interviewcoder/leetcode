/**
 * Time : O(N); Space: O(N)
 * @tag : Array
 * @by  : Steven Cooks
 * @date: 04.29.2015
 *************************************************************************
 * Description:
 * 
 * Given an unsorted array of integers, find the length of the longest 
 * consecutive elements sequence. 
 * 
 * For example, Given [100, 4, 200, 1, 3, 2], 
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its 
 * length: 4. 
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 *************************************************************************
 * {@link https://leetcode.com/problems/longest-consecutive-sequence/ }
 */
package _128_LongestConsecutiveSequence;

import java.util.Map;
import java.util.HashMap;

/** see test {@link _128_LongestConsecutiveSequence.SolutionTest } */
public class Solution {

    /** @see _124_BinaryTreeMaximumPathSum.Solution */
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Map<Integer, Bound> rangeMap = new HashMap<Integer, Bound>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!rangeMap.containsKey(num)) {
                int maxRangeToThisNumber = 1;
                int maxRangeFromThisNumber = 1;
                // can this number be a right boundary of a range ?
                if (rangeMap.containsKey(num - 1)) {
                    maxRangeToThisNumber += rangeMap.get(num - 1).maxRangeAsRightBound;
                }
                // can this number be a left boundary of a range?
                if (rangeMap.containsKey(num + 1)) {
                    maxRangeFromThisNumber += rangeMap.get(num + 1).maxRangeAsLeftBound;
                }
                int maxRangeIncludeThisNumber = maxRangeToThisNumber
                        + maxRangeFromThisNumber - 1;

                // update range map
                Bound bound = new Bound(maxRangeFromThisNumber,
                        maxRangeToThisNumber);
                rangeMap.put(num, bound);

                // num is not the right boundary of max range including num
                if (maxRangeFromThisNumber != 1) {
                    // update the range of number at the right bound
                    int rightEnd = maxRangeFromThisNumber + num - 1;
                    Bound boundRight = rangeMap.get(rightEnd);
                    boundRight.maxRangeAsRightBound = maxRangeIncludeThisNumber;
                    rangeMap.put(rightEnd, boundRight);
                }
                if (maxRangeToThisNumber != 1) {
                    int leftEnd = num - maxRangeToThisNumber + 1;
                    Bound boundLeft = rangeMap.get(leftEnd);
                    boundLeft.maxRangeAsLeftBound = maxRangeIncludeThisNumber;
                    rangeMap.put(leftEnd, boundLeft);
                }

                // update global max
                result = Math.max(result, maxRangeIncludeThisNumber);
            }
        }

        return result;
    }

    public class Bound {
        public int maxRangeAsRightBound = 0;
        public int maxRangeAsLeftBound = 0;

        public Bound(int _maxRangeAsLeftBound, int _maxRangeAsRightBound) {
            maxRangeAsLeftBound = _maxRangeAsLeftBound;
            maxRangeAsRightBound = _maxRangeAsRightBound;
        }
    }

}
