package chapter02;

import java.util.HashSet;
import java.util.Set;

public class Q01 {
    public static Node removeDuplicates(Node node){
        Set<Integer> elements = new HashSet<>();
        Node head = node;

        while(node != null){
            if(elements.contains(node.data)){
                if(node.next == null){
                    return node;
                } else {
                    node = node.next.next;
                }
            } else {
                elements.add(node.data);
                node = node.next;
            }
        }
        return head;
    }
}
