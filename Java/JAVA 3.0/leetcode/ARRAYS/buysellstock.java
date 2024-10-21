package leetcode.ARRAYS;

public class buysellstock {
    static int profit(int [] arr)
    {
        int pf = 0;
        int buy=arr[0];
        int sell=0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<buy)
            {
                buy = arr[i];
            }
            if(pf<arr[i]-buy)
            {
                pf = arr[i]-buy;
            }
        }
        return pf;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,4,5,6,3};
        System.out.println(profit(arr));
    }
}
