package chapter01

import spock.lang.Specification
import spock.lang.Unroll

class Q01Spec extends Specification {

    def "is unique chars should return false for a text longer then 256 chars"(){
        given:
        def text = ''
        (0..256).forEach {text += (char)it}

        expect:
        !Q01.isUniqueChars(text)
        !Q01.isUniqueCharsStreams(text)
    }

    @Unroll
    def "is unique chars should return #expected when receives #text"() {
        expect:
        Q01.isUniqueChars(text) == expected
        Q01.isUniqueCharsStreams(text) == expected

        where:
        text    | expected
        null    | false
        "abc"   | true
        "defghd"| false
    }
}
