class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //dry run:
        //[1,2,3,1]
        //r = 0
        //while r < 4
        //valid window = 3
        //r = 1, valid window = 2
        //r = 2, va;id window = 1
        //r = 3, valid window = 0

        int l = 0;
        int r = 0;
        while(r < nums.length){
            Set<Integer> hashSet = new HashSet<>();
            int validWindow = k;
            while(r < nums.length && validWindow >= 0){
                r++;
                validWindow--;
            }
            while(l < r){
                if(hashSet.contains(nums[l])){
                    return true;
                }
                hashSet.add(nums[l]);
                l++;
            }

        }
        return false;
    }
}