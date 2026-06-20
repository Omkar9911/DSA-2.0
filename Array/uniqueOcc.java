
/* Unique Number of Occurrences
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/

package Array;

import java.util.Arrays;
import java.util.HashSet;

public class uniqueOcc {
    public boolean uniqueOccurrences(int[] arr) {

        Arrays.sort(arr);

        HashSet<Integer> set = new HashSet<>();

        int occ = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                occ++;
            } else {
                if (set.contains(occ)) {
                    return false;
                }
                set.add(occ);
                occ = 1;
            }
        }


        if (set.contains(occ)) {
            return false;
        }

        return true;
    }
}
