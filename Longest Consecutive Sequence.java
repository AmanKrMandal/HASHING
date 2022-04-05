package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestArray {
    public static void main(String[] args) {
        int [] arr={3,4,5,6,13,14,15,10,11,};
        System.out.println (LCA(arr));
    }
    private static ArrayList<Integer> LCA (int [] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int nm1 = arr[i] - 1;
            if (map.containsKey(nm1)) {
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);
            }
            int np1 = arr[i] + 1;
            if (map.containsKey(np1)) {
                map.put(np1, false);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int maxLenght = Integer.MIN_VALUE;
        int maxStaringNO= 0;
        for (int key:keys) {
            if(map.get(key)==true){
                int pstaringNo = key;
                int count = 0;
                while (map.containsKey(pstaringNo + count)){
                    count++;
                }
                if (count> maxLenght){
                    maxLenght= count ;
                    maxStaringNO = pstaringNo;
                }
            }
        }
        ArrayList<Integer> mr = new ArrayList<>();
        for (int i = 0; i < maxLenght; i++) {
            mr.add(maxStaringNO + 1);
        }
        return mr;
    }
}
