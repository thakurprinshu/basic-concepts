//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ValidPuzzle {
    public static void main(String[] args) {
        String word = "abide";
        if (ValidPuzzle(word)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean ValidPuzzle(String word) {
        if (word.length() < 3) return false; // Must be long enough to have inner characters

        String vowels = "aeiouAEIOU";
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        // Check if the first and last characters are vowels
        if (!vowels.contains(first + "") || !vowels.contains(last + "")) {
            return false;
        }

        // Count vowels in the middle part
        int vowelCount = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        return vowelCount == 2;
    }
}



