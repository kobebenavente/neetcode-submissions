class Solution {
    public boolean hasDuplicate(int[] nums) {
        Boolean check = false; 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return check;
    }
}