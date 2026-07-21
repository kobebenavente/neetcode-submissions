class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        /*

        

        int[] position = the starting mile of the i'th car.
        int[] speed = the speed of the i'th car. 
        - both arrays of length n

        example: position = [10,8] speed = [2,4]
        - position[0] = 10 and the car is moving at a speed (speed[0]) of 2 mph.

        important:
        - A car cant pass another car. If it is capable of doing so, it instead catches up to the car and travels next to it at the speed of the slower car.
            - ex (position 4 speed 4 car catches up with position 7 speed 1 car then they continue at 1mph )
        - A car fleet is a single or group of cars driving next to each other.
        - The speed of the car fleet is the MINIMUM speed of any car in the fleet.
        - If a car catches up to a car fleet at the mile TARGET, it is still part of the fleet.

        GOAL: return the number of car fleets that will arrive at the destination

        (target - position) / speed = time it takes to get to target

        (12 - 10) / 2 = 2 / 2 = 1 hour at position 10
        (12 - 8) / 4 = 4 / 4 = 1 hour at position 8
        (12 - 0) / 1 = 12 / 1 = 12 hours at 0
        (12 - 5) / 1 = 7 / 1 = 7 hours at position 5
        (12 - 3) / 3 = 9 / 3 = 3 hours at position 3


        if it takes a car less time to get somewhere and their position is before the other, that means they will form a fleet--then, the slower time is kept.
        
        -sort the array of positions
        stack:


        1
        7
        12
        [0,3,5,8,10]
        looked at: 1

        create a stack
        add first car time to stack  stack.push(((target - positions[0]) / speed[0]))
        for each car after index 0: 
        calculate the car's time 
        if top of stack takes less than or equal to time, pop the stack and push the current car. if not, just push the current car
        return the stack size

        target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]

        what do we need to know?
        - need a way to determine if other cars position + speed is greater than or equal to the current car's position + speed.
        - potential thing to consider: a car joining a fleet essentially means it is no longer needed. perhaps we can remove it from a stack once joined.

        -Think about how long it takes each car to reach the target. If you process the cars in a smart order, that single value tells you everything you need 
        to know about whether two cars will form a fleet



        8
        10 - 0 / 2 = 10/2 = 8
        10 - 2 / 3 = 8 / 3 = 2.66
        10 - 4 / 1 = 6 / 1 = 6




         target = 10
        [0,2,4] position
        [2,3,1] speed

        */
        int[][] cars = new int[position.length][2];
        for(int i = 0; i < position.length ; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(cars));

        Stack<Double> stack = new Stack<>();

        stack.push((double)(target-cars[0][0]) / cars[0][1]);

        for(int i = 1; i<position.length; i++){

            double currentCarTime = ((double)(target-cars[i][0]) / cars[i][1]);
            
            if(stack.peek() <= currentCarTime){
                while(stack.size() > 0 && stack.peek() <= currentCarTime){
                    double popped = stack.pop();
                }
                 stack.push(currentCarTime);
            } else{
                stack.push(currentCarTime);
            }
        }
        return stack.size();
    }
}