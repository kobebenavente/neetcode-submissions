class Solution {
    public int search(int[] nums, int target) {
        /*

        - distinct integers (no duplicates)
        - sorted in increasing order
        - GOAL: find target and return its index
            - if target does not exist, return -1
        
        - brute force approach would be to simpoly sort thorugh the array until you find the target, and if not, return 1
            - this would take o(n) time
        - better approach would be to use binary search
        - take the midpoint of the array. if the target is less than the midpoint, greater than, or it is found, return
        or choose side accordingly
        - repeat this until we find the target

        found = -1

        midpoint = right index - left index/2
        if midpoint == target:
         found = midpoint

        */

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int midpoint = (left + right)/2;

            if(nums[midpoint] == target){
                return midpoint;
            } 

            if(target < nums[midpoint]){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }

        return -1;
    }
}
