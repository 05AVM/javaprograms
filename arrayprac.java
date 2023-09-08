public class arrayprac {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 2, 4, 1, 4};
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Reset count for each new element
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    count = count + 1;
                }
            }
            System.out.println("Count of " + nums[i] + " is: " + count);
        }
    }
}
