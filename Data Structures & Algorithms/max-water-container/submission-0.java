class Solution {
    public int maxArea(int[] heights) {
        int best = 0;

        int left = 0, right = heights.length-1;

        while(left < right){
            if(heights[left] < heights[right]){
                best = Math.max(best, heights[left] * (right - left));
                left++;
            } else {
                best = Math.max(best, heights[right] * (right - left));
                right--;
            }
        }
        return best;
    }
}
