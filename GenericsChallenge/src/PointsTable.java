import java.util.List;

public class PointsTable<T extends Team>{
    private List<T> teams;

    public PointsTable(List<T> teams) {
        this.teams = teams;
    }
    public void printTeams() {
        teams.sort();
    }
}
