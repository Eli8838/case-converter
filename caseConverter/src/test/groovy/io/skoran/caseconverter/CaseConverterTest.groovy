package io.skoran.caseconverter

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Eli Skoran 2019-07-09
 */
class CaseConverterTest extends Specification {

    @Unroll()
    def 'test convert to space case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.SPACE_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "very nice text"
        "no change need"                      | "no change need"
        "complicated5StringWith4Numbers"      | "complicated5 string with4 numbers"
        "complicated-5-String-With-4-Numbers" | "complicated 5 string with 4 numbers"
        "string-With-Dash"                    | "string with dash"
        "string_With_underScore"              | "string with under score"
        "with#%^_chars"                       | "with#%^ chars"
        "with_#%^_chars"                      | "with #%^ chars"
    }
}
