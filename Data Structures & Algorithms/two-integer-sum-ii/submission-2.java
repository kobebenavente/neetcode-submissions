class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int[] solution = new int[2];

        //while 0 < 4
        // if 1 + 4 = 3
        // if 4 >= 3
        // right = 2
        // if 1 + 3 = 3 

        while(left < right){

            int sum = numbers[left] + numbers[right];
            if( sum == target){
                solution[0] = left+1;
                solution[1] = right+1;
                return solution;
            }

            if(sum <= target){
                left++;
            } else {
                right--;
            }
        }

        return solution;

        //how do we determine if right should be decremented or if left should be incremented?
        // maybe we could sum the two together and then check something from there?
        // 8 + (-5) == 3. we need something greater than that. 8 is the highest value,
        // therefore, in order to get a number that is greater than 3 to achieve the higher target of 5,
        // we need to bring the left side in.
        
        //target = 2
        // 8 + -5 = 3
        // 
    }
}
