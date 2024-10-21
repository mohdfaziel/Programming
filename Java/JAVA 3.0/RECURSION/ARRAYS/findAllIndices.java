package RECURSION.ARRAYS;
import java.util.ArrayList;
public class findAllIndices {
    //returning arrayList containing indices
    static ArrayList<Integer> indexSearch2(ArrayList<Integer> indices,int[] arr,int target,int idx)
    {
        if(idx>=arr.length)
        {
            return indices;
        }
        if(arr[idx]==target)
        {
            indices.add(idx);
        }
        return indexSearch2(indices,arr,target,idx+1);
    }
    static void indexSearch(int[] arr,int target,int idx )
    {
        if(idx>=arr.length) return;
        if(arr[idx]==target)
        {
            System.out.print(idx+" ");
        }
        indexSearch(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,2,4,7,2,7,9,2,45,67,8};
        indexSearch(arr,2,0);
        ArrayList<Integer> indices = new ArrayList<>();
        System.out.println(indexSearch2(indices,arr,8,0));
    }
}
