package BackTracking;

import java.sql.SQLOutput;

public class k_knights {
    static int maxknights = -1;
    public static boolean isSafe(char [][] board,int row, int col)
    {
        int n = board.length;
        int i,j;
        //up right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && board[i][j]=='K') return false;
        //up left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;
        //right up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && board[i][j]=='K') return false;
        //right down
        i = row+1;
        j = col+2;
        if(i<n && j<n && board[i][j]=='K') return false;
        //down right
        i = row+2;
        j = col+1;
        if(i<n && j<n && board[i][j]=='K') return false;
        //down left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && board[i][j]=='K') return false;
        //left up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;
        //left down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && board[i][j]=='K') return false;
        return true;
    }
    public static void knights(char [][] board,int row,int col, int count)
    {
        int n = board.length;
        if(row == n)
        {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
            System.out.println();
                maxknights = Math.max(maxknights,count);
            return;
        }else if(isSafe(board,row,col))
        {
            board[row][col] = 'K';
            if(col != n-1) knights(board,row,col+1,count+1);
            else knights(board,row+1,0,count+1);
            board[row][col] = 'X';
        }
        if(col != n-1) knights(board,row,col+1,count);
        else knights(board,row+1,0,count);

    }

    public static void main(String[] args) {
        int n = 3;
        char [][] board = new char[n][n];
        for(int i= 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                board[i][j] = 'X';
            }
        }
        System.out.println("Printing all the configurations");
        knights(board,0,0,0);
        System.out.println("Max no. of knights could be placed is: "+maxknights);
    }
}
