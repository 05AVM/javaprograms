// BRUTE-FORCE APPROACH
/*class findmajority {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for (int j = i; j < n; j++) {
                if(arr[j]==arr[i]){
                    count++;
                    }
                    
                    if (count>n/2) {
                        System.out.print( arr[i]);
                        
                    }
                    else{
                        break;
                    }
                    
                    
                }
                
            

        
    }
    System.out.println(-1);
}
}*/

//Booyer -Moore Voting Algorithm:--

class findmajority {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,3,4,3,4,3};
        int n=arr.length;
        int num=0;int count=0;
        for (int i : arr) {
            if(count==0)
            num=i;//here we get the possible  majority element 
            count+=(i==num?1:-1);

        }
        count=0;
        //and here we check it if it has the count >n/2
        for (int i : arr){
            if(i==num)
            count++;

            if(count>=n/2)
            System.out.print("The majority element is "+num+" and it occurs more than half of the array");
        }
    }
            

        
            

        
    
    
}



