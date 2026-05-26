
/*Given a string s, the task is to check if it is palindrome or not.

        Example:

Input: s = "abba"
Output: true
Explanation: s is a palindrome

Input: s = "abc"
Output: false
Explanation: s is not a palindrome*/



public class palindromeString {

    // for String
    boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    //for num

    boolean isPalindrome(int num) {

        String s = String.valueOf(num);

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
