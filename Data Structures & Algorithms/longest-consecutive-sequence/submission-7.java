class Solution {
    public int longestConsecutive(int[] nums) {
        //goal: return the LENGTH of the LONGEST CONSECUTIVE SEQUENCE of numbers that can be formed.
        //example:
        //[2,20,4,10,3,4,5]
        // length = 4 because: [2,3,4,5]

        // potential approach:
        // - put all numbers in a hash set
        // - int current largest = 1;
        // - for every hash set entry:
        // - if(entry - 1 does not exist in the hash set):
        // - int count = hash set entry:
        // - int sequence = 1
        // - while(hashSet.contains(count++)):
        // - sequence++;
        // - after while loop: 
        // - if sequence > currentLargest: currentLargest = sequence
        // - sequence = 1;

        if(nums.length == 0){
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();

        for(int number: nums){
            numbers.add(number);
        }

        int currentLargestCount = 1;
        for(Integer number : numbers){
            if(!numbers.contains(number-1)){
                int startingNumber = number;
                int count = 1;
                while(numbers.contains(startingNumber + 1)){
                    startingNumber++;
                    count++;
                }
                if(count > currentLargestCount){
                    currentLargestCount = count;
                }
            }
        }
        return currentLargestCount;
    }
}
