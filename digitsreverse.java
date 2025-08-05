public class digitsreverse {


        public static void main(String[] args) {
            String input = "a1b2c3d4";
            String result = reverseOnlyDigits(input);
            System.out.println("Output: " + result);
        }

        public static String reverseOnlyDigits(String str) {
            char[] chars = str.toCharArray();
            StringBuilder digits = new StringBuilder();


            for (char c : chars) {
                if (Character.isDigit(c)) {
                    digits.append(c);
                }
            }


            digits.reverse();
            int digitIndex = 0;


            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    chars[i] = digits.charAt(digitIndex++);
                }
            }

            return new String(chars);
        }
    }


