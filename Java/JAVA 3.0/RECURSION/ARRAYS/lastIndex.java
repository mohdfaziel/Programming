package RECURSION.ARRAYS;

public class lastIndex {
    static int index(int[] arr,int target,int idx)
    {
        if(idx<0) {
            System.out.println("Element is not present");
            return -1;
        }
        if(arr[idx]==target)
        {
            return idx;
        }
        return index(arr,target,idx-1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,4,7,2,46,2,75,1};
        System.out.println(index(arr,22,arr.length-1));
    }
}
