/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);

 -number between 1 and n
 - we're given n 
 - so we can have the range 1 -> n

 - continuously guess the mid point of 1 -> n and use binary search 
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14, 15]
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int midpoint = left + (right - left) / 2;

            if(guess(midpoint) == -1){
                right = midpoint - 1;
            } else if(guess(midpoint) == 1){
                left = midpoint + 1;
            } else {
                return midpoint;
            }
        }
        return -1;
    }
}