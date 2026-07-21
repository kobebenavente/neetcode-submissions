class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // arrays.sort()
        // for each element (i) in nums:
        // for each element after i in nums (j)
        // [-4,-1,-1,0,1,2]

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 3){
            if(nums[0] + nums[1] + nums[2] == 0){
                result.add(Arrays.asList(nums[0], nums[1], nums[2]));
                return result;
            }
        }
        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    if(right!= nums.length-1 && left != i+1 &&
                        nums[left] == nums[left-1] && nums[right] == nums[right+1]){
                        left++;
                        right--;
                    } else{
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                } else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                } else{
                    right--;
                }
            }
        }
        return result;
    }
}
