package RECURSION.ARRAYS;

public class sum {
    static int sum(int[] arr,int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        return  arr[idx]+sum(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println("Sum of the array is: "+sum(arr,0));
    }
}
