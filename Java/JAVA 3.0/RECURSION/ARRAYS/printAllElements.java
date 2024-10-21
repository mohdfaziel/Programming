package RECURSION.ARRAYS;

public class printAllElements {
    static void print(int[] arr,int size)
    {
        if(size==0)
        {
            return;
        }
        print(arr,size-1);
        System.out.println(arr[size-1]);
    }
    static void print2(int [] arr,int index)
    {
        if(index == arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        print2(arr,index+1);
    }

    public static void main(String[] args) {
        int[] ages= {1,53,566,223,553};
//        print(ages, ages.length);
        print2(ages,0);
    }
}
