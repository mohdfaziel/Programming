package sorting;
//Given an array of positive and negative integers, segregate them in linear time and
//constant space. The output should print all negative numbers, followed by all positive
//numbers.
public class prob4 {
    static void ans(int [] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
      while(i<j)
      {
          while (arr[i]>0 && arr[j] < 0)
          {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
          }
          while(arr[i]<0)
          {
              i++;
          }
          while(arr[j]>0){
              j--;
          }
      }
    }

    public static void main(String[] args) {
        int [] arr = {-20,-4,-13,-5,7,11,19,13};
        ans(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
