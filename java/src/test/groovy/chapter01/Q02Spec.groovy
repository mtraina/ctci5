package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q02Spec extends Specification {

    @Unroll
    def "it would expect #expected when reversing #text"(){

        Q02.reverse(text)

        where:
        text | expected
        null | null
    }
}
