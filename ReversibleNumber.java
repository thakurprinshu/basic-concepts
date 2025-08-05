public class ReversibleNumber {
    public static void main(String[] args) {
        int num = 36;
        boolean result = isReversible(num);
        System.out.println("Is number reversible? " + result);
    }

    public static boolean isReversible(int num) {
        int reversed = reverse(num);
        int sum = num + reversed;

        // Check if all digits in the sum are odd
        while (sum > 0) {
            int digit = sum % 10;
            if (digit % 2 == 0) {
                return false; // Found even digit
            }
            sum /= 10;
        }
        return true;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
