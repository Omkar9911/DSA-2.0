

/*Excel Sheet Column Title
Solved
Easy
Topics
premium lock icon
Companies
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 */

package String;

public class excelSheetNum {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            char ch = (char) ('A' + (columnNumber % 26));
            sb.append(ch);

            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }


}


/*Example 1

Input:

columnNumber = 1

Steps:

1 - 1 = 0
0 % 26 = 0 → 'A'

Output:

"A"
Example 2

Input:

columnNumber = 28

Steps:

28 - 1 = 27
27 % 26 = 1 → 'B'
27 / 26 = 1
1 - 1 = 0
0 % 26 = 0 → 'A'

Reverse "BA" → "AB"

Output:

"AB"
Example 3

Input:

columnNumber = 701

Steps:

701 - 1 = 700
700 % 26 = 24 → 'Y'
700 / 26 = 26
26 - 1 = 25
25 % 26 = 25 → 'Z'

Reverse "YZ" → "ZY"

Output:

"ZY"
Complexity
Time: O(log26(n))
Space: O(log26(n))*/
