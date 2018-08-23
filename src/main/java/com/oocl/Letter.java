package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letter {
    public static List<String> permute(String input) {
        if(input.length()==2){
            return Arrays.asList(input,input.substring(1,2)+input.substring(0,1));
        }
        if(input.length()==3){
            List<String> permutation = new ArrayList<String>();

            permutation.add(input);
            permutation.add(input.substring(0,1)+input.substring(2,3)+input.substring(1,2));
            permutation.add(input.substring(1,2)+input.substring(0,1)+input.substring(2,3));
            permutation.add(input.substring(1,2)+input.substring(2,3)+input.substring(0,1));
            permutation.add(input.substring(2,3)+input.substring(0,1)+input.substring(1,2));
            permutation.add(input.substring(2,3)+input.substring(1,2)+input.substring(0,1));

            return permutation;

        }
        return Arrays.asList(input);
    }
}
