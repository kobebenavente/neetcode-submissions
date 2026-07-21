class Solution {
    public int majorityElement(int[] nums) {
        /*

        goal: return the majority element of an integer array nums
        - a majority element appears more than n / 2 times (more than half of the elements in nums)

        brute force: 
        hashmap for each numebr where key = element and value = count, as you add, check if count is greater than n / 2
        o(n) space and o(1) time complexity

        */

        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if(count.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return 0;
    }
}