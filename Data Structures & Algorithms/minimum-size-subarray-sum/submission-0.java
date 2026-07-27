class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        /*

        -Given array of positive integers "nums"
        -Given positive integer target
        -Return the MINIMAL LENGTH of a subarray where its sum is >= target
        -If no subarray return 0 

        int counter = 0
        int best = 3

        currSum = 11
        bestMinLength = 3
        l = 1
        r = 4

        [2,1,5,1,5,3]
             l
                 r
        */

        int currSum = 0;
        int bestMinLength = 0;
        int l = 0;
        for(int r = 0; r < nums.length ; r++){
            currSum += nums[r];
            while(currSum >= target && l <= r){
                if(bestMinLength == 0){
                    bestMinLength = r - l + 1;
                } else {
                    bestMinLength = Math.min(bestMinLength, r - l + 1);
                }
                currSum -= nums[l];
                l++;
            }
        }
        return bestMinLength;
    }
}