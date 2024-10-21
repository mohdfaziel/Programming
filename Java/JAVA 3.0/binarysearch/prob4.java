package binarysearch;
public class prob4 {
    static boolean ans(int [][] matrix,int target)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j >= 0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }else if(matrix[i][j]>target)
            {
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        System.out.println(ans(matrix,18));
    }
}
