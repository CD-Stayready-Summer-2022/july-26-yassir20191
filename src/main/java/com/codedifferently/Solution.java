package com.codedifferently;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        String[] chars = input.split("");
        StringBuilder str = new StringBuilder();
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for (String string:chars) {
            map.merge(string,1, Integer::sum);
        }

        for(String string: map.keySet()){
            str.append(string);
            str.append(":");
            str.append(map.get(string));
            str.append(" ");
        }

        return str.toString().substring(0,str.length()-1);



    }
}
