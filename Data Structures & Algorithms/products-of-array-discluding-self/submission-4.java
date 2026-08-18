class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        nums = [2,2,4,6]
                    ^
                postfix = 16

                [1,2,4,16]
                48,48,24,16]
                  
                48,24,12,8
        */

        int[] solution = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length ; i++){
            if(i == 0){
                solution[i] = prefix;
            } else{
                solution[i] = prefix * nums[i - 1];
                prefix = solution[i];
            }
        }
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0 ; i--){
            if(i == nums.length - 1){
                postfix = nums[i];
                continue;
            } else {
                solution[i] =  postfix * solution[i];
                postfix = postfix * nums[i];
            }
        }
        return solution;
    }
}  
