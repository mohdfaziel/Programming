package binarysearch;

//Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence
//of x is found then return -1.
public class prob1 {
    static int ans(int [] arr,int target)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
            {
                index = mid;
                high = mid-1; // low = mid+1 for last
                // occurance
            }else if(arr[mid]<target)
            {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,5,5,5,5,5,5,7,9,9,9};
        System.out.print(ans(arr,5));
    }
}
