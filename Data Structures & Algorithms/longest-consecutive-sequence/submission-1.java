class Solution {
    public int longestConsecutive(int[] nums) {
        // GOAL: find the length of the longest consecutive sequence of elements that can
        // be formed. 
        // Numbers do not have to be in order.

        //what makes a number the start of a sequence? if no other number directly before it (n-1) exists
        // in the array. 

        // int solution = 1;
        //put all values into a hashmap
        // for(int i = 0; i < nums.length ; i++):
        // if hashmap does not contain num[i - 1]:
        // j = num[i]
        // counter = 0;
        // while(hashmap contains num[j]):
        // counter ++
        // j++
        
        //once while loop completes: 
        // if counter > solution: solution = counter;
        // counter = 0;
        //j = 0;
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> hashSet = new HashSet<>();

        for(int n : nums){
            hashSet.add(n);
        }

        int solution = 1;

        for(int i = 0; i < nums.length; i++){
            if(!hashSet.contains(nums[i] - 1)){
                int j = nums[i];
                int counter = 0;
                while(hashSet.contains(j)){
                    counter++;
                    j++;
                }
                if(counter > solution){
                    solution = counter;
                }
            }
        }
        return solution;

    }
}
