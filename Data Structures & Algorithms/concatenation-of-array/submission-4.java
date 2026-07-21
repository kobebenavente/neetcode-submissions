class Solution {
    public int[] getConcatenation(int[] nums) {
        /*

        -Given an int array nums of length n
        
        GOAL: 
        -Create and return an array ans that is twice the size of nums where 
        ans[i] = nums[i] and ans[i+n] = nums[i]

        pointer at beginning of ans (int nonDuplicatePointer = 0)
        pointer at beginning of duplicated portion of ans (int duplicatePointer = nums.length)

        for every element in nums starting at i = 0:
            ans[nonDuplicatePointer] = nums[i]
            ans[duplicatePointer] = nums[i]
            interate both pointer by + 1;



        */

        int[] ans = new int[nums.length * 2];
        int left = 0;
        int right = nums.length;

        for(int i = 0; i<nums.length; i++){
            ans[left] = nums[i];
            ans[right] = nums[i];
            left++;
            right++;
        }
        return ans;
    }
}