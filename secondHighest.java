public class secondHighest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 5, 2};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find first maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find second highest unique (less than max)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second highest number: " + secondMax);
    }
}
