class Solution {
    public int[] getConcatenation(int[] nums) {
        //goal: create an array that is 2x the size of nums and new elements are repeated sequence
        // of nums.

        //create new int array of size nums.length * 2
        //store variable of nums.length which will serve as counter of when to repeat
        // int j = 0; <-- this will count up to when nums is complete and reset for the new half of the
        // array.
        //if(i == nums.length): j = 0

        int[] result = new int[nums.length * 2];
        int j = 0;
        for(int i = 0; i<result.length ; i++){
            if(j == nums.length){
                j = 0;
            }

            result[i] = nums[j];
            j++;
        }

        return result;

        //DRY RUN: [1,4,1,2]
        // result = int[4 * 2 = 8]
        // result = [_,_,_,_,_,_,_,_]
        // j = 0
        // result[0] = nums[0]
        // j++ --> j = 1
        //
    }
}