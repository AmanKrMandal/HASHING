package com.company;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
         int arr[]= {10,15,-5,15,-10,5};
         int sum= 5;
         subArray(arr,sum);
        }
        static void subArray(int arr[], int sum){
            int curSum = 0;
            int start =0;
            int end =0;
            HashMap<Integer,Integer> map= new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                curSum += arr[i];
                if (curSum -sum ==0){
                    start=0;
                    end = i;
                    break;
                }
                if(map.containsKey(curSum-sum)){
                    start= map.get(curSum-sum)+1;
                    end =i;
                    break;
                }
                map.put(curSum,i);
        }
            if(end == -1){
                System.out.println("not found");
            }
            else{
                System.out.println(start+" "+end);
            }
    }
}
