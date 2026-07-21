class Solution {



    //Create a hashmap where key = index of word in relation to input array,
    //value = number of characters in the word.
    //Create a loop: for each string in strs, add hashmap entry and then
    //append string to a new string. repeat by continuously appending to the new string.
    //Return string.
    Map<Integer, Integer> hashMap = new HashMap<>();

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            hashMap.put(i+1, strs.get(i).length());
            result.append(strs.get(i));
        }
        return result.toString();
    }
    // Dry run:
    // Input: ["we","say",":","yes"]
    // StringBuilder result = ""
    // for loop: i = 1; i < 5 ; i++
    // i = 1:
    // hashMap.put(1, strs.get(1).length() = 2)
    // hashMap = {1, 2}
    // result = "we"
    // i = 2:
    // hashMap.put(2, strs.get(2).length() = 3)
    // hashmap = {1,2}, {2, 3}
    // result = "wesay"
    // ...
    // return result

    //Create an int variable which will serve as a counter for how far along
    //the string we are.
    //Create a loop: for each entry in the hashmap, grab piece of the new string
    //up to the size of entry.value() and then add it to a new arraylist of strings. Also,
    //add the size of the entry.value() to the counter to keep track of where to start with the
    //next entry.
    public List<String> decode(String str) {
        int positionInString = 0;
        List<String> result = new ArrayList<>();

        for(int i = 1; i < hashMap.size() + 1; i++){
            result.add(str.substring(positionInString, hashMap.get(i) + positionInString));
            positionInString = hashMap.get(i) + positionInString;
        }
        return result;
    }

    //dry run:
    // position in string = 0
    // list result = {}
    // for every entry in hashMap:
    // result.add(0 to 1 + 0)
    // positionInString = 2 + 0
    // result = {["we"]}

    // result.add(2 to (2 + 2 = 4))
    // positionInString = 3 + 2 = 5

    // result.add(5 to 0 + 5)
    // positionInString = 1 + 5 = 6

    //result.add(6 to (2 + 6 = 8))
    //positionInString = 3 + 8 = 11

}
