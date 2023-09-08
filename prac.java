import java.util.Scanner;
import java.util.Arrays;
class prac{
    public static void main(String[] args)
    { 
        Scanner sc =new Scanner(System.in);
        //System.out.println("Enter String:");
        //String str=sc.nextLine();
        //StringBuilder sbr=new StringBuilder(str);
        //System.out.print(sbr.reverse());
        int [] arr=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter Elemnet:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int start=0,tmp;
        int end=arr.length-1;
        while(start<end)
        {
            tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        System.out.println();
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int c=0;
        for (int i = arr.length-1; i>0; i--) {
            if(arr[i]==0){
                c++;
            }
            else{
                break;
            }
            
        }
        System.out.println(c);
        int j=arr.length-c-1;
        int k=0,tmp1;
        while(k<j)
        {
            tmp1=arr[k];
            arr[k]=arr[j];
            arr[j]=tmp1;
            k++;
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}