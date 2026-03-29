class MinStack {
    Stack<Integer> st;
    Stack<Integer> min_st;

    public MinStack() {
        st = new Stack<>();
        min_st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (min_st.isEmpty() || val <= min_st.peek()) {
            min_st.push(val);
        }
    }

    public void pop() {
        if (st.peek().equals(min_st.peek())) {
            min_st.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min_st.peek();
    }
}