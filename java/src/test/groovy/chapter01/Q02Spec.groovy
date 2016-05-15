package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q02Spec extends Specification {

    @Unroll
    def "it would expect #expected when reversing #text"(){
        expect:
        Q02.reverse(text) == expected

        where:
        text | expected
        null | null
        ""   | ""
        "abc"| "cba"
    }
}
