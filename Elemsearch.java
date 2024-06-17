import java.util.*;
class Elemsearch{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no: of Rows:");
        int n=sc.nextInt();
        System.out.print("Enter Number of Cols:");
        int m=sc.nextInt();
        
        int arr[][]= new int[n][m]; 
        System.out.println("Enter Elements in the mattrix"); //creating a 2D array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();   //taking elements from the user
            }
        }
        //Display the elemenst in the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Seaarching if the required element is there in the array
        System.out.print("Enter number to search :");
        int search=sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (arr[i][j] ==search)
                {
                found = true;
                break;
                }
            }
        }
        if (found==true)
            System.out.println("Element Present in the matrix");
        else
        System.out.println("Element not found in the matrix");
    }
   
}