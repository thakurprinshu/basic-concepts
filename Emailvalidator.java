public class Emailvalidator {
        public static void main(String[] args) {
            System.out.println(isValidEmail("test@gmail.com"));   // true
            System.out.println(isValidEmail("invalid@com"));      // false
            System.out.println(isValidEmail("user123@yahoo.co")); // true
            System.out.println(isValidEmail("@example.com"));     // false
            System.out.println(isValidEmail("user@example."));    // false
        }

        public static boolean isValidEmail(String email) {

            if (email == null || email.length() < 5) return false;


            int atIndex = email.indexOf('@');
            if (atIndex == -1 || atIndex != email.lastIndexOf('@')) return false;


            if (atIndex == 0 || atIndex == email.length() - 1) return false;


            int dotIndex = email.indexOf('.', atIndex);
            if (dotIndex == -1) return false;


            if (dotIndex >= email.length() - 2) return false;

            return true;
        }
    }


