package RECURSION.ARRAYS;

public class isSorted {
    static boolean isSorted(int[] arr,int idx)
    {
        if(idx>=arr.length-1)
        {
            return true;
        }
        if(arr[idx]<arr[idx+1])
        {
           return isSorted(arr,idx+1);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9};
        System.out.println(isSorted(arr,0));
    }
}
