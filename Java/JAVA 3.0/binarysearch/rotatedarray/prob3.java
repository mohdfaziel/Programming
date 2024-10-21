package binarysearch.rotatedarray;
//Search element in rotated sorted array with duplicate elements. Return true if the element is found,
//else return false.
public class prob3 {
    static boolean ans(int [] nums,int target)
    {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
            {
                return true;
            }else if(nums[low]== nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
            }
            else if(nums[mid]<=nums[high]) //means mid to end is sorted
            {
                if(nums[mid]<target && nums[high]>=target)
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }else //start to mid is sorted
            { // nums[mid] > nums[high]
                if(nums[low]<=target && nums[mid]>target)
                {
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums= {2,5,6,0,0,1,2};
        System.out.println(ans(nums,0));
    }
}
