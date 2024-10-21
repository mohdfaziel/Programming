package QUEUES;
import java.util.*;

public class firstNegativeInTheWindowOfSizeK {
    class Compute {

        public static long[] printFirstNegativeInteger(long A[], int N, int K)
        {
            Queue<Integer> q = new LinkedList<>();
            long [] res = new long[N-K+1];
            for(int i = 0;i<N;i++)
            {
                if(A[i]<0) q.add(i);
            }

            for(int i = 0;i<N-K+1;i++)
            {
                if(!q.isEmpty() && q.peek() < i) q.remove();
                if(!q.isEmpty() && q.peek() <= i+K-1)
                {
                    res[i] = A[q.peek()];
                }else{
                    res[i] = 0;
                }
            }
            return res;
        }

    }
    public static void main(String[] args) {
        long [] arr = {12,-1,-7,8,-15,30,16,28};
        long [] ans = Compute.printFirstNegativeInteger(arr,arr.length,3);
        for(int i = 0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
