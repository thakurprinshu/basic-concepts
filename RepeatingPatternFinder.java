public class RepeatingPatternFinder {
    public static void main(String[] args) {
        String input = "abcabcabc";
        String pattern = findRepeatingPattern(input);
        System.out.println("Smallest repeating pattern: " + pattern);
    }

    public static String findRepeatingPattern(String str) {
        int len = str.length();

        for (int i = 1; i <= len / 2; i++) {

            if (len % i == 0) {
                String sub = str.substring(0, i);
                StringBuilder sb = new StringBuilder();


                int repeat = len / i;
                for (int j = 0; j < repeat; j++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(str)) {
                    return sub;
                }
            }
        }

        return str;
    }
}
