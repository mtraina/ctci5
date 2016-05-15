package chapter01

import spock.lang.Specification
import spock.lang.Unroll


class Q05Spec extends Specification {

    @Unroll
    def "it should compress #original to #expected"() {
        expect:
        Q05.compress(original) == expected

        where:
        original        | expected
        "aabbb"         | "a2b3"
        "aabcccccaaa"   | "a2b1c5a3"
        "abb"           | "abb"     // because a1b2 would be longer
    }
}
