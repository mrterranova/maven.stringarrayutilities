package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0; i < array.length; i++){
            if (array[i].contains(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for(int i=0; i < array.length; i++){
            reverse[i] = array[Math.abs(i-(array.length-1))];
        }
        System.out.print(reverse);
        return reverse;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        if ( array.equals(reverse(array))) return true;
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i", "j", "k", "l","m","n","o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        boolean[] allLetters = new boolean[array.length];
        if (array.length < 26) return false;
        for (int i=0; i < alpha.length; i++) {
            if (alpha[i] == array[i]){
                allLetters[i] = true;
            } else {
                allLetters[i] = false;
            }
        }
        for(int j=0; j < allLetters.length; j++){
            if(allLetters[j]) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i=0; i< array.length; i++){
            if(value==array[i]) count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
//        String[] newStr = new String[array.length];
        List<String> newList = new ArrayList<>();
        for(int i=0; i< array.length; i++) {
            if(valueToRemove == array[i]){
                continue;
            } else {
                newList.add(array[i]);
            }
        }
        return (String[]) newList.toArray();
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }
}
