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
        int counter = 0;
        String[] reverse = new String[array.length];
        for (int i = array.length-1; i >=0; i--) {
            reverse[counter] = array[i];
            counter++;
        }
        return reverse;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String reverseStr = "", str ="";
        String[] revArr = reverse(array);
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            reverseStr += revArr[i];
        }

        if (str.equals(reverseStr)) return true;
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String concatArray = "";
        for(int i=0; i< array.length; i++){
            concatArray +=array[i];
        }

        int count = 0;
        for(int i=0; i < concatArray.length(); i++){
            for(int j=0; j < alphabet.length(); j++) {
                if (concatArray.charAt(i) == alphabet.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.print(count);
        if (count>=26) return true;
        return false;
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
        String[] vals = new String[array.length];
        int count = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] != valueToRemove){
                vals[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(vals, count);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String newStr = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] !=array[i-1] ){
                newStr += " " +array[i];
            }
        }
        return newStr.split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String str = array[0];
        List<String> list = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]){
                str += array[i];
            } else {
                list.add(str);
                str = "";
                str += array[i];
            }
        }
        list.add(str);

        String[] newArr = new String[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            newArr[i] = list.get(i);
            System.out.print(list.get(i)+ " ");
        }
        return newArr;
    }
}
