
package dataStructure;

/**
 *
 * @author mamas
 */
public class myStack {
    
    int capacity=5;
    int[] stack = new int[capacity];
    int top=-1;
    
    void push(int x){
        
        if(top<capacity-1){
            top=top+1;
            stack[top]=x;
            System.out.println("Successfully added :"+x);
        }
        else 
            System.out.println("Execption! stack Overloaded");
        
    }
    
    int pop(){
        if(top<0){
            System.out.println("Exception! stack Underflow"); 
            return -1;
        }
        int val = stack[top];
            top=top-1;
            return val;
        
    }
    int peek(){
        if(top<0){
            System.out.println("Exception! stack Underflow"); 
            return -1;
        }
        return stack[top];
    }
}
