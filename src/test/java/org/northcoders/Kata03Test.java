package org.northcoders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata03Test {

    Kata03 kata;
    @BeforeEach
    void setUp() {
        kata = new Kata03();
    }

    @Nested
    @DisplayName("Test method calculateSumAscii")
    class calculateSumAscii {
        @Test
        void testNullInput(){
            assertThrows(IllegalArgumentException.class, () -> kata.calculateSumAscii(null), "input should not be null");
        }

        @Test
        void testEmptyInput() {
            assertThrows(IllegalArgumentException.class, ()->kata.calculateSumAscii(""), "input should not be empty");
        }

        @Test
        void testMultipleString(){
            assertAll(
                    ()-> assertEquals(1195, kata.calculateSumAscii("northcoders"), "return ASCII sum of all lower case letters"),
                    ()-> assertEquals(1163, kata.calculateSumAscii("Northcoders"), "return ASCII sum of mixed capitalized word"),
                    () -> assertEquals(97, kata.calculateSumAscii("a"), "return ASCII sum of single letter of string "),
                    () -> assertEquals(113, kata.calculateSumAscii("89"), "return ASCII sum of two digits")
            );
        }


    }

}