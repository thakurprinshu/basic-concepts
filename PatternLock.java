public class PatternLock {
    public static void main(String[] args) {
        final String correctPattern = "1234";
        final int maxAttempts = 5;
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean unlocked = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter 4-digit pattern attempt " + (attempts + 1) + ": ");
            String input = scanner.nextLine();

            if (input.equals(correctPattern)) {
                System.out.println("Success! Pattern matched.");
                unlocked = true;
                break;
            } else {
                System.out.println("Incorrect pattern.");
            }

            attempts++;
        }

        if (!unlocked) {
            System.out.println("System locked. Too many failed attempts.");
        }

        scanner.close();
    }
}
