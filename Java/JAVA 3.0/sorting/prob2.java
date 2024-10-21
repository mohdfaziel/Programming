package sorting;
//
public class prob2 {
    static void sol(String [] arr)
    {
        int n = arr.length;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                // s1.comparesTo(s2): if s1<s2 it gives -ve value else +ve but if s1==s2 give 0
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String [] arr = {"kiwi","apple","papaya","mango"};
        sol(arr);
        for(String i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
