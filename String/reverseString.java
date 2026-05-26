
/*
Given a string s, reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.

        Examples:

Input: s = "GeeksforGeeks"
Output: "skeeGrofskeeG"
Explanation : The first character G moves to last position, the second character e moves to second-last and so on.

Input: s = "abdcfe"
Output: "efcdba"
Explanation: The first character a moves to last position, the second character b moves to second-last and so on.
*/



        package String;

public class reverseString {


    public String reverseStr (String s){

        StringBuilder res = new StringBuilder();

        for (int i= s.length()-1; i>=0; i--){
            res.append(s.charAt(i));
        }


        return res.toString();
    }


}
