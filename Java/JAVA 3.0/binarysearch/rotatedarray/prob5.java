package binarysearch.rotatedarray;
//You have 'n'(n <= IOA5) boxes of chocolate. Each box contains a[i] (a[i] <= 10000) chocolates. You need to distribute these boxes among 'm' students such
//that the maximum number of chocolates allocated to a student is minimum.
//One box will be allocated to exactly one student.
//a)
//All the boxes should be allocated.
//b)
//Each student has to be allocated at least one box.
//c)
//d)
//Allotment should be in contiguous order, for instance, a student cannot be allocated box I and box 3, skipping box 2.
//Calculate and return that minimum possible number.
//Assume that it is always possible to distribute the chocolates.
//The first line of input will contain the value of n, the number of boxes.
//The second line of input will contain the n numbers denoting the number of chocolates in each box.
//The third line will contain the m, number of students.
public class prob5 {
    static boolean isDivisionPossible(int[] arr,int m, int maxChoco)
    {

        int student = 1;
        int choco = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>maxChoco)
            {
                return false;
            }else if(choco + arr[i]<=maxChoco){
                choco +=arr[i];
            }else{
                student++;
                choco = arr[i];
            }
        }
        return student <= m;
    }
    static int minimalMaxima(int[] arr,int m)
    {
        if(arr.length<m) return -1;
        int s = 1;
        int e = (int)1e9;
        int minimumOfMax = 0;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(isDivisionPossible(arr,m,mid))
            {
                e = mid-1;
                minimumOfMax = mid;
            }else{
                s = mid+1;
            }
        }
        return minimumOfMax;
    }

    public static void main(String[] args) {
        int [] arr = {12,34,67,90};
        int m = 2;
        System.out.println(minimalMaxima(arr,m));
    }
}
