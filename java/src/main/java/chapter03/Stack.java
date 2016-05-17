package chapter03;

public class Stack {
    Node top;

    Object pop(){
        if(top != null){
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    Object peek(){
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }
}
