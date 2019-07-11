package io.skoran.caseconverter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eli Skoran 2019-07-09
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CaseConverter {

    public static String convert(@NonNull String stringToConvert, @NonNull CaseType newCase) {

        List<String> words = Splitter.split(stringToConvert);

        List<String> normalizedWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            normalizedWords.add(normalize(words.get(i), newCase, i == 0));
        }

        return String.join(newCase.getDelimiter(), normalizedWords);
    }

    @NonNull
    private static String normalize(@NonNull String word, @NonNull CaseType caseType, boolean firstWord) {
        switch (caseType) {
            case SPACE_CASE:
            case KABAB_CASE:
            case SNAKE_CASE:
                return word.toLowerCase().trim();
            case CAMEL_CASE:
                if (firstWord) {
                    return word.toLowerCase().trim();
                } else {
                    return StringUtils.capitalize(word.toLowerCase().trim());
                }
            case CAPITAL_CAMEL_CASE:
                return StringUtils.capitalize(word.toLowerCase().trim());
            case UPPER_SNAKE_CASE:
                return word.toUpperCase().trim();
            default:
                return word.toLowerCase().trim();
        }
    }
}
