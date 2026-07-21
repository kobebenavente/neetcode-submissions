class Solution {

    /*

    encoding a list of strings but turning it into a single string

    ex: ["hello", "world"]
    encode -> "helloworld"
    decode -> ["hello", "world"]

    need a way within the string to identify where words should be separated into their own string for decoding
    "5@hello3@bob10@aaaaaaaaaa"
       ^    ^

    left = 0
    right = 0
    while left < str.length()
    while right != '@'
    right++
    get substring from left to right
    convert to Integer
    move left to right + 1
    get substring (left, left + wordLengthInt)
    add to array list
    move right to left + wordlengthInt
    move left to left + wordlenghtInt
    */

    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            String strLength = Integer.toString(str.length());
            encodedString.append(strLength + "@" + str);
        }
        return encodedString.toString();
    }

    int left = 0;
    int right = 0;

    /*
    left = 0
    right = 1

    "5@hello3@bob10@aaaaaaaaaa"
       ^
      ^


    */

    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList<>();

        while(left < str.length()){
            while(str.charAt(right) != '@'){
                right++;
            }
            Integer substringLength = Integer.valueOf(str.substring(left, right));
            left = right + 1;
            String decodedString = str.substring(left, left + substringLength);
            decodedStrings.add(decodedString);
            right = left + substringLength;
            left = left + substringLength;
        }

        return decodedStrings;

    }
}
