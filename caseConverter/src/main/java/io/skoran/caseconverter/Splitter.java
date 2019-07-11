package io.skoran.caseconverter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Eli Skoran 2019-07-11
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Splitter {

    private static final String SPACE_SPLIT = " ";
    private static final String CAPITAL_LETTER_SPLIT = "(?=[A-Z])";
    private static final String KABAB_AND_SNAKE_SPLIT = "(-)|(_)";

    public static List<String> split(@NonNull String input) {
        // split by space
        String[] splited = input.split(SPACE_SPLIT);

        // split by capital letter
        List<String> strings = Stream.of(splited)
                .filter(string -> !string.isEmpty())
                .map(string -> string.split(CAPITAL_LETTER_SPLIT))
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        // split by kabab and snake
        strings = strings.stream()
                .filter(string -> !string.isEmpty())
                .map(string -> string.split(KABAB_AND_SNAKE_SPLIT))
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        return strings;
    }
}
