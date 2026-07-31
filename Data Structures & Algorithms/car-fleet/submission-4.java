class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        /*
        - n cars traveling to the same destination on a one-lane highway
        - given two int arrays position and speed, both of length n 


        - position[i] is the position of the ith car in miles
        - speed[i] is the speed of the ith cars in mph

        - destination is at position _target_ miles
        
        -rules:
        - a car CAN NOT pass another car ahead of it, it can only catch up and drive same speed
        - a car fleet is a set of cars driving at same position and same speed. a single car is also considered
            a car fleet
        - if a car catches up to a car fleet the moment it reaches the destination, then the car is considered
        part of the fleet
        
        -GOAL: return the number of different car fleets that will arrive at the destination

        */

        int[][] posAndSpeed = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            posAndSpeed[i][0] = position[i];
            posAndSpeed[i][1] = speed[i];
        }


        Arrays.sort(posAndSpeed, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < position.length ; i++){
            double timeToTarget = (double) (target - posAndSpeed[i][0]) / posAndSpeed[i][1];
            if(!stack.isEmpty() && stack.peek() >= timeToTarget){
                continue;
            } else {
                stack.push(timeToTarget);
            }
        }

        return stack.size();

    }
}
