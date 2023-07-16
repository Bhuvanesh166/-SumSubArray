import java.util.Scanner;

public class SumSubArray {


    public static int findSumSubArray(int arr[],int size)
    {
        int p[]=new int[size];
        p[0]=arr[0];
        int sum=arr[0];
        for(int i=1;i<size;i++)
        {
            p[i]=arr[i]+p[i-1];
            sum+=p[i];
        }

        for(int i=1;i<size;i++)
        {
            for (int j=i;j<size;j++)
            {
                sum+=p[j]-p[i-1];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(findSumSubArray(arr,size));
    }

}