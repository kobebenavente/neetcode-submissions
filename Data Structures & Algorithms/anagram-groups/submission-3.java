class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*

        List<List<String>> solution = new ArrayList<>();


        HashMap<arr, arrayList> anagrams = new HashMap<>();
        scan through strs
        for each str, get character frequency in array
            [0,2,1,0,0,0]
             a b c d e f

        a = lowest numerical value
        z = highest
        arr['z' - str.charAt(i)]++
        check if anagrams contains currCharFreq
        if it does, do anagrams.get(currCharFreq).add(str)
        if it doesnt, do anagrams.put(currCharFreq).add(new ArrayList<>(List.of(str)))

        for every entry in anagrams, get value and put it in the solution 
        return solution
        */

        List<List<String>> solution = new ArrayList<>();

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String str: strs){
            int[] currCharFreq = new int[26];
            for(Character c : str.toCharArray()){
                currCharFreq['z' - c]++;
            }

            String arrToString = Arrays.toString(currCharFreq);
            if(anagrams.containsKey(arrToString)){
                anagrams.get(arrToString).add(str);
            } else{
                anagrams.put(arrToString, new ArrayList<>(List.of(str)));
            }
        }

        for(Map.Entry<String, List<String>> entry : anagrams.entrySet()){
            solution.add(new ArrayList<>(entry.getValue()));
        }
        return solution;
    }
}
