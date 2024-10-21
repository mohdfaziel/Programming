import java.util.Scanner;

class twoDimensionalArray{
    Scanner sc = new Scanner(System.in);
    void accessing()
    {
        int[][] ages = new int[3][5];
        System.out.println("Enter the elements of 2D array");
        for(int i = 0; i<3;i++)
        {
            for(int j = 0; j<5 ; j++)
            {
                System.out.println("Enter value at index "+ i + "," + j);
                ages[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<3;i++)
        {
            for(int j = 0; j<5 ; j++)
            {
                System.out.println("value at index "+ i + "," + j);
                System.out.println(ages[i][j]);
            }
        }
    }
}
public class multi_array {
    public static void main(String[] args) {
        twoDimensionalArray obj = new twoDimensionalArray();
        obj.accessing();
        obj.sc.close();
    }
}
