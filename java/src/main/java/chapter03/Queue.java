package chapter03;

public class Queue {
    Node first, last;

    public void enqueue(Object item){
        Node node = new Node(item);
        if(first == null){
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public Object dequeue(){
        if(first != null){
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }
}
