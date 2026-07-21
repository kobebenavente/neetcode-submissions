class Solution {
    public int numRescueBoats(int[] people, int limit) {

        // infinite number of boats available
        // each boat can carry a max weight of "limit"
        // each boat carries AT MOST two people--sum must be less than or equal to limit
        //GOAL: return minimum number of boats to carry every person

        // sort array so that when we grab from either end,
        // we know its the current lowest or highest value.
        // why is this helpful to us? so we can be sure that for the heaviest
        // people, we are checking for the lighest available pairing for them.
        
        //arrays.sort(people)
        //left pointer = 0
        //right pointer = people.length-1
        //while left < right:
        //combined weight = people[left] + people[right]
        //if combined weight <= limit:
        //left++, right-- 
        //rescueBoats++;
        //else:
        //right--
        //rescureBoats++;

        int rescueBoats = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        while(l <= r){

            if(l==r){
                rescueBoats++;
                break;
            }

            int combinedWeight = people[l] + people[r];
            if(combinedWeight <= limit){
                l++;
                r--;
                rescueBoats++;
            } else{
                r--;
                rescueBoats++;
            }
        }
        return rescueBoats;

        //dry run: 
        //[1,2,2,3,3] limit = 3
        //l = 0, r = 4
        //iter 1: 
        // combined weight = 4 
        // l = 0, r = 3
        // rescueBoats = 1
        // iter 2: 
        // combined weight = 4
        // l = 0, r = 2
        // rescueBoats = 2
        // iter 3: 
        // combined weight = 3
        // l = 1, r = 1



    }
}