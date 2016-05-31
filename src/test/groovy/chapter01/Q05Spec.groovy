package chapter01

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class Q05Spec extends Specification {

    def "it should calculate the compressed size of #text as #size"(){
        expect:
        Q05.compressedSize(text) == size

        where:
        text            | size
        "aa"            | 2
        "ab"            | 4
        "abb"           | 4
        "aabbbcccc"     | 6
        "aaaaaaaaaab"   | 5
    }

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
