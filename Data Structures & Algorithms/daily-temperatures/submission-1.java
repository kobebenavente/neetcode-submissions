class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        /*
        goal: return an array "result" where result[i] is the number of days after
        i until a warmer temperature appears again.
        -if there is no future warmer day, set result[i] = 0
        [30,38,30,36,35,40,28]


                   
        [1,4 , 1, 2 ,1, , , ]

        lastLowestTemp = [40, 5], [28, 6]  

        i = 6

        currTemp = 28


        */

        Stack<int[]> lastLowestTemp = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int currTemp = temperatures[i];
            while(!lastLowestTemp.isEmpty() && lastLowestTemp.peek()[0] < currTemp){
                result[lastLowestTemp.peek()[1]] = i - lastLowestTemp.peek()[1];
                lastLowestTemp.pop();
            }
            lastLowestTemp.push(new int[]{currTemp, i});
        }
        return result;
    }
}
