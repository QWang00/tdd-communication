package org.northcoders;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Kata02Test {

    Kata02 kata;

    @BeforeEach
    void setUp() {
        kata = new Kata02();
    }

    @Nested
    @DisplayName("Test calculateMean behaviour of Kata02")
    class calculateMean {
        @Test
        void testEmptyArray() {
            double expected = 0;
            double actual = kata.calculateMean(new int[]{});

            assertEquals(expected, actual, "return 0 when array is empty");
        }

        @Test
        void testArrayWithSingleItem() {
            int[] input = new int[]{3};
            double expected = 3.00;
            double actual = kata.calculateMean(input);

            assertEquals(expected, actual, "returns number itself when array only includes one item");
        }

        @Test
        void testArrayWithMultipleItems() {
            int[] input1 = new int[]{1, 2, 3};          // 2
            int[] input2 = new int[]{40, 16, 5, 8};     // 17.25
            int[] input3 = new int[]{-1, -2, -3};       // -2
            int[] input4 = new int[]{-40, 16, -5, 8};   // -21

            double expected1 = 2.00;
            double expected2 = 17.25;
            double expected3 = -2.00;
            double expected4 = -5.25;

            assertAll(
                    () -> assertEquals(expected1, kata.calculateMean(input1), "returns calculated mean for all positive & sequential numbers"),
                    () -> assertEquals(expected2, kata.calculateMean(input2), "returns calculated mean for all positive & non-sequential numbers"),
                    () -> assertEquals(expected3, kata.calculateMean(input3), "returns calculated mean for all negative & sequential numbers"),
                    () -> assertEquals(expected4, kata.calculateMean(input4), "returns calculated mean for all mixed & non-sequential numbers")

            );
        }
     }
}