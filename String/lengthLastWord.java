
/* Length of Last Word
Solved
Easy
Topics
premium lock icon
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

package String;

public class lengthLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(' ');
        return s.length() - index - 1;
    }

}
