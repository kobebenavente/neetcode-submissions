class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Count everything with a hashmap where key = num[i], value = occurrences.
        //For every entry in the hashmap, add key/value pair to an arraylist of arrays(?).
        //Sort the arraylist in descending order by comparing 1 index of each array 
        // in the arraylist. 
        // Grab the k amount of arrays in the arraylist. 


        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> frequency = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            frequency.add(new int[] {entry.getKey(), entry.getValue()});
        }

        Collections.sort(frequency, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(b[1], a[1]);
            }
        });

        int[] result = new int[k]; 
        for(int i = 0; i < k ; i++){
            result[i] = frequency.get(i)[0];
        }
        return result;
    }
}
