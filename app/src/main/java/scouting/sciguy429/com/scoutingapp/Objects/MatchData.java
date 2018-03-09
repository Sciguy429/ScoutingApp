package scouting.sciguy429.com.scoutingapp.Objects;

public class MatchData {
    public Integer matchNumber;
    public Integer teamNumber;
    public Integer matchTeamDesignation;
    public Integer cubesOnScale;
    public Integer cubesOnSwitch;
    public Integer cubesInPortal;
    public Boolean climb;
    public Boolean fell;
    public Integer fouls;
    public Integer cards;
    public String comment;

    public MatchData(Integer matchNumber, Integer teamNumber, Integer matchTeamDesignation, Integer cubesOnScale, Integer cubesOnSwitch, Integer cubesInPortal, Boolean climb, Boolean fell, Integer fouls, Integer cards, String comment) {
        if (matchNumber == null) {
            this.matchNumber = 0;
        }
        else {
            this.matchNumber = matchNumber;
        }
        if (teamNumber == null) {
            this.teamNumber = 0;
        }
        else  {
            this.teamNumber = teamNumber;
        }
        if (matchTeamDesignation == null) {
            this.matchTeamDesignation = 0;
        }
        else {
            this.matchTeamDesignation = matchTeamDesignation;
        }
        if (cubesOnScale == null) {
            this.cubesOnScale = 0;
        }
        else {
            this.cubesOnScale = cubesOnScale;
        }
        if (cubesOnSwitch == null) {
            this.cubesOnSwitch = 0;
        }
        else {
            this.cubesOnSwitch = cubesOnSwitch;
        }
        if (cubesInPortal == null) {
            this.cubesInPortal = 0;
        }
        else {
            this.cubesInPortal = cubesInPortal;
        }
        if (climb == null) {
            this.climb = false;
        }
        else {
            this.climb = climb;
        }
        if (fell == null) {
            this.fell = false;
        }
        else {
            this.fell = fell;
        }
        if (fouls == null) {
            this.fouls = 0;
        }
        else {
            this.fouls = fouls;
        }
        if (cards == null) {
            this.cards = 0;
        }
        else {
            this.cards = cards;
        }
        if (comment == null) {
            this.comment = "";
        }
        else {
            this.comment = comment;
        }
    }
}
