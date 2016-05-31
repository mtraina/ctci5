package chapter03

import spock.lang.Specification

class StackSpec extends Specification {

    def "should push/pop in the right order"(){
        given:
        Stack s = new Stack()

        when:
        s.push(1)
        s.push(2)
        s.push(3)

        then:
        s.pop() == 3
        s.pop() == 2
        s.pop() == 1
    }
}
