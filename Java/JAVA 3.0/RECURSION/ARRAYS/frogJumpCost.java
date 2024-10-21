package RECURSION.ARRAYS;

public class frogJumpCost {
    //wrong approach as it causes out of bounds
//    static int cost(int[] height,int idx,int cost)
//    {
//        if(idx >= height.length)
//        {
//            return cost;
//        }
//        int cost1 = height[idx+1]-height[idx];
//        int cost2 = height[idx+2]-height[idx];
//        if(cost1<cost2)
//        {
//            return cost(height,idx+1,cost+cost1);
//        }else{
//            return cost(height,idx+2,cost+cost2);
//        }
//    }
//
    static int cost(int[] h,int n,int idx)
    {
        if(idx==n-1)
        {
            return 0;
        }
        int path1 = cost(h,n,idx+1)+ Math.abs(h[idx+1]-h[idx]);
        if(idx==n-2) return path1;
        int path2 = cost(h,n,idx+2)+ Math.abs(h[idx+2]-h[idx]);
        return Math.min(path1,path2);
    }
    public static void main(String[] args){
        int[] arr = {10,30,40,20};
        System.out.println(cost(arr,arr.length,0));
    }

}
