package chapter03

import spock.lang.Specification

class QueueSpec extends Specification {

    def "should enqueue in the right order"(){
        given:
        Queue q = new Queue()

        when:
        q.enqueue(1)
        q.enqueue(2)
        q.enqueue(3)
        q.enqueue(4)

        then:
        q.first.data == 1
        q.first.next.data == 2
        q.first.next.next.data == 3
        q.last.data == 4
    }
}
