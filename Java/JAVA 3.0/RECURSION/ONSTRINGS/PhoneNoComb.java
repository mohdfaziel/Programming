package RECURSION.ONSTRINGS;

import java.util.Scanner;

public class PhoneNoComb {
    static void combinations(String dig,String[] kp,String currCombination)// e.g 235
    {
        if(dig.isEmpty())
        {
            System.out.print(currCombination+" ");
            return;
        }
        int currNum = dig.charAt(0) - '0'; // 2
        String currChoices = kp[currNum]; // abc
        for(int i = 0;i<currChoices.length();i++)
        {
            combinations(dig.substring(1),kp,currCombination+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String[] keypad = {"",
                                "","abc","def",
                              "ghi","jkl","mno",
                             "pqrs","tuv","wxyz"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits");
        String dig = sc.next();
        System.out.println("All the possible combinations of the characters at these digits are ");
        combinations(dig,keypad,"");
    }
}
