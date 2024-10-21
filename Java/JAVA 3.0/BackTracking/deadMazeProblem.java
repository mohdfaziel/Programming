package BackTracking;
import java.util.Scanner;

public class deadMazeProblem {
    public static void count(int sr,int sc,int re,int ce,String st,int [][] maze)
    {
        if(sr < 0 || sc < 0) return;
        if(sr > re || sc > ce) return;
        if(maze[sr][sc] == -1 || maze[sr][sc] == 0) return;
        if(sr==re && sc == ce){
            System.out.println(st);
            return;
        }
        maze[sr][sc] = -1;
        count(sr+1,sc,re,ce,st+"D",maze);
        count(sr,sc-1,re,ce,st+"L",maze);
        count(sr,sc+1,re,ce,st+"R",maze);
        count(sr-1,sc,re,ce,st+"U",maze);

        maze[sr][sc] = 1;


    }
    public static void main(String[] args) {
        int [][] maze = {
                    {1,1,0,1},
                    {1,1,1,1},
                    {0,1,0,1}};
        int r = 3;
        int c = 4;
//        boolean [][] visited = new boolean[r][c];
        count(0,0,r-1,c-1,"",maze);
    }
}
