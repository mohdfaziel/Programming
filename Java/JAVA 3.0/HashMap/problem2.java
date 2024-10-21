package HashMap;

import java.util.*;

// largest subarray with sum 0
public class problem2 {
    public static void main(String[] args) {
        int [] arr = {15,2,-2,-8,7,1,10};
        Map<Integer,Integer> mp = new HashMap<>();
        int max = 0;
        int preSum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            preSum += arr[i];
            if(mp.containsKey(preSum))
            {
                if(max<(i-mp.get(preSum)))
                {
                    max = mp.get(preSum);
                }
            }else{
                mp.put(preSum,i);
            }
        }
        System.out.println(max);
    }
}
