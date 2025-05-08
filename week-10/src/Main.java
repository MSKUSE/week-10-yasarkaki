//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//        Stack stack = new StackArray();
//        stack.push("String");
//        stack.push(22);
//        stack.peek();
//        System.out.println("Pop= " + stack.pop());
//        stack.peek();
//        System.out.println("Pop= " + stack.pop());
//        System.out.println("Is empty " + stack.isEmpty());
//        stack.peek();
//        System.out.println("Pop= " + stack.pop());
//
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push("It is a string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getNext());

    }
}