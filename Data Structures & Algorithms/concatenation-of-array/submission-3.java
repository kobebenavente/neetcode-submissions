class Solution {
    public int[] getConcatenation(int[] nums) {
        /*

        - Create an array ans of length 2n 
         - n = length of nums
        - ans[i] == nums[i] and ans[i + n] == nums[i]

        - for loop that starts at i = 0
        - for each iteration ans[i + n] = nums[i]

        [1,2,3,4]

        n = 4
        0 % 4 =  

        */

        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < ans.length; i++){
            ans[i] = nums[i % nums.length];
        } 

        return ans;
    }
}