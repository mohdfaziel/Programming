package BackTracking;

public class mazeProblem_1_print {
    public static void count(int rs, int cs, int re, int ce, String st)
    {
        if(rs>re || cs > ce) return;
        if(rs==re && cs ==ce) {
            System.out.println(st);
            return;
        }
        count(rs+1,cs,re,ce,st+"D");
        count(rs,cs+1,re,ce,st+"R");
    }
    public static void main(String[] args) {
        count(0,0,2,2,"");
    }
}
