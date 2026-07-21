class Solution {
    public void reverseString(char[] s) {
        //left = s[0]
        //right = s[s.length-1]
        // while left < right
        // toSwap = s[left]
        // s[left] = string[right]
        // string[right] = toSwap
        // left++ 
        // right--
        
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            Character toSwap = s[left];
            s[left] = s[right];
            s[right] = toSwap; 
            left++;
            right--;
        }

    }
}