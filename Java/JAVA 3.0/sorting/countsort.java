package sorting;

public class countsort {
    static int max(int [] arr)
    {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    static void display(int [] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void count(int [] arr)
    {
        int n = arr.length;
        int max_ = max(arr);
        int [] countArr = new int[max_+1];
        for(int i = 0;i<n;i++)
        {
            countArr[arr[i]]++;
        }
        int k = 0;
        for(int i = 0;i<countArr.length;i++)
        {
            for(int j =0;j<countArr[i];j++)
            {
                arr[k++] = i;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = {2,6,3,4,8,1,5,7};
        count(arr);
        display(arr);
    }
}
