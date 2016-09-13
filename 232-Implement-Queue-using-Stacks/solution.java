class MyQueue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        Object c = s2.peek();
        int ret = 0;
        ret = (int) c;
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.empty();
    }
}