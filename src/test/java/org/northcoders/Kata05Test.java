package org.northcoders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata05Test {

    Kata05 kata;
    @BeforeEach
    void setUp() {
        kata = new Kata05();
;    }

    @Nested
    @DisplayName("Test method generateCaesarCipher")
    class generateCaesarCipher{
        @Test
        void testNullInput() {
            assertThrows(IllegalArgumentException.class, () -> kata.generateCaesarCipher(null), "Input should not be null");
        }

        @Test
        void testEmpty(){
            assertThrows(IllegalArgumentException.class, () -> kata.generateCaesarCipher(""), "Input should not be empty");
        }


        @Test
        void testValidInputs(){
            assertAll(
                    () -> assertEquals("123456", kata.generateCaesarCipher("123456"), "return number itself when input is all numbers"),
                    () -> assertEquals("!(;", kata.generateCaesarCipher("!(;"), "return special character itself when input is all numbers"),
                    () -> assertEquals("abegupbqref", kata.generateCaesarCipher("northcoders"), "return caesar cipher when input is all letters"),
                    () -> assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", kata.generateCaesarCipher("northcoders"), "return caesar cipher when input is mixed letters, numbers, and special characters")

                    );
        }
    }

}