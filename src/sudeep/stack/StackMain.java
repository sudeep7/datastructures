package sudeep.stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        StackImpl<Integer> intStack = new StackImpl<>();

        System.out.println(intStack.push(10));
        System.out.println(intStack.push(20));
        System.out.println(intStack.push(30));

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

    }
}
