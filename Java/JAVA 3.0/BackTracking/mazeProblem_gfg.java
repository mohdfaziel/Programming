package BackTracking;
import java.util.*;

public class mazeProblem_gfg {
    public static void move(int sr,int sc,int re,int ce,ArrayList<String> lt,int [][] maze, String str)
    {
        if(sr<0 || sc < 0) return;
        if(sr>re || sc > ce) return;
        if(maze[sr][sc] == -1 || maze[sr][sc] == 0) return;
        if(sr==re && sc == ce)
        {
            lt.add(str);
            return;
        }
        maze[sr][sc] = -1;
        move(sr+1,sc,re,ce,lt,maze,str+"D");
        move(sr,sc-1,re,ce,lt,maze,str+"L");
        move(sr,sc+1,re,ce,lt,maze,str+"R");
        move(sr-1,sc,re,ce,lt,maze,str+"U");
        maze[sr][sc] = 1;
    }
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> lt = new ArrayList<>();
        if(mat[0][0] == 0)
        {
            lt.add("-1");
            return lt;
        }
        int r = mat.length;
        int c = mat[0].length;
        move(0,0,r-1,c-1,lt,mat,"");
        if(lt.size()==0)
        {
            lt.add("-1");
        }
        return lt;
    }
}