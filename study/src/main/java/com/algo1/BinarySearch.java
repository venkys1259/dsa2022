package com.algo1;
/* https://leetcode.com/problems/binary-search/
* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
* */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return bSearch(0,nums.length-1,target,nums);
    }

    private int bSearch(int low, int high,int target,int[] nums){
        int mid = (low+high)/2;
        if (nums[mid] == target) {
            return mid;
        }
        while(low <high) {
            if (nums[mid] < target) {
                return bSearch(mid + 1, high, target, nums);
            } else {
                return bSearch(low, mid, target, nums);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     int[] nums = {-1,0,3,5,9,12};
     int target = 12;
     BinarySearch binarySearch = new BinarySearch();
     System.out.println(binarySearch.search(nums,target));
    }
}
