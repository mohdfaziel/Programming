package Strings;
//Java Program to reverse each word
//in String
//Input - I am an educator
//Output - I ma na rotacude
public class prob3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("i am an educator");
        StringBuilder temp = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");

        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==' '){
                temp.reverse();
                ans.append(temp+" ");
                temp.delete(0,temp.length());
            }
            temp.append(str.charAt(i));
        }
        temp.reverse();
        ans.append(temp);
        System.out.println(ans);
    }
}
