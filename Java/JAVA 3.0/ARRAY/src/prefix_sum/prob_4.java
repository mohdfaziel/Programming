package prefix_sum;
// suffix sum
public class prob_4 {
    static void sufSum(int[] arr)
    {
        for(int i = arr.length-2;i>=0;i--)
        {
            arr[i] = arr[i+1] + arr[i];
        }
    }

}
