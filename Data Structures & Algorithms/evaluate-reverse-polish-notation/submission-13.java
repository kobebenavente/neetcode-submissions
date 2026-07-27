class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            char c = tokens[i].charAt(0);
            if((c == '+' || c == '-' || c == '/' || c == '*') && tokens[i].length() == 1){
                if(c == '+'){
                    int numTwo = stack.pop();
                    int numOne = stack.pop();
                    stack.push(numOne + numTwo);
                } else if(c == '-'){
                    int numTwo = stack.pop();
                    int numOne = stack.pop();
                    stack.push(numOne - numTwo);                
                } else if(c == '/'){
                    int numTwo = stack.pop();
                    int numOne = stack.pop();
                    stack.push(numOne / numTwo);                
                } else if(c == '*'){
                    int numTwo = stack.pop();
                    int numOne = stack.pop();
                    stack.push(numOne * numTwo);                
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }

    /*
    tokens = ["1","2","+","3","*","4","-"]
                                        ^

    as you loop through tokens, push to stack, when you meet a arithmetic expression, retrieve/pop
    last two elements and perform expression. push that to the stack. 
    */
}
