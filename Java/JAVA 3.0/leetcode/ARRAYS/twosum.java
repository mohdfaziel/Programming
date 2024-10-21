package leetcode.ARRAYS;

public class twosum {
    static void ans(int [] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == 9) {
                    System.out.println(i + "," + j + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        ans(arr);
    }
}
