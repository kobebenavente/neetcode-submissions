class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        /*
        - given sorted integer array "arr"
        - given two integers k and x
        - GOAL: return the k closest integers to x in the array
            -result should be sorted in increasing order
        [2,4,5,8]
             ^
           ^ 
               ^

        -do a linear scan on arr checking for closest value
        -use two pointers from that value on left and right side, expand outward to check for additional closest
        values

        */

        List<Integer> solution = new ArrayList<>();
        int closestNumIndex = 0;
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            int currentNum = arr[i];

            if(Math.abs(currentNum - x) < Math.abs(arr[index] - x)){
                closestNumIndex = i;
            } 
            index++;
        }
        solution.add(arr[closestNumIndex]);
        k--;

        int l = closestNumIndex - 1;
        int r = closestNumIndex + 1;
        while((l >= 0 && r <= arr.length - 1) && k > 0){
            int leftNum = arr[l];
            int rightNum = arr[r];
            if(Math.abs(leftNum - x) <= Math.abs(rightNum - x)){
                solution.add(leftNum);
                l--;
                k--;
            } else{
                solution.add(rightNum);
                r++;
                k--;
            }
        }

        while(k > 0 && l >= 0){
            int leftNum = arr[l];
            solution.add(leftNum);
            l--;
            k--;
        }
        while(k > 0 && r <= arr.length - 1){
            int rightNum = arr[r];
            solution.add(rightNum);
            r++;
            k--;
        }

        Collections.sort(solution);
        return solution;

    }
}