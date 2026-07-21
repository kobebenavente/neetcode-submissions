class Solution {

    // - Encode should convert a list of strings into one string.
    // - Decode should convert that string into a list of strings.
    // - List should be the same in both input (for encode) and output (for decode).

    //encode:

    //for every entry in the list, get the current entry's length, convert that number
    // back to a string, append it to the front of the current entry's string, then 
    //append that to the solution string.
    //String solution = "";
    //for every entry in list: 
    //int stringLength = currentEntry.length()
    //String stringLengthConverted = Integer.toString(stringLength)
    //solution.append(stringLengthConverted + currentEntry)

    
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String string : strs){
            int wordLength = string.length();
            String conversion = Integer.toString(wordLength);
            encodedString.append(conversion + "!" + string);
        }
        return encodedString.toString();
    }
    
    // - Decode needs some sort of identifier for when a part of the string needs to be
    // separated for list entry.
    
    // - Idea: putting a number at the start of the encoded String which signifies how long
    // the first entry will be
    // ex: ["Hello", "World"]
    // encode: 5!Hello10!wwwwwwwwww
    // encode: 1#i
    //
    // decode:
    // - need to have one pointer at the start of the string and another pointer move until it reaches
    // the stop indicator. 
    // - after that, get the substring of first pointer to second pointer and convert to an integer,
    //  to get the word, we get another subtring of (second pointer index, this number + the second pointer index).
    // - first pointer will then be set to previous string number + second pointer index, then move second pointer until it reaches the 
    // stop indicator.
    // this loop will stop when the first pointer is > the string length.

    // List<String> solution = new ArrayList<>()
    // int start = 0
    // int stop = 0
    // while(start < string.length()):
    // while(string.getCharAt(stop) != '!'):
    //  stop++;
    // Integer number = Integer.parseInt(string.substring(start, stop))
    // 
    // String string = String.substring(stop + 1 , stop + 1 + number)
    // start = stop + 1 + number
    // stop = stop + 1 + number
    // solution.add(string)

    // start = 0, stop = 0 
    // while (0 < 20):
    // while string.getCharAt(0) does not equal '!'):
    // stop++ (1)
    // number = 5
    // string = substring((1+1), 1 + 1 + 5)
    // start = 1 + 1 + 5
    // stop = 1 + 1 + 5
    // add(string)
    // start = 7
    // stop = 7
    // while (7 < 20):
    // while (string.getCharAt(7) does not equal '!')"
    // stop++ (stops at 9)
    // number = 10
    // string = substring((9 + 1), (9 + 1 + 10))
    // start = 9 + 1 + 10
    // stop = 9 + 1 + 10
    // add (string)


    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList<>();
        int start = 0;
        int stop = 0;
        while(start < str.length()){
            while(str.charAt(stop) != '!'){
                stop++;
            }
            Integer wordLength = Integer.parseInt(str.substring(start, stop));
            String string = str.substring(stop + 1, stop + 1 + wordLength);
            start = stop + 1 + wordLength;
            stop = stop + 1 + wordLength;
            decodedStrings.add(string);
        }
        return decodedStrings;
    }
}
