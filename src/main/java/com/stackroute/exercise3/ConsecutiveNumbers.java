package com.stackroute.exercise3;


public class ConsecutiveNumbers {
    boolean result = false;

    public boolean checkConsecutive(String values) {
        String[] array = values.split(",");
 // for increasing order of numbers
        for (int i = 0; i < array.length - 1; i++) { //travelling array length
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]); // for finding difference between numbers
            if ( difference == 1) {
                result = true;
            }
            else {
                result=false;
                break;
            }

        }
// for decreasing order of numbers
        for (int i = 0; i < array.length - 1; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);// finding difference between numbers
            if ( difference == -1) {
                result = true;
            }
            else {
                result=false;
                break;
            }

        }
        return result;
    }
}