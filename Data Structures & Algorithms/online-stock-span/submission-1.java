class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        this.stack = new Stack<>();        
    }
    
    public int next(int price) {
        if(!stack.isEmpty() && stack.peek()[0] <= price){

            int days = 1;
            while(!stack.isEmpty() && stack.peek()[0] <= price){
                days = stack.peek()[1] + days;
                stack.pop();
            }
            stack.push(new int[]{price, days});

        } else {
            stack.push(new int[]{price, 1});
        }
        return stack.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

 /*



 */