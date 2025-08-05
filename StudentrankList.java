public class StudentrankList {
    public static void main(String[] args) {
        int[] marks = {50, 80, 60};
        printRanks(marks);
    }

    public static void printRanks(int[] marks) {
        // Convert array to Integer list for sorting
        Integer[] sortedMarks = Arrays.stream(marks).boxed().toArray(Integer[]::new);

        // Sort in descending order
        Arrays.sort(sortedMarks, Collections.reverseOrder());

        // Print ranks
        for (int i = 0; i < sortedMarks.length; i++) {
            System.out.println((i + 1) + ". " + sortedMarks[i]);
        }
    }
}
