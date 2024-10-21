package binarysearch;

//Given a non-negative integer x, return the square root of x rounded down to the nearest
//integer. The returned integer should be non-negative as well.
public class prob2 {
    static int sq(int num) { //linear approuch
        int x = 1;
        while (true) {
            if (x * x <= num) {
                x++;

            } else{
                break;
            }
        }
        return x-1;
    }
    static int sq2(int x)
    {
        int low = 0;
        int high = x;
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int val = mid*mid;
            if(val==x)
            {
                return mid;
            }else if(val<x)
            {
                low = mid+1;
                ans = mid;
            }else
            {
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(sq(25));
        System.out.println(sq2(2147395599));

    }
}
