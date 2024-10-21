package binarysearch;
//An aay a is a mountain if the following properties hold:
//• a. length >= 3
//• There exists some i with 0 < i < a. length
//— 1 such that:
//. < a[i —
//1] < a[i]
//a[0] < a[ll < .
//• a[i] > a[i + 1] >
//. > a[a. length
//Given a mountain aay a; return the index i such that a[Ø] < a[l] < .
//1] < a[i] > a[i + 1] > .
//. > a[a. length
//You must solve it in length)) time complexity.
//. < a[i
public class prob5 {
    static int ans (int [] a)
    {
        int n = a.length;
        if(n<3){ return -1;}
        int l = 0;
        int h = n-1;
        int ans = -1;
        while(l<=h)
        {
            int mid = l + (h-l)/2;
            if(a[mid]<=a[mid+1])
            {
                l = mid+1;
                ans = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {1,2,5,3,0};
        System.out.println(ans(a));
    }
}
