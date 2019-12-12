/**
 * TODO: Describe class
 */

package edu.ie3

import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class TestDummy extends Specification{
    def "Empty Spec"() {
        given:
        log.debug("Just test if 1 equals to 1.")

        expect:
        1 == 1
    }
}
