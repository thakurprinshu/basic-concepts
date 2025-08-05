public class CustomPasswordEncoder {
    public static void main(String[] args) {
        String input = "Java1234";
        String encoded = encodePassword(input);
        System.out.println(encoded);
    }

    public static String encodePassword(String input) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result.append('@');
            } else if (Character.isDigit(ch) && (ch - '0') % 2 == 0) {
                result.append('*');
            } else {
                result.append(ch);
            }
        }
        return result.toString().toUpperCase();
    }
}
