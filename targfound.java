import java.util.*;

class targfound {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Input the target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        
        // Sort the array
        Arrays.sort(arr1);
        
        // Two-pointer approach to find the target sum
        int i = 0, j = n - 1;
        boolean found = false;
        
        while (i < j) {
            int sum = arr1[i] + arr1[j];
            if (sum == target) {
                found = true;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        
        // Output the result
        if (found) {
            System.out.println("Yes, there are numbers in the array that sum up to the target.");
        } else {
            System.out.println("No, there are no numbers in the array that sum up to the target.");
        }
        
        sc.close();
    }
}
