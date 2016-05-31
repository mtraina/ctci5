package chapter02

import spock.lang.Specification

class Q01Spec extends Specification {

    def "it should return the same list when there are no duplicates"(){
        given:
        def node = new Node(1).appendToTail(2).appendToTail(3)

        when:
        def nodeWithoutDuplicated = Q01.removeDuplicates(node)

        then:
        nodeWithoutDuplicated == node
    }

    def "it should return the list without duplicates"(){
        given:
        def node = new Node(1).appendToTail(2).appendToTail(2).appendToTail(1)

        when:
        def nodeWithoutDuplicated = Q01.removeDuplicates(node)

        then:
        nodeWithoutDuplicated == new Node(1).appendToTail(2)
    }
}
