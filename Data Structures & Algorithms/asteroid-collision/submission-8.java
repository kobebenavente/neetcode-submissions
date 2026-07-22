class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            boolean isAlive = true;
            while(isAlive && !stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                if(stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                    isAlive = false;
                    continue;
                }
                if(stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                    continue;
                }
                if(stack.peek() > Math.abs(asteroids[i])){
                    isAlive = false;
                    continue;
                }
            }
            if(isAlive){
                stack.push(asteroids[i]);
            }
        }

        int[] solution = new int[stack.size()];
        for(int i = solution.length - 1; i >= 0; i--){
            solution[i] = stack.pop();
        } 
        return solution;
    }
    /*

    - given array of integers representing asteroids in a row
    - indices = asteroid position
    - absolute value of each asteroid is its size
        - sign represents direction (+ = right, - = left)
    - if two asteroids meet, smaller one explodes
    - if two asteroids are same size, both explode
    - two asteroids moving in same direction will never meet

    GOAL: return state of asteroids after all collisions

    */
}