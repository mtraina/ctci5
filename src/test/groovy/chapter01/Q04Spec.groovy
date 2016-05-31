package chapter01

import spock.lang.Specification
import spock.lang.Unroll


class Q04Spec extends Specification {

    @Unroll
    def "when it receives #source of length #length, it should replace the spaces and return #target"(){
        expect:
        Q04.replaceSpaces(source.chars, length) == target

        where:
        source                  | length    | target
        "cheers"                | 6         | "cheers"
        "hello world"           | 11        | "hello%20world"
        "looking forward to it" | 21        | "looking%20forward%20to%20it"
        "danger!  "             | 9         | "danger!%20%20"
    }
}
