class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*

        use a hashmap to store character and its index
        this will be useful for when we encounter a duplicate and can simply set the left pointer
        of sliding window to whatever duplicate character is in the hashmap 

        zxyzxyz

        -create hashmap for seen characters with indexes
        -while left pointer < s.length || right pointer < s.length
        -left pointer and right pointer at start
        -if hashmap.contains character at right pointer, set left pointer to hashmap.get duplicate char + 1
        -else:
        - if curr index - left pointer + 1 is greater than instance variable keeping track of longest, replace the value
        - hashmap.add character in s 
        
        */

        Map<Character, Integer> seen = new HashMap<>();
        int largest = 0;

        int left = 0;
        for(int i = 0; i < s.length(); i++){

            if(seen.containsKey(s.charAt(i))){
                left = Math.max(left, seen.get(s.charAt(i)) + 1);
            }
            
            int substring = i - left + 1;
            if(substring > largest){
                largest = substring;
            }
            
            seen.put(s.charAt(i), i);

        }
        return largest;
    }
}
