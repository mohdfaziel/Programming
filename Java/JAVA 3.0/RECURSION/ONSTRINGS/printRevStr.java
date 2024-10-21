package RECURSION.ONSTRINGS;

public class printRevStr {
//    static void printStr(String data,int idx)
//    {
//        if(idx==0){
//            System.out.println(data.charAt(idx));
//            return;
//        }
//        System.out.println(data.charAt(idx));
//        printStr(data,idx-1);
//    }
    static String printStr(String data,int idx)
    {
       if(idx==data.length()) return "";
       String smallprob = printStr(data,idx+1);
       char currentChar = data.charAt(idx);
       return smallprob + currentChar;
    }

    public static void main(String[] args) {
        String data = "faziel";
        System.out.println(printStr(data,0));
    }
}
