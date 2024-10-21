package sorting;
//Given an integer array arr, move all 0's to the end of it while maintaining the relative order of
//the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class problem1 {
    static void sol(int [] arr)
    {
        int n = arr.length;
        for(int i = 0; i< n-1;i++)
        {
            boolean flag = true;
            for(int j = 0; j<n-i-1;j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,5,0,3,0,2};
        sol(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
