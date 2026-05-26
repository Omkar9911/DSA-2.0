
/*Given two strings s1 and s2 of equal length, determine whether s2 is a rotation of s1.
A string is said to be a rotation of another if it can be obtained by shifting some leading characters of the original string to its end without changing the order of characters.

Examples:

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

        Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.

        Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.*/



package String;

public class rotationStr {

    boolean isRoration (String s1, String s2){

        int n = s1.length();

        // generate and check all possible rotations of s1
        for (int i = 0; i < n; ++i) {

            // if current rotation is equal to s2 return true
            if (s1.equals(s2)) {
                return true;
            }

            // Right rotate s1
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;

    }




}
