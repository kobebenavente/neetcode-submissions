class Solution {
    public int maxProfit(int[] prices) {
        //what makes the next number valid?:
        //if its greater than the one before it. 
        // i.e. 1, 6, 5 , 4, 7, 9, 12
        //.           ^ not valid because its not greater thjan the previous number. 
        // brute force: iterate through each element in prices array. 
        //for each element, do another for loop for each element after the current prices[i]. 
        //if(j == i+1 && nums[j] < nums[i]): continue (break)
        //if(j > i+1 && nums[j] > nums[i]):
        //if(nums[j] > nums[j-1]):
        //sellingPrice = nums[j] - nums[i]
        //if sellingPrice > highestSellingPrice:
        // highestSellingPrice = sellingPrice 

        int highestSellingPrice = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(j == i+1 && prices[j] < prices[i]){
                    break;
                } 
                if(prices[j] > prices[i]){
                    int sellingPrice = prices[j] - prices[i];
                    if(sellingPrice > highestSellingPrice){
                        highestSellingPrice = sellingPrice;
                    }
                } 
            }
        }
        
        return highestSellingPrice;

    }
}
