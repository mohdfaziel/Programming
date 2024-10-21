package RECURSION.ARRAYS;

public class find_element {
    static void search(int[] arr,int element,int idx)
    {
        if(idx==arr.length)
        {
            System.out.println("Element is not present in the array");
            return;
        }
        if(arr[idx]==element)
        {
            System.out.println("Element is present at the index "+idx);
            return;
        }
        search(arr,element,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,7,33,89,4,12,64,78,34,6,2,87};
        search(arr,31,0);
    }
}
