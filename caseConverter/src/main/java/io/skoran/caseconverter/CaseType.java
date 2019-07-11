package io.skoran.caseconverter;

import lombok.NonNull;

/**
 * @author Eli Skoran 2019-07-09
 */
public enum CaseType {
    SPACE_CASE(" "),         // this is the out put
    KABAB_CASE("-"),         // this-is-the-out-put
    SNAKE_CASE("_"),         // this_is_the_out_put
    UPPER_SNAKE_CASE("_"),   // THIS_IS_THE_OUT_PUT
    CAMEL_CASE(""),          // thisIsTheOutPut
    CAPITAL_CAMEL_CASE("");  // ThisIsTheOutPut

    private String delimiter;


    CaseType(@NonNull String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
