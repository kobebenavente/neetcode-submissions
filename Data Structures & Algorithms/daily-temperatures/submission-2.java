class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*

        goal: return an array where each value at an index represents the number of days after that day until
        a warmer temperature appears

        -if there is no day in the future whre a warmer temperature appears, set result[i] to 0 

        temps
        [[30,0], [29, 1]]
             ^

        */


        Stack<int[]> temps = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!temps.isEmpty() && temperatures[i] > temps.peek()[0]){
                int days = i - temps.peek()[1];
                result[temps.pop()[1]] = days;
            }
            temps.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
