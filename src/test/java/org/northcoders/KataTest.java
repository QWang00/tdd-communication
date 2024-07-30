package org.northcoders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    Kata kata;
    @BeforeEach
    void setUp() {
        kata = new Kata();
    }

    @Nested
    @DisplayName("Test sumNumsBetweenLowHigh")
    class sumNumsBetweenLowHigh{

        @Test
        void testEmptylInput() {
            int[] input = {};
            int expected = 0;
            int actual = kata.sumNumsBetweenLowHigh(input);
            assertEquals(expected, actual, "return 0 contains empty array");
        }

        @Test
        void testOneInt(){
            int[] input = {1};
            int expected = 0;
            int actual = kata.sumNumsBetweenLowHigh(input);
            assertEquals(expected, actual, "return 0 when there is single number in the array");

        }

        @Test
        void testTwoInt(){
            int[] input = {1, 2};
            int expected = 0;
            int actual = kata.sumNumsBetweenLowHigh(input);
            assertEquals(expected, actual, "return 0 when there are two numbers in the array");

        }

        @Test
        void testMoreThanTwoInt(){
            assertAll(
                    ()-> assertEquals(2, kata.sumNumsBetweenLowHigh(new int[]{1,2,3}), "return sum integers with three numbers in array"),
                    () -> assertEquals(21, kata.sumNumsBetweenLowHigh(new int[]{5,2,6,10,22}), "return sum integers with five numbers in array"),
                    () -> assertEquals(9, kata.sumNumsBetweenLowHigh(new int[]{1,2,3,4,5}), "return sum integers with five numbers in array")


                    );

        }



    }

}