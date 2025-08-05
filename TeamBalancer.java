import java.util.ArrayList;
import java.util.List;

public class TeamBalancer {
    static int minDiff = Integer.MAX_VALUE;
    static List<Integer> bestTeamA = new ArrayList<>();
    static List<Integer> bestTeamB = new ArrayList<>();

    public static void main(String[] args) {
        int[] players = {10, 20, 30, 40};
        divideTeams(players);
        System.out.println("Team A: " + bestTeamA);
        System.out.println("Team B: " + bestTeamB);
    }

    public static void divideTeams(int[] players) {
        int n = players.length;
        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();
        backtrack(players, 0, teamA, teamB);
    }

    private static void backtrack(int[] players, int index, List<Integer> teamA, List<Integer> teamB) {
        if (index == players.length) {
            if (teamA.size() == teamB.size()) {
                int sumA = teamA.stream().mapToInt(Integer::intValue).sum();
                int sumB = teamB.stream().mapToInt(Integer::intValue).sum();
                int diff = Math.abs(sumA - sumB);

                if (diff < minDiff) {
                    minDiff = diff;
                    bestTeamA = new ArrayList<>(teamA);
                    bestTeamB = new ArrayList<>(teamB);
                }
            }
            return;
        }

        if (teamA.size() < players.length / 2) {
            teamA.add(players[index]);
            backtrack(players, index + 1, teamA, teamB);
            teamA.remove(teamA.size() - 1);
        }

        if (teamB.size() < players.length / 2) {
            teamB.add(players[index]);
            backtrack(players, index + 1, teamA, teamB);
            teamB.remove(teamB.size() - 1);
        }
    }
}
