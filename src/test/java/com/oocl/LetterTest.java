package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LetterTest {
    @Test
    public void should_return_a_when_give_a_letter(){
        //given
        String input = "a";
        //when
        List<String> output =  Letter.permute(input);
        //then
        Assert.assertEquals(Arrays.asList("a"),output);
    }

    @Test
    public void should_return_ab_ba_when_give_ab(){
        //given
        String input = "ab";
        //when
        List<String> output =  Letter.permute(input);
        //then
        Assert.assertEquals(Arrays.asList("ab","ba"),output);
    }

    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_give_abc(){
        //given
        String input = "abc";
        //when
        List<String> output =  Letter.permute(input);
        //then
        Assert.assertEquals(Arrays.asList("abc","acb","bac","bca","cab","cba"),output);
    }

    @Test
    public void should_return_permutation_size_24_when_give_abcd(){
        //given
        String input = "abcd";
        //when
        List<String> output =  Letter.permute(input);
        //then
        Assert.assertEquals(24,output.size());
    }
}
