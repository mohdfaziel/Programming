package RECURSION.ARRAYS;

public class sumOfSubsets {
    static void sumSubset(int[] arr,int currSum,int idx)
    {
        if(idx >= arr.length)
        {
            System.out.print(currSum+" ");
            return;
        }
        int currTerm = arr[idx];
        sumSubset(arr,currSum+currTerm,idx+1);
        sumSubset(arr,currSum,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        sumSubset(arr,0,0);
    }
}
