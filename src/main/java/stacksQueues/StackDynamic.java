package stacksQueues;

public class StackDynamic extends StackCustom{

    public StackDynamic(){
        super();
    }

    public StackDynamic(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {

        // if it is being full
        if(isFull()){
            int[] temp = new int[data.length*2];

            // Copy data to new array
//            for(int i=0; i<data.length; i++){
//                temp[i] = data[i];
//            }
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.push(item);
    }
}
