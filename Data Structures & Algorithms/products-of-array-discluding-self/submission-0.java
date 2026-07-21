class Solution {
    public int[] productExceptSelf(int[] nums) {
        // result should be an array where each value is the product of all other values ]
        // create a variable (restricted) which holds the index of the value we will be ignoring for 
        // multiplication.
        // current product = 1;
        // for(int i = 0; i < nums.length ; i++)
        // for(int j = 0; j < nums.length ; j++){
        // if( j != i){
        // current product = current product * nums[j];
        // after j loop:
        // nums[i] = current product
        // current product = 1;
        int[] result = new int[nums.length];

        int currentProduct = 1;
        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    currentProduct = currentProduct * nums[j];
                }
            }
            result[i] = currentProduct;
            currentProduct = 1;
        }
        return result;
    }
}  
