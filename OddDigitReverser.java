public class OddDigitReverser {
    public static void main(String[] args) {
        int number = 123456789;
        String reversedOdd = getOddDigitsInReverse(number);
        System.out.println("Output: " + reversedOdd);
    }

    public static String getOddDigitsInReverse(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) { // check for odd
                result.append(digit);
            }
            num /= 10;
        }

        return result.toString(); // already in reverse order
    }
}
