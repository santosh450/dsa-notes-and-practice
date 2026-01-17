package stacksQueues;

public class StackCustom {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public StackCustom(){
        this(DEFAULT_SIZE);
    }

    public StackCustom(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full.");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Can't pop from an empty Stack.");
        }
//        int removed = data[pointer];
//        pointer--;
//        return removed;
        return data[pointer--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek from an empty Stack.");
        }
        return data[pointer];
    }



    public boolean isFull() {
        return pointer == data.length - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

}
