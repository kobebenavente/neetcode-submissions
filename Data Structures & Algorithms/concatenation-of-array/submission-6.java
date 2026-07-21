class Solution {
    public int[] getConcatenation(int[] nums) {
        /*

        -nums of length n
        -ans of length 2n
        -ans[i] == nums [i]
        - ans[i+n] == nums[i]

        create an array of size nums.length * 2

        [1,2,3]
        size = 3
        [0,0,0,0,0,0]

        */

        int[] solution = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            solution[i] = nums[i];
            solution[i+nums.length] = nums[i];
        }
        return solution;
    }
}