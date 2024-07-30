package org.northcoders;

public class Kata03 {
    public int calculateSumAscii(String str){
        if(str == null) throw new IllegalArgumentException("input should not be null");
        if(str.isEmpty()) throw new IllegalArgumentException("input should not be empty");

        // initialize the sum
        int sum = 0;
        // iterate the string
        for (int i = 0; i < str.toCharArray().length; i++) {
            // convert current char to ascci int
            // increment sum with current int
            int asciiValue = (int) str.charAt(i);
            sum += asciiValue;
        }
        return sum;
    }
}
