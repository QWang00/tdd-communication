package org.northcoders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.northcoders.Kata04.STATUS.*;

class Kata04Test {

    Kata04 kata;
    @BeforeEach
    void setUp() {
        kata = new Kata04();
    }

    @Nested
    @DisplayName ("Test buttonResult method")
    class buttonResult {

        @Test
        void testSameCountBetweenLikeDislike(){
            Kata04.STATUS[] input = new Kata04.STATUS[] {LIKE, DISLIKE};
            Kata04.STATUS expected = NEUTRAL;
            assertEquals(expected, kata.buttonResult(input), "return Neutral when inputs counts are same");
        }

        @Test
        void testDifferentCountBetweenLikeDislike(){
            Kata04.STATUS[] input = new Kata04.STATUS[]{LIKE};
            Kata04.STATUS expected = LIKE;
            assertEquals(expected, kata.buttonResult(input), "return status with bigger count of button when counts differ betwen like and dislike");

        }

        @Test
        void testSingleOccurance(){
            Kata04.STATUS[] input = new Kata04.STATUS[]{DISLIKE, DISLIKE};
            Kata04.STATUS expected = NEUTRAL;
            assertEquals(expected, kata.buttonResult(input), "return NEUTRAL when count of single button is even");

        }
    }

}