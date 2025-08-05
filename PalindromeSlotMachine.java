public class PalindromeSlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number) && isSumDivisibleBy3(number)) {
            System.out.println("Jackpot!");
        } else {
            System.out.println("Try Again");
        }

        scanner.close();
    }

    // Check if number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    // Check if sum of digits is divisible by 3
    public static boolean isSumDivisibleBy3(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 3 == 0;
    }
}
