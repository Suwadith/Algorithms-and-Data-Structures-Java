import java.util.Stack;

/**
 * Created by Suwadith on 5/4/2017.
 */
public class StackClass {

    public static void main(String[] args){

        Stack stack = new Stack();

        stack.push(1);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.size());

    }

}
