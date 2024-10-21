package leetcode.ARRAYS;

public class sSmallest {
    public static void main(String[] args) {
        int arr [] = {1,1,5,7,2,5,2,2,4,5};
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++)
        {
            if(smallest>arr[i])
            {
                sSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] < sSmallest)
            {
                sSmallest = arr[i];
            }
        }
        System.out.println(sSmallest);
    }
}
