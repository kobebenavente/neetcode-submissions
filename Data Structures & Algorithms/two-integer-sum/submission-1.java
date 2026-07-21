class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*

        goal: return an array of i,j such that nums[i] + nums[j] == target and i != j
        - only one solution
        - return smaller index first
        - indexes of i and j can not be the same

        brute force:
        for each number, check if all other numbers besides it add up to target
        o(n^2)

        check if our storage has the target - current number
        store what we've seen

        hashmap wher key = number and value = index

        for every int in nums:
        numNeeded = target - currentInt
        if hashmap contains numNeeded
        return new array {hashmap.get(numNeeded), currentIndex}

        */

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numNeeded = target - nums[i];
            if(map.containsKey(numNeeded)){
                return new int[]{map.get(numNeeded), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
