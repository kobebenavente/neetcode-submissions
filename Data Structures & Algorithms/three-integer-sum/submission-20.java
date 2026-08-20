class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*

        -given integer array nums
        -return all triplets where nums i,j,k == 0
        -i, j, and k should al be distinct
        [-1,-1,0,1,2,4]
          ^
               ^
                     ^
        */

        List<List<Integer>> solution = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int currentNum = nums[i];
            
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                if(currentNum + nums[left] + nums[right] == 0){
                    solution.add(new ArrayList<>(List.of(currentNum, nums[left], nums[right])));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else {
                    if(currentNum + nums[left] + nums[right] > 0){
                        right--;
                    } else{
                        left++;
                    }
                }
            }
        }
        return solution;
    }
}
