package stacksQueues;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> main;
    private Stack<Integer> helper;

    public QueueUsingStack() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        fillHelper();
        int ele = helper.pop();
        fillMain();
        return ele;
    }

    public int peek() {
        fillHelper();
        int ele = helper.peek();
        fillMain();
        return ele;
    }

    public boolean empty() {
        return main.isEmpty();
    }

    private void fillHelper(){
        while(!main.isEmpty()){
            int ele = main.pop();
            helper.push(ele);
        }
    }

    private void fillMain(){
        while(!helper.isEmpty()){
            int ele = helper.pop();
            main.push(ele);
        }
    }
}
