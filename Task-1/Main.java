public class Main {
    public static void main(String[] args) {
        Schedule league = new Schedule();


        Team teamA = new Team("Ahly");
        Team teamB = new Team("Zamalek");

       
        Player p1 = new Player("Mohamed", 10);
        Player p2 = new Player("Ahmed", 7);
        teamA.addPlayer(p1);
        teamB.addPlayer(p2);

        league.addTeam(teamA);
        league.addTeam(teamB);

      
        Match m1 = new Match(101, teamA, teamB);
        m1.addGoal(new Goal(101, p1, 15));
        m1.addGoal(new Goal(101, p1, 42)); 
        m1.addGoal(new Goal(101, p2, 88)); 

        league.addMatch(m1);

       
        league.displayLeagueTable();
        league.displayMatchDetails(m1);
    }
}