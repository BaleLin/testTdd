package com.oocl;

import java.util.Arrays;
import java.util.List;

public class Letter {
    public static List<String> permute(String input) {
        if(input.length()==2){
            return Arrays.asList(input,input.substring(1,2)+input.substring(0,1));
        }
        return Arrays.asList(input);
    }
}
