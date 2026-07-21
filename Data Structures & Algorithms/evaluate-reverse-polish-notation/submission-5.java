class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> nums = new Stack<>();

        for(String token : tokens){

            char curr = token.charAt(0);
            int value1;
            int value2;
            switch(curr){
                case '+':
                    value1 = nums.pop();
                    value2 = nums.pop();
                    nums.push(value2 + value1);
                    break;
                case '-':
                    if(token.length() > 1){
                        nums.push(Integer.valueOf(token.substring(0, token.length())));
                        break;
                    }
                    value1 = nums.pop();
                    value2 = nums.pop();
                    nums.push(value2 - value1);
                    break;
                case '*':
                    value1 = nums.pop();
                    value2 = nums.pop();
                    nums.push(value2 * value1);
                    break;
                case '/':
                    value1 = nums.pop();
                    value2 = nums.pop();
                    nums.push(value2 / value1);
                    break;
                default:
                    nums.push(Integer.valueOf(token.substring(0, token.length())));
                    break;
            }
        }
        return nums.peek();
    }
    /*
    Input: tokens = ["1","2","+","3","*","4","-"]
                              ^
    */
}
