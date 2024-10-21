package Set;

import java.util.HashSet;
import java.util.Set;

//You are given n distinct pairs. Each pair is numbered from 1 to n. All these pairs are initially put in a bag.
//You need to pair up each number. You take numbers one by one from the bag and for each number you look
//whether the pair of this number has already been taken out of the bag, or not. If not (that means the pair of
//this number is still in the bag), you put the current number on the table in front of him. Otherwise, you put
//both numbers from the pair aside. Print the maximum number of numbers that were on the table at the same
//time.
public class problem {
    public static int tableCount(int [] arr)
    {
        int tbcnt = 0;
        int maxCount = 0;
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<arr.length;i++)
        {
            if(st.contains(arr[i]))
            {
                tbcnt--;
            }else{
                st.add(arr[i]);
                tbcnt++;
            }
            maxCount = Math.max(maxCount,tbcnt);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int [] arr = {1,1};
        int tbCnt = tableCount(arr);
        System.out.println(tbCnt);
    }
}
