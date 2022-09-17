
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

input
a=[1,2,3]
a=[9,9,9]
a=[9]
output
[1,2,4]
[1,0,0,0]
[1,0]

class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length-1; //taking last index value
        while(l>=0)
        {
            if(digits[l]==9) //check wheather it is equal to 9 or not
            {
                digits[l]=0; //making the length-1 pos value to 0
            }
            else
            {
                digits[l] +=1; //adding 1 in the length-1 pos value
                return digits;
            }
                l--;
        }
        int[] arr =new int[digits.length + 1]; //creating new array for the test case of[9,9,9] it store [0] index value as 1
        arr[0] = 1;
        return arr; //return the arr;
    }
}