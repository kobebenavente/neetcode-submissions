class Solution {
    public int[] topKFrequent(int[] nums, int k) {


         List<List<Integer>> numberFrequency = new ArrayList<>();

         for(int i = 0; i < nums.length + 1; i++){
            numberFrequency.add(new ArrayList<>());
         }

         Map<Integer, Integer> preCount = new HashMap<>();
         //key = number, value = frequency

         for(Integer num : nums){
            preCount.put(num, preCount.getOrDefault(num, 0) + 1);
         }

         for(Map.Entry<Integer, Integer> entry : preCount.entrySet()){
            numberFrequency.get(entry.getValue()).add(entry.getKey());
         }

         int[] solution = new int[k];

         for(int i = numberFrequency.size() - 1; i >= 0 && k != 0; i--){

            for(int j = 0 ; j < numberFrequency.get(i).size() && k != 0 ; j++){
                solution[k-1] = numberFrequency.get(i).get(j);
                k--;
            }


         }

         return solution;


         /*

         Use an array of arraylists. Index represents frequency, number at index 
         represents number being counted

         Use hashmap to count numbers. Key = number value = frequency

         for every entry in hash map, do solution[value].add(entry.getKey());

         int[] finalSolution = new int[k]

         for every element in solution or until k  == 0 :
            for every element in current arraylist or until k == 0:
                if arraylist.get(currentElement) != 0:
                    finalSolution[k] = currentElement
                    k--

         */
    }
}
