import java.util.HashSet;

public class BusSeatAllotmentSimulator {
    public static void main(String[] args) {
        int[] preferredSeats = {3, 5, 12, 5, 11}; // sample input

        HashSet<Integer> bookedSeats = new HashSet<>();

        for (int seat : preferredSeats) {
            if (seat < 1 || seat > 40) {
                System.out.println("Seat " + seat + " Invalid Seat Number");
                continue;
            }

            if (!bookedSeats.contains(seat)) {
                bookedSeats.add(seat);
                System.out.println("Seat " + seat + " Booked");
            } else {
                System.out.println("Seat " + seat + " Already Booked");
            }
        }
    }
}
