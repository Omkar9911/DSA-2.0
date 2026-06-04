/*

Find All Duplicates in an Array
        Solved
        Medium
        Topics
        premium lock icon
        Companies
        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

        You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output



        Example 1:

        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]
        Example 2:

        Input: nums = [1,1,2]
        Output: [1]
        Example 3:

        Input: nums = [1]
        Output: []
*/




package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class finaAllDuplicates {



    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int i = 0; i < nums.length; i++ ){
            if(set.contains(nums[i])){
                duplicates.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }

        return duplicates;

    }
}
