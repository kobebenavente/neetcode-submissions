class Solution {
    public int mySqrt(int x) {
        /*

        -given a non-negative integer
        - return square root of integer rounded down 
        what is a square root?
        a square root is the result of a number times itself 
        13
        4 x 4 = 16
        3 x 3 = 12

        1,2,3,4,5,6,7,8,9,10,11,12,13,14,16

        1 -> x
        get midpoint 
        try midpoint x midpoint

        int closestSqrt = 0

        int left = 0
        int right = x
        while left <= right:
         int midpoint = (left + right) / 2;
         if(midpoint * midpoint > x){
          right = midpoint - 1;
         } else if (midpoint * midpoint < x){
          closestSqrt = midpoint;
          left = midpoint + 1;
         } else {
          return midpoint;
         }

        return closestSqrt;

        */

        int left = 0;
        int right = x;
        int closestSqrt = 0;
        while(left <= right){
            int midpoint = (left + right) / 2;
            if((long) midpoint * midpoint > x){
                right = midpoint - 1;
            } else if((long) midpoint * midpoint < x){
                closestSqrt = midpoint;
                left = midpoint + 1;
            } else {
                return midpoint;
            }
        }

        return closestSqrt;


    }
}