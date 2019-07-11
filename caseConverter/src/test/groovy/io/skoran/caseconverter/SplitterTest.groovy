package io.skoran.caseconverter

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Eli Skoran 2019-07-11
 */
class SplitterTest extends Specification {

    @Unroll()
    def 'test #textToSplit'() {

        when:
        List<String> words = Splitter.split(textToSplit)

        then:
        words == expectedWords

        where:

        textToSplit         | expectedWords
        "VeryNiceText"      | ["Very", "Nice", "Text"]
        "veryNiceText"      | ["very", "Nice", "Text"]
        "veryVeryNiceText"  | ["very", "Very", "Nice", "Text"]
        "VeryVeryNiceText"  | ["Very", "Very", "Nice", "Text"]
        "very Nice Text"    | ["very", "Nice", "Text"]
        "very-Nice-Text"    | ["very", "Nice", "Text"]
        "very_Nice_Text"    | ["very", "Nice", "Text"]
        "1very_3Nice_4Text" | ["1very", "3Nice", "4Text"]
    }
}
