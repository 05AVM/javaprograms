// to find minimum number of bottels for N gaallons of order..
//given bottles available are 1 Gallon, 5 Gallons, 7
//Gallons and 10 Gallons

import java.util.Scanner;

class gallons{

    public static int minbottles(int num){
       int count=0;
       while(num>0){
        if(num>=10) {
            count++;
            num-=10;
        }
        else if (num >=7)
        {
            count++;
            num-=7;
        }
        else if(num>=5)
        {
            count++;
            num-=5;
        }
        else
        {
            count++;
            num-=1;
        }
    }
    return count;
}
    

    
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Required Amount:");
        int N =sc.nextInt();
        System.out.println("Minimum no:of Bottles required is: "+minbottles(N));
}

}