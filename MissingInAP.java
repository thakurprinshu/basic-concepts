import java.util.*;
public class MissingInAP {
    public static void main(String[] args) {
        int[] arr = {2,  10, 14, 18}; // Output: 4 is missing
        findMissingNumber(arr);
    }

    public static void findMissingNumber(int[] arr) {
        Arrays.sort(arr);  // Important!

        int d = Math.min(arr[1] - arr[0], arr[2] - arr[1]); // Common difference guess

        for (int i = 1; i < arr.length; i++) {
            int expected = arr[i - 1] + d;
            if (arr[i] != expected) {
                System.out.println("🔍 Missing number is: " + expected);
                return;
            }
        }

        System.out.println("✅ No number is missing in the AP.");
    }
}
