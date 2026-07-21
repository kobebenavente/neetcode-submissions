class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int n : nums){
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        

        List<Integer>[] frequency = new ArrayList[nums.length + 1];

        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            //index = count, values = the number
            frequency[entry.getValue()].add(entry.getKey());
        }

        //hashmap: key = 1, count = 3
        //frequency[3] = 1

        //entry: 3, 1
        //[1,2,2,3,3,3]
        //[0,1,2,3,0,0]

        int j = 0;
        int[] solution = new int[k];
        
        for(int i = nums.length; i > 0 && j < k; i--){
            if(frequency[i].size() > 1){
                for(int z = 0; z < frequency[i].size(); z++){
                    solution[j] = frequency[i].get(z);
                    j++;
                }
            } else if(frequency[i].size() != 0) {
                solution[j] = frequency[i].get(0);
                j++;
            }
        }
        return solution;
    }
}
