package com.beautifultestskata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SubtractAverageTests {

    static Stream<ArrayOperations> provider() {
        return Stream.of(
                new ArrayOperationsV1()
                , new ArrayOperationsV2()
                , new ArrayOperationsV3()
                , new ArrayOperationsV4()
                , new ArrayOperationsV5()
                , new ArrayOperationsV6()
                , new ArrayOperationsV7()
                , new ArrayOperationsV8()
                , new ArrayOperationsWorking());
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void demoTest(ArrayOperations implementation) {
        var output = implementation.subtractAverage(new float[]{1, 2, 3});
        Assertions.fail();
    }

}
