public class consec {
    public static boolean threecons(int[] nums) {
        for (int var=0;var<nums.length-2;var++) {
            if (nums[var] % 2 != 0 && nums[var+1] % 2 != 0 && nums[var+2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean check;

        // Create an array and pass it to the threecons method
        int[] arr = {2,6,4,1};
        check = threecons(arr);

        // Print the result
        System.out.println("Result: " + check);
    }
}
