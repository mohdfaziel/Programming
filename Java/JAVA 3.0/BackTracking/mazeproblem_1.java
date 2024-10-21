package BackTracking;

public class mazeproblem_1 {
    public static int count(int rs, int cs, int re, int ce)
    {
        if(rs==re || cs ==ce) return 1;
        int onePortion = count(rs+1,cs,re,ce);
        int secondPortion = count(rs,cs+1,re,ce);
        return onePortion + secondPortion;
    }

    public static void main(String[] args) {
        System.out.println(count(0,0,2,2));
    }
}
