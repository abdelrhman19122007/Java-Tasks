import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players; // Composition
    private int points;
    private int goalsScored;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.points = 0;
        this.goalsScored = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int pts) {
        this.points += pts;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void addGoals(int goals) {
        this.goalsScored += goals;
    }
}