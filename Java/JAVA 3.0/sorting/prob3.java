package sorting;
//Given an array where all its elements are sorted in increasing order except two
//        swapped elements, sort it in linear time. Assume there are no duplicates in the array.
public class prob3 {
    static void sol(int [] arr)
    {
        if(arr.length<= 1){
            return;
        }
        int x = -1;
        int y = -1;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                if(x==-1)
                {
                    x = i-1;
                    y = i;
                }
                else
                {
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {3,8,6,7,5,9,10};
        sol(arr);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
