/**
 * Time : O(N^2); Space: O()
 * @Tag : Hash Table
 * @Date: May 11, 2015
 * @By  : Steven Cooks
 */
package _036_ValidSudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SolutionBad {
    public boolean isValidSudoku(char[][] board) {
        Map<List<Integer>, Set<Integer>> digitMap = new HashMap<List<Integer>, Set<Integer>>();

        for (int i = 0; i < 9; i++) {
            // for each line
            digitMap.put(new ArrayList<Integer>(Arrays.asList(0, i)),
                    new HashSet<Integer>());
            // for each column
            digitMap.put(new ArrayList<Integer>(Arrays.asList(1, i)),
                    new HashSet<Integer>());
            // for each box
            digitMap.put(new ArrayList<Integer>(Arrays.asList(2, i)),
                    new HashSet<Integer>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                // '.' is placeholder for no digit filled there
                if (ch != '.') {
                    int digit = ch - '0';
                    // check this line
                    if (digitMap.get(Arrays.asList(0, i)).contains(digit)
                            || digitMap.get(Arrays.asList(1, j))
                                    .contains(digit)
                            || digitMap
                                    .get(Arrays.asList(2, i / 3 * 3 + j / 3))
                                    .contains(digit)) {
                        return false;
                    }

                    Set<Integer> digits;
                    digits = digitMap.get(Arrays.asList(0, i));
                    digits.add(digit);
                    digitMap.put(Arrays.asList(0, i), digits);

                    digits = digitMap.get(Arrays.asList(1, j));
                    digits.add(digit);
                    digitMap.put(Arrays.asList(1, j), digits);

                    digits = digitMap.get(Arrays.asList(2, i / 3 * 3 + j / 3));
                    digits.add(digit);
                    digitMap.put(Arrays.asList(2, i / 3 * 3 + j / 3), digits);

                }
            }

        }

        return true;
    }

}
