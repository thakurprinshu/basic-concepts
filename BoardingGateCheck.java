import java.util.Arrays;

public class BoardingGateCheck {
    public static void main(String[] args) {
        int[] actualOrder = {101, 103, 102, 104};
        int[] expectedOrder = actualOrder.clone();
        Arrays.sort(expectedOrder);

        int mismatchCount = 0;
        for (int i = 0; i < actualOrder.length; i++) {
            if (actualOrder[i] != expectedOrder[i]) {
                mismatchCount++;
            }
        }

        System.out.println("Number of passengers out of order: " + mismatchCount);
    }
}
