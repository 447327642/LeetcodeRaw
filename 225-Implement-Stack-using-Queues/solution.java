/*class MyStack {
    Queue q1 = new LinkedList();
    Queue q2 = new LinkedList();
    int top = 0; 
    // Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
        this.top = x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll()); 
        }
        q1.poll();
        while (q2.size() > 1) {
            q1.offer(q2.poll()); 
        }
        
        q1.offer(q2.poll());
    }

    // Get the top element.
    public int top() {
        /*while (q1.size() > 0) {
            q2.offer(q1.poll()); 
        }
        Object c = q1.peek();
        int ret = 1;
        if (c instanceof Integer) {
            ret = (int) c;
        }
        while (!q2.isEmpty()) {
            q1.offer(q2.poll()); 
        }*//*
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}*/

// this problem made me sick; just skip that and copy other's solution


class MyStack {
    
    private Queue<Integer> queue = new LinkedList<>();
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        top(false);
    }

    // Get the top element.
    public int top() {
        return top(true);
    }
    
    private int top(boolean keep) {
        Queue<Integer> another = new LinkedList<>();
        Integer cache = null;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (cache == null) {
                cache = curr;
            } else {
                another.add(cache);
                cache = curr;
            }
        }
        if (keep) {
            another.add(cache);
        }
        this.queue = another;
        return cache;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}