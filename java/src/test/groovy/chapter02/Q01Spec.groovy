package chapter02

import spock.lang.Specification

class Q01Spec extends Specification {

    def "it should remove the duplicates of the linked list"(){
        given:
        def node = new Node(1).appendToTail(2).appendToTail(3)

        when:
        def nodeWithoutDuplicated = Q01.removeDuplicates(node)

        then:
        nodeWithoutDuplicated == node
    }
}
