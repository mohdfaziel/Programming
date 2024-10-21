package BackTracking;

import javax.lang.model.element.NestingKind;

public class StringPermutations {
    public static void combination(String bigStr, String smallStr)
    {
        if(bigStr.length()==0)
        {
            System.out.println(smallStr);
            return;
        }
        for(int i = 0;i<bigStr.length();i++)
        {
            char ch = bigStr.charAt(i);
            String l = bigStr.substring(0,i);
            String r = bigStr.substring(i+1);
            String rem = l+r;
            combination(rem,smallStr+ch);
        }
    }

    public static void main(String[] args) {
        String x = "abc";
        combination(x,"");
    }
}
