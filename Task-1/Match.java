import java.util.ArrayList;

public class Match {
    private int matchId;
    private Team homeTeam; 
    private Team awayTeam; 
    private ArrayList<Goal> goals; 

    public Match(int matchId, Team homeTeam, Team awayTeam) {
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public int getMatchId() {
        return matchId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

  
    public int getHomeGoals() {
        int count = 0;
        for (Goal g : goals) {
            
            if (homeTeam.getPlayers().contains(g.getScorer())) {
                count++;
            }
        }
        return count;
    }

   
    public int getAwayGoals() {
        int count = 0;
        for (Goal g : goals) {
            if (awayTeam.getPlayers().contains(g.getScorer())) {
                count++;
            }
        }
        return count;
    }
}