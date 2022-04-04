package com.company;

import java.util.HashMap;
import java.util.Set;

public class Max_Freq_Char {
    public static void main(String[] args) {
        String str = "aaas";
        System.out.println(maxFreqChar(str));
    }
    private static  char maxFreqChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch, val+1);
            }
            else{
                map.put(ch,1);
            }
        }
        Set<Character> keyset =map.keySet();
        int maxFreq = Integer.MIN_VALUE;
        char maxChar = ' ';
        for (char key: keyset) {
            if(map.get(key)> maxFreq){
                maxFreq = map.get(key);
                maxChar = key;
            }
        }
        return maxChar;
    }

}
