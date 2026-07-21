class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /*

        - Given an integer array piles
        - piles[i] = the number of bananas at the ith pile.
        - h = number of hours we have to eat all the bananas
        - can determine our bananas-per-hour eating rate of k
        - each hour, choose a pile of bananas and eat k bananas from that pile
        - if the pile still has bananas (aka less than k), you can finish it, however...
        - YOU CAN NOT EAT FROM ANOTHER PILE IN THE SAME HOUR
        
        -GOAL: return the MINIMUM EATING RATE k to satisfy eating all of the bananas within h hours

        [1,2,3,4] h = 9

       4/3
        */

        Arrays.sort(piles);

        int left = 1;
        int right = piles[piles.length - 1];

        while(left <= right){

            int midpoint = left + (right - left) / 2;

            int count = 0;

            for(int i = 0; i < piles.length; i++){
                count += Math.ceilDiv(piles[i], midpoint);
                if(count > h){
                    break;
                }                
            }
            if(count > h){
                left = midpoint + 1;
            } else if (count < h){
                right = midpoint - 1;
            } else {
                right = midpoint - 1;
            }
        } 
        return left;
    }
}
