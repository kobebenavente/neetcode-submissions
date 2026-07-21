class Solution {
    public int searchInsert(int[] nums, int target) {
        /*

        - given a sorted array (increasing)
        - give a target value
        - GOAL: return index where target is found, and if not, return index 
        WHERE IT WOULD BE IF IT WERE INSERTED IN ORDER!


        1
        do binary search as normal
        [-1,0,2,4,6,8]
                ^
                ^

        midpoint = 2

        if left + 1 == right || left == right:
        if target > nums[right]:
         return right + 1;
        else:
         return left + 1;

         target = 6
          0 1 2 3 4
         [1,3,5,7,9]
              ^
            ^
         midpoint = 2

        */

        int left = 0;
        int right = nums.length - 1;
        while(left <= right){

            if(left == right){
                if(nums[left] == target){
                    return left;
                } else if(target > nums[left]){
                    return left + 1;
                } else {
                    return left;
                }
            }
            int midpoint = (left + right) / 2;

            if(nums[midpoint] == target){
                return midpoint;
            } 
            if(target < nums[midpoint]){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return left;
    }
}