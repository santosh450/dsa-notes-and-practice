package stacksQueues;

import java.util.Stack;

public class QueueUsingStackRemove {

    private Stack<Integer> main;
    private Stack<Integer> helper;

    public QueueUsingStackRemove() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        fillHelper();
        main.push(x);
        fillHelper();
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
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
