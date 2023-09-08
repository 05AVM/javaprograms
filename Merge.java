class Merge{
    public static void main(String args[])
    {
      int []nums1={1,2,3,0,0,0};
      int []nums2={2,5,6};
        int i,j,k=0;
        int m=3,n=3;
        for(i=0;i<=(nums1.length-m);i++)
        {
            for(j=0;j<=n-1;j++)
            {
                for(k=j;k<=j;k++)
                {
                    nums1[k]=nums2[j];
                }

            }
            nums1[k++]=nums1[i];
        }
        for(i=0;i<nums1.length;i++)
        {
            System.out.print(nums1[i] + " " );
        }

    }
}