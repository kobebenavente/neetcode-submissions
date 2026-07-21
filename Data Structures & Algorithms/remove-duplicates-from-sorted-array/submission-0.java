class Solution {
    public int removeDuplicates(int[] nums) {
        

        /*

        [1,2,3,3,4]
               ^
                 ^

        two pointers
        move pointers together unless number before the right pointer is equal to the number before it 
        (meaning that it is a duplicate for the current number, so the number at the pointer is what needs to be replaced)


        */

        int left = 1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[left] = nums[i];
                left++;
            } 
        }

        return left;

    }
}