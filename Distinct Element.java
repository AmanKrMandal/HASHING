package com.company;

import java.util.HashSet;
import java.util.Set;

public class DistinctElemen {
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,3,3,5,2,};
        distinct(arr);
    }
    static  void distinct(int []arr){
        Set<Integer> set = new HashSet<>();
        for (int element:arr) {
            set.add(element);
        }
        System.out.println(set.size());
    }
}
