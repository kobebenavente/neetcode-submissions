class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap where key = index and value = number
        // before putting index and number in hashmap, check if it contains the target
        // - the number. if it does, return array of two indexes

        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[] {hashMap.get(target-nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }

        

        return null;
    }
}
