package sorting;
//Duch national flag problem
public class prob6 {
    static void ans(int [] nums)
    {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {0,2,1,2,0,0};
        ans(nums);
        for(int i = 0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
