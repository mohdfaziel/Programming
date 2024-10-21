package binarysearch;
//Search the 'target' value in a 2d integer matrix of dimensions n x m and retum true if found, else retum false.
//This matrix has the following properties:
//Integers in each row are sorted from left to right
//The first integer ofeach row is greater than the last integer Of the previous row.
//2,
public class prob3 {
    static boolean ans(int [][] matrix,int target)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*m-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c]==target)
            {
                return true;
            }else if(matrix[r][c]<target)
            {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(ans(matrix,3));
    }
}
