package leetcode.ARRAYS;
import java.util.*;
import java.lang.*;
public class MergingSubIntervals {
    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // Sort by second element if first elements are the same
                } else {
                    return a[0] - b[0]; // Sort by first element
                }
            }
        });
        int st = arr[0][0];
        int fl = arr[0][1];
        List<int[]> lt = new ArrayList<>();
        for(int i = 1;i<arr.length;i++)
        {
            if (arr[i][0] <= fl) {
                fl = Math.max(fl, arr[i][1]);
            }else
            {
                lt.add(new int[]{st, fl});
                st = arr[i][0];
                fl = arr[i][1];
            }
        }
        lt.add(new int[]{st, fl});
        int[][] intervals = lt.toArray(new int[lt.size()][]);
        for(int i = 0;i<intervals.length;i++)
        {
            for(int j = 0;j<2;j++)
            {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
    }
}