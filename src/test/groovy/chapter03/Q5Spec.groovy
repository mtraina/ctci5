package chapter03

import spock.lang.Specification

class Q5Spec extends Specification {

    def "should enqueue in the right order"(){
        given:
        Q05.MyQueue q = new Q05.MyQueue()

        when:
        q.enqueue(1)
        q.enqueue(2)
        q.enqueue(3)
        q.enqueue(4)

        then:
        q.dequeue() == 1
        q.dequeue() == 2
        q.dequeue() == 3
        q.dequeue() == 4
    }

    def "should dequeue in the right order"(){
        given:
        Q05.MyQueue q = new Q05.MyQueue()
        q.enqueue(1)
        q.enqueue(2)
        q.enqueue(3)
        q.enqueue(4)

        expect:
        q.dequeue() == 1
        q.dequeue() == 2
        q.dequeue() == 3
        q.dequeue() == 4
    }
}
