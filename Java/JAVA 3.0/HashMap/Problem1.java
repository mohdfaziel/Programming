package HashMap;
import java.util.*;
public class Problem1
{
    static void maxOccur(int [] arr)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            int x = arr[i];
            if(mp.get(x)==null)
            {
                mp.put(x,1);
            }else{
                mp.put(x,mp.get(x)+1);
            }
        }
        int max = 0;
        int ans = -1;
        for(int x:mp.keySet()){
            if(max<mp.get(x))
            {
                max = mp.get(x);
                ans = x;
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int [] arr = {1,7,2,4,7,1,2,7,8,1,7};

        maxOccur(arr);
    }
}
