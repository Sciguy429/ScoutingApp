package scouting.sciguy429.com.scoutingapp.Objects;

public class Team {
    public Integer teamNumber;
    public String teamName;
    public Float robotHeight;
    public Boolean canClimb;
    public Boolean canPlaceOnSwitch;
    public Boolean canPlaceOnScale;
    public Boolean canPlaceInPortal;
    public Boolean canPlaceInAnyOrientation;
    public String driveTrainInfo;
    public String cubePlaceMethod;
    public String comments;

    public Team(Integer teamNumber, String teamName, Float robotHeight, Boolean canClimb, Boolean canPlaceOnSwitch, Boolean canPlaceOnScale, Boolean canPlaceInPortal, Boolean canPlaceInAnyOrientation, String driveTrainInfo, String cubePlaceMethod, String comments) {
        if (teamNumber == null) {
            this.teamNumber = 0;
        }
        else {
            this.teamNumber = teamNumber;
        }
        if (teamName == null) {
            this.teamName = "";
        }
        else {
            this.teamName = teamName;
        }
        if (robotHeight == null) {
            this.robotHeight = (float) 0;
        }
        else {
            this.robotHeight = robotHeight;
        }
        if (canClimb == null) {
            this.canClimb = false;
        }
        else {
            this.canClimb = canClimb;
        }
        if (canPlaceOnSwitch == null) {
            this.canPlaceOnSwitch = false;
        }
        else {
            this.canPlaceOnSwitch = canPlaceOnSwitch;
        }
        if (canPlaceOnScale == null) {
            this.canPlaceOnScale = false;
        }
        else {
            this.canPlaceOnScale = canPlaceOnScale;
        }
        if (canPlaceInPortal == null) {
            this.canPlaceInPortal = false;
        }
        else {
            this.canPlaceInPortal = canPlaceInPortal;
        }
        if (canPlaceInAnyOrientation == null) {
            this.canPlaceInAnyOrientation = false;
        }
        else {
            this.canPlaceInAnyOrientation = canPlaceInAnyOrientation;
        }
        if (driveTrainInfo == null) {
            this.driveTrainInfo = "";
        }
        else {
            this.driveTrainInfo = driveTrainInfo;
        }
        if (cubePlaceMethod == null) {
            this.cubePlaceMethod = "";
        }
        else {
            this.cubePlaceMethod = cubePlaceMethod;
        }
        if (comments == null) {
            this.comments = "";
        }
        else {
            this.comments = comments;
        }
    }
}
