package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q03Spec extends Specification {

    @Unroll
    def "it should be #expected that #first is a permutation of #second"(){
        expect:
        Q03.isPermutation(first, second) == expected

        where:
        first   | second    | expected
        null    | null      | false
        "abc"   | "acb"     | true
    }
}
