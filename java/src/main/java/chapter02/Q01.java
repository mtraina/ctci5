package chapter02;

import java.util.HashSet;
import java.util.Set;

public class Q01 {
    public static Node removeDuplicates(Node node){
        Set<Integer> elements = new HashSet<>();
        Node head = node;
        Node previous = node;

        while(node != null){
            if(elements.contains(node.data)){
                previous.next = node.next;
            } else {
                elements.add(node.data);
                previous = node;
            }
            node = node.next;
        }
        return head;
    }
}
