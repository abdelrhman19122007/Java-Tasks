import java.util.ArrayList;

public class Schedule {
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    public Schedule() {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addMatch(Match match) {
        matches.add(match);
        processMatchResults(match);
    }

    
    private void processMatchResults(Match match) {
        int homeGoals = match.getHomeGoals();
        int awayGoals = match.getAwayGoals();

        match.getHomeTeam().addGoals(homeGoals);
        match.getAwayTeam().addGoals(awayGoals);

        if (homeGoals > awayGoals) {
            match.getHomeTeam().addPoints(3);
        } else if (awayGoals > homeGoals) {
            match.getAwayTeam().addPoints(3);
        } else {
            match.getHomeTeam().addPoints(1); 
            match.getAwayTeam().addPoints(1);
        }
    }

    
    public void displayLeagueTable() {
        System.out.println("\n=== SOCCER LEAGUE TABLE ===");
        System.out.printf("%-15s | %-6s | %-6s\n", "Team Name", "Goals", "Points");
        System.out.println("------------------------------------");
        for (Team team : teams) {
            System.out.printf("%-15s | %-6d | %-6d\n", team.getName(), team.getGoalsScored(), team.getPoints());
        }
    }

  
    public void displayMatchDetails(Match match) {
        System.out.println("\n=== MATCH DETAILS (ID: " + match.getMatchId() + ") ===");
        System.out.println(match.getHomeTeam().getName() + " " + match.getHomeGoals() + " - " + match.getAwayGoals() + " " + match.getAwayTeam().getName());
        System.out.println("Goal Scorers:");
        for (Goal g : match.getGoals()) {
            System.out.println("- " + g.getScorer().getName() + " at minute " + g.getMinute());
        }
    }
}