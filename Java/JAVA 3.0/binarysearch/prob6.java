package binarysearch;
//A new racing track for kids is being built in New York with 'n' starting spots. The spots are located along a straight line at
//positions xl, x2... xn(xi Foreach 'i', xi+l > xi.
//At a time only 'm' children are allowed to enter the race. Since the race track is for kids, they may run into each other while
//running. To prevent this, we want to choose the starting spots such that the minimum distance between any two ofthem is as
//large as possible. What is the largest minimum distance?
//The first line of input will contain the value of n, the number of starting spots.
//The second line of input will contain the n numbers denoting the location of each spot.
//The third line will contain the value of m, number ofchildren.
public class prob6 {
    static boolean ispossible(int [] arr,int kids, int dist)
    {
        int students = 1;
        int lastKidPlacedOn = arr[0];
        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i]-lastKidPlacedOn>=dist)
            {
                students++;
                lastKidPlacedOn = arr[i];
            }
        }
        return students >= kids;
    }
    static int largestMinDist(int [] arr,int kids)
    {
        int st = 1;
        int end = arr[arr.length-1];
        int ans = 0;
        while(st<=end)
        {
            int mid = st + (end-st)/2;
            if(ispossible(arr,kids,mid))
            {
                st = mid+1;
                ans = mid;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,9};
        int kids = 2;
        System.out.println(largestMinDist(arr,kids));
    }
}
