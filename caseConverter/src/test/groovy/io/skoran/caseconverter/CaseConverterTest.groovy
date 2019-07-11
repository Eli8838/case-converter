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
        "very nice text"                      | "very nice text"
        "complicated5StringWith4Numbers"      | "complicated5 string with4 numbers"
        "complicated-5-String-With-4-Numbers" | "complicated 5 string with 4 numbers"
        "string-With-Dash"                    | "string with dash"
        "string_With_underScore"              | "string with under score"
        "with#%^_chars"                       | "with#%^ chars"
        "with_#%^_chars"                      | "with #%^ chars"
    }

    @Unroll()
    def 'test convert to kabab case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.KABAB_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "very-nice-text"
        "very nice text"                      | "very-nice-text"
        "complicated5StringWith4Numbers"      | "complicated5-string-with4-numbers"
        "complicated-5-String-With-4-Numbers" | "complicated-5-string-with-4-numbers"
        "string-With-Dash"                    | "string-with-dash"
        "string_With_underScore"              | "string-with-under-score"
        "with#%^_chars"                       | "with#%^-chars"
        "with_#%^_chars"                      | "with-#%^-chars"
    }

    @Unroll()
    def 'test convert to snake case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.SNAKE_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "very_nice_text"
        "very nice text"                      | "very_nice_text"
        "complicated5StringWith4Numbers"      | "complicated5_string_with4_numbers"
        "complicated-5-String-With-4-Numbers" | "complicated_5_string_with_4_numbers"
        "string-With-Dash"                    | "string_with_dash"
        "string_With_underScore"              | "string_with_under_score"
        "with#%^_chars"                       | "with#%^_chars"
        "with_#%^_chars"                      | "with_#%^_chars"
    }

    @Unroll()
    def 'test convert to upper snake case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.UPPER_SNAKE_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "VERY_NICE_TEXT"
        "very nice text"                      | "VERY_NICE_TEXT"
        "complicated5StringWith4Numbers"      | "COMPLICATED5_STRING_WITH4_NUMBERS"
        "complicated-5-String-With-4-Numbers" | "COMPLICATED_5_STRING_WITH_4_NUMBERS"
        "string-With-Dash"                    | "STRING_WITH_DASH"
        "string_With_underScore"              | "STRING_WITH_UNDER_SCORE"
        "with#%^_chars"                       | "WITH#%^_CHARS"
        "with_#%^_chars"                      | "WITH_#%^_CHARS"
    }

    @Unroll()
    def 'test convert to camel case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.CAMEL_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "veryNiceText"
        "very nice text"                      | "veryNiceText"
        "complicated5StringWith4Numbers"      | "complicated5StringWith4Numbers"
        "complicated-5-String-With-4-Numbers" | "complicated5StringWith4Numbers"
        "string-With-Dash"                    | "stringWithDash"
        "string_With_underScore"              | "stringWithUnderScore"
        "with#%^_chars"                       | "with#%^Chars"
        "with_#%^_chars"                      | "with#%^Chars"
    }

    @Unroll()
    def 'test convert to capital camel case from: #textToConvert to: #expectedString'() {

        when:
        String convertedString = CaseConverter.convert(textToConvert, CaseType.CAPITAL_CAMEL_CASE)

        then:
        convertedString == expectedString

        where:
        textToConvert                         | expectedString
        "VeryNiceText"                        | "VeryNiceText"
        "very nice text"                      | "VeryNiceText"
        "complicated5StringWith4Numbers"      | "Complicated5StringWith4Numbers"
        "complicated-5-String-With-4-Numbers" | "Complicated5StringWith4Numbers"
        "string-With-Dash"                    | "StringWithDash"
        "string_With_underScore"              | "StringWithUnderScore"
        "with#%^_chars"                       | "With#%^Chars"
        "with_#%^_chars"                      | "With#%^Chars"
    }
}
