
import java.util.Scanner;
class Question
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, World!");
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {   System.out.print("Enter Number:" );
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
        

    }
}