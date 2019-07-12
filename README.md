# Case converter

A utility to convert from and to different string formats/cases such as camel case, snake case etc.


### Examples:

This string:
```java
"input_is_a_snake_case_example"
```
can be converted to the following formats:
```java
"input is a snake case example"   // SPACE_CASE
"inputIsASnakeCaseExample"        // CAMEL_CASE
"input-is-a-snake-case-example"   // KABAB_CASE
"INPUT_IS_A_SNAKE_CASE_EXAMPLE"   // UPPER_SNAKE_CASE
"InputIsASnakeCaseExample"        // CAPITAL_CAMEL_CASE
```

the main method to invoke is:
```java
CaseConverter.convert(@NonNull String stringToConvert, @NonNull CaseType newCase)
```
the code will automatically convert any given string casing to the newCase.
