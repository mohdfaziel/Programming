package Strings;

import java.util.Scanner;

// convert characters of the string fromm lowercase to uppercase and fromm uppercase to lowercase
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("String before "+str);
        for(int i = 0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ch==' ' || ascii < 65){
                continue;
            }
            char ch_;
            if(ascii<97)
            {
                ch_ = (char)(ascii+32);
            }else{
                ch_ = (char)(ascii-32);
            }
            str.setCharAt(i,ch_);
        }
        System.out.println("String After "+str);
    }
}
