package chapter01

import spock.lang.Specification
import spock.lang.Unroll


class Q04Spec extends Specification {

    @Unroll
    def "when it receives #source, it should replace the spaces and return #target"(){
        expect:
        Q04.replaceSpaces(source) == target

        where:
        source                  | target
        null                    | null
        "hello world"           | "hello%20world"
        "looking forward to it" | "looking%20forward%20to%20it"
    }
}
