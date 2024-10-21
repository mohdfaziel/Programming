package binarysearch.rotatedarray;
//Given the rotated sorted numsay of integers, which contains distinct elements, and an integer target,
//return the index of target if it is in the numsay. Otherwise return -1
public class prob2 {
static int ans(int [] nums,int target)
{
    int n = nums.length;
    int low = 0;
    int high = n-1;
    while(low<=high)
    {
        int mid = low + (high-low)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]<nums[high]) //means mid to end is sorted
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
    return -1;
}

    public static void main(String[] args) {
    int [] nums= {3,4,5,6,1,2};
        System.out.println(ans(nums,3));
    }
}
