import java.util.Stack;

public class stack_main {
    public static void main(String[] args){
        int size=5;
        stack stack_new=new stack(size);
        try{
            for(int i=0;i<size;i++){
                stack_new.push(i);
            }
            stack_new.push(42);
        }catch(PushException e){
            System.out.println("Push Exception: "+e.getMessage());
        }
        finally {
            for(int i=0;i<size;i++){
                System.out.println(i+"\n");
            }
        }

        try{
            for(int i=0;i<size;i++){
                int value=stack_new.pop();
            }
            stack_new.pop();
        }catch(PopException s){
            System.out.println("Pop Exception: "+s.getMessage());
        }
    }
}
