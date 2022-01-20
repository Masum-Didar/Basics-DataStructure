
package dataStructure;


public class stackTest {
    public static void main(String[] args) {
        myStack obj = new myStack();
        
        obj.push(4);
        obj.push(8);
        obj.push(9);
        obj.push(2);
        obj.push(5);
        System.out.println("Pop successfully deleted "+obj.pop());
        obj.push(8);
        obj.push(23);
        obj.peek();
        System.out.println("Peek returned "+obj.peek());
        
    }
    
}
