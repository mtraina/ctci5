package chapter01

import spock.lang.Specification

class Q01Spec extends Specification {

    def "is unique chars should return #expected when receives #text"() {
        expect:
        Q01.isUniqueChars(text) == expected

        where:
        text    | expected
        null    | false
    }
}
