public class consec {
    public static boolean threecons(int[] nums) {
        for (int var : nums) {
            if (var % 2 != 0 && var % 2 != 0 && var % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean check;

        // Create an array and pass it to the threecons method
        int[] arr = {2,4,6};
        check = threecons(arr);

        // Print the result
        System.out.println("Result: " + check);
    }
}
