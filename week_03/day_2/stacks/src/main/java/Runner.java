import java.util.Stack;

public class Runner {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Empty Stack: " +  stack.isEmpty());

        stack.push(100);
        stack.push(101);
        stack.push(103);
        stack.push(102);

        System.out.println("Stack Elements"+ stack);


        System.out.println("Last Element added: "+ stack.pop());
        System.out.println("Final Elements: "+stack);

        System.out.println(stack.search(100));

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
