package scouting.sciguy429.com.scoutingapp.Objects;

public class MatchData {
    public int matchNumber;
    public int teamR1;
    public int teamR2;
    public int teamR3;
    public int teamB1;
    public int teamB2;
    public int teamB3;
    public MatchData(int matchNumber, int teamR1, int teamR2, int teamR3, int teamB1, int teamB2, int teamB3) {
        this.matchNumber = matchNumber;
        this.teamR1 = teamR1;
        this.teamR2 = teamR2;
        this.teamR3 = teamR3;
        this.teamB1 = teamB1;
        this.teamB2 = teamB2;
        this.teamB3 = teamB3;
    }
}
