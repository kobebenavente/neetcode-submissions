class Solution {
    public int[] productExceptSelf(int[] nums) {

        //initial nums array = [1,2,4,6]
        //[1,1,2,8] <- prefixes for each element
        //[48,24,12,8]

        //[1,2,8,48] <- pre
        //[48,48,24,6] <- post
        //[48, 24, 12, 8 ]

        //for each integer in the array, replace nums[i] with the product prefix.
        //next, starting from the end of the array and traversing left, multiply each
        //number by the postfix product.
        
        //why this approach? because when you are singling out an element and 
        //multiplying all of the other numbers in the array, 

        int[] solution = new int[nums.length];
        int prefix = 1;
        solution[0] = prefix;
        prefix = prefix * nums[0];
        for(int i = 1; i < nums.length; i++){
            solution[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        solution[nums.length-1] = solution[nums.length-1] * postfix;
        postfix = postfix * nums[nums.length-1];
        for(int i = nums.length-2 ; i >= 0; i--){
            solution[i] = postfix * solution[i];
            postfix = postfix * nums[i];
        }

        return solution;
    }
}  
