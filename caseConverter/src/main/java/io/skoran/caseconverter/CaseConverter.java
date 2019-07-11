package io.skoran.caseconverter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

/**
 * @author Eli Skoran 2019-07-09
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CaseConverter {

    public static String convert(@NonNull String stringToConvert, @NonNull CaseType newCase) {

        List<String> words = Splitter.split(stringToConvert);

        String outPut = String.join(" ", words);

        // normalize
        return outPut.trim().toLowerCase();
    }
}
