package BackTracking;
import java.util.Scanner;

public class mazeProb2 {
    public static void count(int sr,int sc,int re,int ce,String st,boolean [][] visited)
    {
        if(sr < 0 || sc < 0) return;
        if(sr > re || sc > ce) return;
        if(visited[sr][sc] == true) return;
        if(sr==re && sc == ce){
            System.out.println(st);
            return;
        }
        visited[sr][sc] = true;
        count(sr+1,sc,re,ce,st+"D",visited);
        count(sr,sc-1,re,ce,st+"L",visited);
        count(sr,sc+1,re,ce,st+"R",visited);
        count(sr-1,sc,re,ce,st+"U",visited);

        visited[sr][sc] = false;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and colums");
        int r = sc.nextInt();
        int c = sc.nextInt();
        boolean [][] visited = new boolean[r][c];
        count(0,0,r-1,c-1,"",visited);
    }
}
