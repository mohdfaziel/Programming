package RECURSION.ONSTRINGS;
import java.util.ArrayList;
import java.util.Scanner;

public class subsequences {
//wap to return all the subsequences of a string in the arraylist
    static ArrayList<String> SSQ(String s) // abc
    {
        ArrayList<String> ssq = new ArrayList<>();
        if(s.isEmpty())
        {
            ssq.add("");
            return ssq;  // " "
        }
        char currChar = s.charAt(0);
        ArrayList<String> smallProb = SSQ(s.substring(1)); // bc b c " "
        for(String ss:smallProb)
        {
            ssq.add(currChar+ss); // abc ab ac a
            ssq.add(ss); // bc b c " "
        }
        return ssq; // abc ab ac a bc b c " "
    }
    //wap to print all the subsequences of the string
    static void printSsq(String s,String currSub)
    {
        if(s.isEmpty())
        {
            System.out.print(currSub+" ");
            return;
        }
        char currChar = s.charAt(0);
        String remainingString = s.substring(1);
        printSsq(remainingString,currSub+currChar);
        printSsq(remainingString,currSub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
//        ArrayList<String> ssq = SSQ(s);
//        System.out.println("All the subsequences of the string are: ");
//        System.out.println(ssq);
        printSsq(s,"");
    }
}
