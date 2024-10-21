package binarysearch.rotatedarray;

//A rotated sorted array is a sorted array on which rotation operation has been performed some
//number of times. Given a rotated sorted array, find the index of the minimum element in the array.
//Follow 0-based indexing.
//It is guaranteed that all the elements in the array are unique.
public class prob1 {
    static int ans(int [] arr)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int min = arr[0];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]<=arr[n-1])
            {
                min = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,2,3};
        System.out.println(ans(arr));
    }

}
