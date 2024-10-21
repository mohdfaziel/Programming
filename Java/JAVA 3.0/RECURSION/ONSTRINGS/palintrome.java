package RECURSION.ONSTRINGS;

public class palintrome {
    //non recursive appround
    static boolean ispalin(String s)
    {
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean recPalin(String s, int left,int right)
    {
        if(left>=right) return true;
        if(s.charAt(left)!= s.charAt(right)) return false;
        return recPalin(s,left+1,right-1);
    }

    public static void main(String[] args) {
        String s = "level";
        System.out.println(recPalin(s,0,s.length()-1));
    }

}
