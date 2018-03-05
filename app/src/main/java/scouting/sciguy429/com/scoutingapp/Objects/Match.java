package scouting.sciguy429.com.scoutingapp.Objects;

import android.os.Parcel;
import android.os.Parcelable;

public class Match implements Parcelable {
    public int matchNumber;
    public int teamR1;
    public int teamR2;
    public int teamR3;
    public int teamB1;
    public int teamB2;
    public int teamB3;
    public Match(int matchNumber, int teamR1, int teamR2, int teamR3, int teamB1, int teamB2, int teamB3) {
        this.matchNumber = matchNumber;
        this.teamR1 = teamR1;
        this.teamR2 = teamR2;
        this.teamR3 = teamR3;
        this.teamB1 = teamB1;
        this.teamB2 = teamB2;
        this.teamB3 = teamB3;
    }

    private Match(Parcel in) {
        matchNumber = in.readInt();
        teamR1 = in.readInt();
        teamR2 = in.readInt();
        teamR3 = in.readInt();
        teamB1 = in.readInt();
        teamB2 = in.readInt();
        teamB3 = in.readInt();
    }

    public static final Creator<Match> CREATOR = new Creator<Match>() {
        @Override
        public Match createFromParcel(Parcel in) {
            return new Match(in);
        }

        @Override
        public Match[] newArray(int size) {
            return new Match[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(matchNumber);
        parcel.writeInt(teamR1);
        parcel.writeInt(teamR2);
        parcel.writeInt(teamR3);
        parcel.writeInt(teamB1);
        parcel.writeInt(teamB2);
        parcel.writeInt(teamB3);
    }
}
