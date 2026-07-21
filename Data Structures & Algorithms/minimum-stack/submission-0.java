class MinStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        } else{
            if(minStack.peek() < val){
                minStack.push(minStack.peek());
            } else {
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
