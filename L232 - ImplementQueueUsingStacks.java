class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
         //approach 1 where we add in constant time and remove in 'n' time        
        s1.push(x);
    }
    
    public int pop() {
        while( !s1.isEmpty()){
            int item =s1.pop();
            s2.push(item);
        }
        
        //now items are transfered to s2
        //we only need to remove the top element frim s2 (pop from Q)
        int removed = s2.pop();

        //now transfer back the remainng elements from s2 to s1;

        while(!s2.isEmpty()){
            int item = s2.pop();
            s1.push(item);
        }

        return removed;
    }
    
    public int peek() {
        
    //similar to pop but we just need to see the 1st (element that'll be          reomved first from the Q')

     while( !s1.isEmpty()){
            int item =s1.pop();
            s2.push(item);
        }
        int peeked = s2.peek();
        while(!s2.isEmpty()){
            int item = s2.pop();
            s1.push(item);
        }

        return peeked;


    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
