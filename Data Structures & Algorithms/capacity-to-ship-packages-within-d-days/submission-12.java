class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        /*

        - Conveyor belt has packages that must be shipped within the given int days
        - The ith package on the conveyer belt has a weight of weights[i]
        - Every day, packages are loaded on the ship in the order given by weights
        - NOT ALLOWED TO LOAD MORE THAN THE MAX WEIGHT CAPACITY OF THE SHIP
        
        -GOAL: return the lowest weight capacity of the ship

        -we know that the lowest potential ship weight capacity is equal to the highest weight on the conveyor belt 
         -why? cause if we pick something lower, we wouldnt be able to load the higher weight to begin with
         - this gives us a lower bound (hinting at the potential use of a binary search)\
         - could there be an upper bound? 
          - yes. the highest possible weight capacity would be all the weights added up (this would be possible if theres only 1 day)
         - with those bounds in mind, we can use binary search to find/test varying capacities and find the lowest possible one
         - 

         [2,4,6,1,3,10] , days = 4

         [10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26]

         17
         currDays = 0
         currWeight = 16

         int currLowestCapacity



         while left <= right:
          testedCapacity = (left + right) / 2
          set currDays = 0
          currWeight = 0
          for every weight in weights:
           currWeight += weight
           if currWeight > testedCapacity:
            days++
            currWeight = weight
          if currDays > days:
           left = midpoint + 1;
          else
           right = midpoint - 1;
           if tested capacity is less than current lowest capacity:
            set current lowest capacity to tested capacity


            left = 5
            right = 19
            currLowestCapacity = 19
            weights=[1,5,4,4,2,3]

            5 + 19 / 2 = 

        */


        int left = 0;
        int right = 0;

        for(int i = 0; i< weights.length; i++){
            right += weights[i];
            if(weights[i] > left){
                left = weights[i];
            }
        }

        
        int currLowestCapacity = right;


        /*
        i = 5
        currWeight = 9 
        currDays = 1
                   0  1  2  3  4  5
        weights = [1, 5, 4, 4, 2, 3], testCapacity = 10
        */
        while(left <= right){
            int testCapacity = (left + right) / 2;
            int currDays = 1;
            int currWeight = 0;
            for(int i = 0; i < weights.length; i++){
                currWeight += weights[i];
                if(currWeight > testCapacity){
                    currDays++;
                    currWeight = weights[i];
                }
            }
            if(currDays > days){
                left = testCapacity + 1;
            } else {
                right = testCapacity - 1;
                if(testCapacity < currLowestCapacity){
                    currLowestCapacity = testCapacity;
                }
            }

        }

        return currLowestCapacity;
    }
}