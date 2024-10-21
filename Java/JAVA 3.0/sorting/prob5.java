package sorting;

public class prob5 {
    static void ans(int [] arr)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }else if(arr[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        int index = 0;
        while(zero--!=0)
        {
            arr[index++] = 0;
        }
        while(one--!=0)
        {
            arr[index++] = 1;
        }
        while(two--!=0)
        {
            arr[index++] = 2;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,2,1,0,0,2,1,2,1};
        ans(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
