package RECURSION.ONSTRINGS;

public class removeOccurences {
    static String remove(String data,int idx,char target)
    {
        if(idx==data.length())
        {
            return "";
        }
        char currentChar = data.charAt(idx);
        if(currentChar==target) return remove(data,idx+1,target);
        else return currentChar+remove(data,idx+1,target);
    }
    static String remove2(String data,char target)
    {
        if(data.length()==0) return "";
        String smallprob = remove2(data.substring(1),target);
        char currentChar = data.charAt(0);
        if(currentChar==target)
        {
            return smallprob;
        }else {
            return currentChar + smallprob;
        }
    }

    public static void main(String[] args) {
        System.out.println(remove("abxav",0, 'a'));
        System.out.println(remove2("agkjeijgadffigjaaaaikhaa", 'a'));
    }
}
