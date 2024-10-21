package RECURSION.ARRAYS;

public class max_elemet {
    static int maxElement(int[] arr,int idx,int max)
    {
        if(idx==arr.length)
        {
            return max;
        }
        max = Math.max(arr[idx],max);
        return maxElement(arr,idx+1,max);
    }
    static int maxElement2(int[] arr,int idx)
    {
        if(idx==arr.length)
        {
            return arr[idx-1];
        }
        return Math.max(arr[idx],maxElement2(arr,idx+1));
    }

    public static void main(String[] args) {
        int[] arr = {2,5,2,7,34,87,24,65,15};
        int max = maxElement(arr,0,arr[0]);
        System.out.println("Max element of the array is: "+max);

        max = maxElement2(arr,0);
        System.out.println("Max element of the array is: "+max);
    }
}
