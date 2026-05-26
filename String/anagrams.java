/*

Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e., if they contain the same characters with the same frequencies.

        Examples:

        Input: s1 = “geeks”  s2 = “kseeg”
        Output: true
        Explanation: Both the string have same characters with same frequency. So, they are anagrams.

        Input: s1 = "allergy", s2 = "allergyy"
        Output: false
        Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.

        Input: s1 = "listen", s2 = "lists"
        Output: false
        Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
*/


package String;

import java.util.Arrays;

public class anagrams {

    public boolean areAnagrams(String s1, String s2) {


        if(s1.length() != s2.length()){
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }
}
