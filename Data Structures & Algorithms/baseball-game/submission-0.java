class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            } else if (operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            } else if (operations[i].equals("+")){
                int secondVal = stack.pop();
                int firstVal = stack.peek();
                int sumToAdd = secondVal + firstVal;
                stack.push(secondVal);
                stack.push(sumToAdd);
            } else {
                int value = Integer.parseInt(operations[i]);
                stack.push(value);
            }
        }

        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}