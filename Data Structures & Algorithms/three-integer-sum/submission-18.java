class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> solution = new ArrayList<>();

        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    solution.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                } else if(sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }

        return solution;

    }
    /*
    [-1,0,1,2,-1,-4]
    [-4,-1,-1,0,1,2]

    [-2,0,0,2,2]



    sort the array,
    for every value, use two pointers to check all other values to see if it adds up to 0
    */
    




}
