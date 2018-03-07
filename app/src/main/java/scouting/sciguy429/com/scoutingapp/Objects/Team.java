package scouting.sciguy429.com.scoutingapp.Objects;

public class Team {
    public int teamNumber;
    public String teamName;
    public float robotHeight;
    public boolean canClimb;
    public boolean canPlaceOnSwitch;
    public boolean canPlaceOnScale;
    public boolean canPlaceInPortal;
    public boolean canPlaceInAnyOrientation;
    public String driveTrainInfo;
    public String cubePlaceMethod;
    public String comments;

    public Team(int teamNumber, String teamName, float robotHeight, boolean canClimb, boolean canPlaceOnSwitch, boolean canPlaceOnScale, boolean canPlaceInPortal, boolean canPlaceInAnyOrientation, String driveTrainInfo, String cubePlaceMethod, String comments) {
        this.teamNumber = teamNumber;
        this.teamName = teamName;
        this.robotHeight = robotHeight;
        this.canClimb = canClimb;
        this.canPlaceOnSwitch = canPlaceOnSwitch;
        this.canPlaceOnScale = canPlaceOnScale;
        this.canPlaceInPortal = canPlaceInPortal;
        this.canPlaceInAnyOrientation = canPlaceInAnyOrientation;
        this.driveTrainInfo = driveTrainInfo;
        this.cubePlaceMethod = cubePlaceMethod;
        this.comments = comments;
    }
}
