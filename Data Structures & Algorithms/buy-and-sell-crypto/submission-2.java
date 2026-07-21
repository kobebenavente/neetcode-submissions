class Solution {
    public int maxProfit(int[] prices) {
        int highestSellingPrice = 0;

        int left = 0;
        int right = 1;

        // dry run:
        // [10,1,5,6,7,1,5]
        // while(right < 7)
        // prices[0] = 10, prices[0] = 1
        // left = 1, right = 2
        // prices[1] = 1, prices[2] = 5
        // highestSellingPrice = 5 - 1 = 4
        // 

        while(right < prices.length){
            if(prices[right] > prices[left]){
                int sellingPrice = prices[right] - prices[left];
                highestSellingPrice = Math.max(highestSellingPrice, sellingPrice);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return highestSellingPrice;
    }
}
