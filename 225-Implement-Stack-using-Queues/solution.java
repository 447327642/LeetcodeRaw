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