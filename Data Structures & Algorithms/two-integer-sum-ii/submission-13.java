class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];

        int right = numbers.length - 1;
        int left = 0;
        while(left < right){
            int numLeft = numbers[left];
            int numRight = numbers[right];

            if(numLeft + numRight == target){
                solution[0] = left + 1;
                solution[1] = right + 1;
                return solution;
            }
            if(numLeft + numRight > target){
                right--;
            } else {
                left++;
            }
        }
        return solution;
    }
}
