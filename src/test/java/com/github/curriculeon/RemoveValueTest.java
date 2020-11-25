package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class RemoveValueTest {

    private void test(String[] array, String[] expected, String word) {
        String[] actual = StringArrayUtils.removeValue(array, word);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue() {
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word = "The";
        test(array, expected, word);
    }

    @Test
    public void testRemoveValue1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word = "quick";
        test(array, expected, word);
    }

    @Test
    public void testRemoveValue2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word = "brown";
        test(array, expected, word);
    }


}

