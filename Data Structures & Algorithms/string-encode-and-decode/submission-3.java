class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        if(strs.size() == 0){
            return "";
        }

        int firstStringLength = strs.get(0).length();

        String intToString = Integer.toString(firstStringLength);

        result.append(intToString);
        result.append("#");
        result.append(strs.get(0));



        for(int i = 1; i < strs.size(); i++){
            int stringLength = strs.get(i).length();

            String integerToString = Integer.toString(stringLength);

            result.append(integerToString);
            result.append("#");
            result.append(strs.get(i));
        }
        return result.toString();
    }

    // 4#test3#hii
    // loop through each element in the array
    // word length int = 0;
    // beginning of substring = word length in + 2
    // end of substring = beginning of substring + word length int
    // word length int = end of substring
    // beginning of substring = word length int + 2
    
    // StringBuilder result = new StringBuilder();
    // "4#need4#code4#love3#you"
    // beginning variable = 0
    // j = 0
    // while the beginning variable is < str.length():
    // while (str.charAt(j) != "#"){
    // beginning variable++ 
    // int word length = substring(j, beginning variable)
    // beginning variable = beginning variable + 1
    // StringBuilder.append(substring(beginning variable, beginning variable + word length))
    // beginning variable = beginning variable + word length
    // j = beginning variable

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
    // "4#need4#code4#love3#you"

        int beginString = 0;
        int lengthKeep = 0;

        while(beginString < str.length()){
            while(str.charAt(beginString) != '#'){
                beginString++;
            }
            int wordLength = Integer.valueOf(str.substring(lengthKeep, beginString));
            beginString++;
            String word = str.substring(beginString, beginString + wordLength);
            beginString = beginString + wordLength;
            lengthKeep = beginString;

            result.add(word);
        }
        return result;

    }

    // begin string = 0
    // begin string = 1
    // int wordLength = str.substring(0, 1) = 4
    // begin string = 2
    // string word = str.substring(2, 2+4 = 6)
    // beginString = 6
    // lengthKeep = 6
}
