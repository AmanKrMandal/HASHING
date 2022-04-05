package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int []arr = {3,5,4,3,2,2,1,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int nums : arr) {
            Integer count = map.get(nums);
            if(count == null){
                map.put(nums, 1);
            }
            else {
                count++;
                map.put(nums, count);
            }
        }
//        Set<Map.Entry<Integer,Integer>> me = ;
        for (Map.Entry<Integer,Integer>es: map.entrySet()) {
            if(es.getValue()>1){
                System.out.println(es.getKey() + " ");
            }
        }
    }
}
