package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letter {
    public static List<String> permute(String input) {

        if (input.length() >1) {
            List<String> permutation = new ArrayList<String>();


            for (int index = 0; index < input.length(); index++) {
                List<String> temp = permute(removeCharByIndex(input, index));
                for (int j = 0; j < temp.size(); j++) {
                    permutation.add(input.substring(index, index + 1) + temp.get(j));
                }
            }
            return permutation;
        }
        return Arrays.asList(input);
    }

    private static String removeCharByIndex(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}
