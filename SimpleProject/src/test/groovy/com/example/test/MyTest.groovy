package com.example.test

import spock.lang.Specification

class MyTest extends Specification {
    def "test"() {
        given:

        final var a = 2
        final var b = 3

        when:

        final var c = a + b

        then:

        c == 5
    }
}
