
/* Excel Sheet Column Number
Solved
Easy
Topics
premium lock icon
Companies
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 */

package String;


public class excelSheetCol {

    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {

            char c = columnTitle.charAt(i);
            int val = c - 'A' + 1; // 'A' -> 1, 'B' -> 2, ..., 'Z' -> 26
            result = result * 26 + val;
        }
        return result;
    }
}


/*Dry Run

For columnTitle = "AB":

Character	Value	Calculation	Result
A	1	0 * 26 + 1	1
B	2	1 * 26 + 2	28

Output:

28

For columnTitle = "ZY":

Character	Value	Calculation	Result
Z	26	0 * 26 + 26	26
Y	25	26 * 26 + 25	701

Output:

701
Complexity
Time: O(n)
Space: O(1)*/