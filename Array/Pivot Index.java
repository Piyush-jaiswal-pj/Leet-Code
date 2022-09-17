Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Input: nums = [1,7,3,6,5,6]
Output: 3
Input: nums = [1,2,3]
Output: -1

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0


SOLUTION

class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0; 
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];//Sum of array
        }
        int left=0; //
        int right =sum;
        for(int j=0;j<nums.length;j++)
        {
            right = right - nums[j];//correct right shift

            if(left==right){
                return j;
            }
            left = left+ + nums[j]; //correcting left shift
        }
        return -1;
    }   
}