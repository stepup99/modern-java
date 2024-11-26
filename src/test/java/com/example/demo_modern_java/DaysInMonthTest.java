package com.example.demo_modern_java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Month;
import java.util.stream.Stream;

public class DaysInMonthTest {
    @ParameterizedTest
    @MethodSource("input")
    void getDaysV2(Month month, int expectedNoOfDays){
        int days = DaysInMonth.getDaysV2(month, 2023);
        Assertions.assertEquals(expectedNoOfDays, days);
    }


    @ParameterizedTest
    @MethodSource("input")
    void getDaysV3(Month month, int expectedNoOfDays){
        int days = DaysInMonth.getDaysV3(month, 2023);
        Assertions.assertEquals(expectedNoOfDays, days);
    }


    private static Stream<Arguments> input(){
        return Stream.of(
                Arguments.of(Month.FEBRUARY, 28),
                Arguments.of(Month.SEPTEMBER, 30),
                Arguments.of(Month.JANUARY, 31)
        );
    }
}


