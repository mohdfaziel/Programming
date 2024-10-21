package leetcode.ARRAYS;

public class pascalRow {
    public static void printRow(int r)
    {
//        for(int j = 0;j<r;j++)
//        {
//            int ans = 1;
//            int row = j;
//            System.out.print(ans+" ");
//            for(int i = 1;i<=j;i++)
//            {
//                ans = (ans * row--)/i;
//                System.out.print(ans+" ");
//            }
//            System.out.println();
//        }
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                int n = 1;
                int d = 1;
                for(int k = 0;k<j;k++)
                {
                    
                }
            }
        }
    }
    public static void main(String[] args){
        printRow(4);
    }
}
