class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

public class stack {
    private int maxSize;
    private int top;
    private int[] stack_array;

    public stack(int size){
        maxSize=size;
        top=-1;
        stack_array=new int[maxSize];
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int val) throws PushException{
        if(isFull()){
            throw new PushException("Stack is full, cannot push "+val);
        }
        stack_array[++top]=val;
    }
    public int pop() throws PopException{
        if(isEmpty()){
            throw new PopException("Stack is empty, cannot pop ");
        }
        return stack_array[top--];
    }
}
