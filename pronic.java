//2²+2=6(It is a pronic number)
import java.util.Scanner;
class pronic
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s,flag=0;
        System.out.print("Enter Number to be checked:");
        n=sc.nextInt();
        for(i=1;i<n/2;i++)
        {
            s=(i*i)+i;
            if (s==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1) System.out.println("It is a Pronic Number");
        else System.out.println("It is not a Pronic Number");

    }
}