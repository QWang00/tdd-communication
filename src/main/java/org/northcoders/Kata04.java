package org.northcoders;

public class Kata04 {
    /*
    create an enum with 3 options
    input: LIKE, DISLIKE array
    output: LIKE, DISLIKE, OR NEUTRAL
    rule:
         1. 2 same button -> NEUTRAL
         2. 2 different button -> NEUTRAL
         3. 1 single button -> itself
         4. empty -> NEUTRAL
     */

    enum STATUS {
        LIKE,
        DISLIKE,
        NEUTRAL
    }

    public STATUS buttonResult(STATUS[] status) {
        if (status.equals(null)) throw new NullPointerException();
        if(status.length == 0) return STATUS.NEUTRAL;
        int countLike = 0;
        int countUnlike = 0;
        // iterate the array, {LIKE, LIKE, DISLIKE, DISLIKE, LIKE}
        for (int i = 0; i < status.length; i++) {
            // count numbers of LIKE(3), and DISLIKE(2)
            STATUS currentButton = status[i];
            if (currentButton == STATUS.LIKE) {
                countLike++;
            } else {
                countUnlike++;
            }

        }
        // check if they are even or odd, LIKE(odd), DISLIKE(even)
        // if they are even, initialize the count to 0.DISLIKE(0)
        // otherwise, the count is set to 1. LIKE(1)
        if (countLike % 2 == 0) {
            countLike = 0;
        } else {
            countLike = 1;
        }
        if (countUnlike % 2 == 0) {
            countUnlike = 0;
        } else {
            countUnlike = 1;
        }

        // compare the counts between LIKE and DISLIKE
        // if both 1, the outcome is NEUTRAL
        if (countLike == countUnlike) {
            return STATUS.NEUTRAL;
        }
        // if LIKE is 0 and UNLIKE is 1, the outcome is UNLIKE
        else if (countUnlike > countLike) {
            return STATUS.DISLIKE;
        } else {
            // otherwise, the outcome is LIKE
            return STATUS.LIKE;
        }
    }
}
