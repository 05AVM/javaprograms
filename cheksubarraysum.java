class cheksubarraysum {
    public static boolean  checkSubArraySum(int[] nums,int k){
        if(nums.length<2)
        return false;
        if(nums.length==2)
        {
            if((nums[0]+nums[1])%k == 0)
            return true;
        }
        int i=0;
        int j=i+1;
        while(i<nums.length-2){
            while (j<nums.length-1) {
                for(int a=i;a<j;a++){
                    if((nums[a]+nums[j])%k==0)
                    return true ;
                    
                }
                j++;
            }
            i++;
            //j=i+1;// Reset j for the next iteration of the outer loop
            
        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr={23,2,4,6,6};
        boolean  res =checkSubArraySum(arr,7);
        System.out.println("The result is : "+res);

    }

}


