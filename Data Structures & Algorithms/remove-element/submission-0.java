class Solution {
    public int removeElement(int[] nums, int val) {
        // return the number of elements remaining in the array after removing val

        Map<Integer, Integer> validNums = new HashMap<>();

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                validNums.put(nums[i], validNums.getOrDefault(nums[i], 0) + 1);
                count++;
            }
        }

        int index = 0;

        for(Map.Entry<Integer, Integer> entry : validNums.entrySet()){
            for(int i = 0; i<entry.getValue() ; i++){
                nums[index] = entry.getKey();
                index++;
            }
        }

        return count;
       

    }
}