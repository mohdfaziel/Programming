package Strings;
//The string should be compressed such that consecutive
//duplicates of characters are replaced with the character,
//and followed by the number of consecutive duplicates.
//Input - aaabbbbccddde
//a3b4c2d3e
//Output -
public class prob4 {
    public static void main(String[] args) {
        String str = "aaabbbbcdddeeee";
        StringBuilder ans = new StringBuilder("");
        ans.append(str.charAt(0));
        int count = 1;
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }else{
                if(count!=1) {
                    ans.append(count);
                }
                    ans.append(str.charAt(i));
                    count = 1;
            }
        }
        if(count!=1){
            ans.append(count);
        }
        System.out.println(ans);
    }
}
