package chapter02;

import java.util.HashSet;
import java.util.Set;

public class Q01 {
    public static Node removeDuplicates(Node node){
        Set<Integer> elements = new HashSet<>();

        // head points to the first element of the list, just for returning it at the end of the method
        Node head = node;
        // previous is a pointer following the pointer node: it will change what the previous node point to
        Node previous = node;

        while(node != null){
            if(elements.contains(node.data)){
                // point the previous to the next of the current: current node has to be removed
                previous.next = node.next;
            } else {
                elements.add(node.data);
                // point previous to current, basically following the node pointer
                previous = node;
            }
            node = node.next;
        }
        return head;
    }
}
