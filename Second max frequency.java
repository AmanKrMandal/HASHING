package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxFreq {
    public static void main (String[] args) {

        int arr[] = {1, 5, 1,3, 3, 2, 1};
        System.out.println(mostFrequent(arr));
    }

    static int mostFrequent(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            int key = arr[i];
            if(map.containsKey(key))
            {
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            }
            else
            {
                map.put(key, 1);
            }
        }
        int max_count = 0, res = -1, sec_max_count= 0;

        for(Map.Entry<Integer, Integer> val : map.entrySet())
        {
            if(max_count< val.getValue()){
                sec_max_count=max_count;
                max_count= val.getValue();
            }
            else if(sec_max_count< val.getValue() && max_count> val.getValue()){
                res = val.getValue();
                sec_max_count= val.getValue();

            }
        }
        return res;
    }
}

