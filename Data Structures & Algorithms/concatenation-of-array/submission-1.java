class Solution {
    public int[] getConcatenation(int[] nums) {
        /*

        - Create an array ans of length 2n 
         - n = length of nums
        - ans[i] == nums[i] and ans[i + n] == nums[i]

        - for loop that starts at i = 0
        - for each iteration ans[i + n] = nums[i]

        */

        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < ans.length; i++){
            if(i < nums.length){
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }

        return ans;
    }
}